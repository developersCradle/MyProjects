package com.bharath.order.bo;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.sql.SQLException;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.bharath.order.bo.exception.BOException;
import com.bharath.order.dao.OrderDAO;
import com.bharath.order.dto.Order;

public class OrderBOImplTest {

	private static final int ORDER_ID = 123;

	//1.STUB OUT DEPENCIES
	@Mock
	OrderDAO dao;

	private OrderBOImpl bo;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this); //Scans this and inits mocks
		bo = new OrderBOImpl();
		bo.setDao(dao);
	}

	@Test
	public void placeOrder_Should_Create_An_Order() throws SQLException, BOException {

		Order order = new Order();

		//2. SETTING EXPECTATIONS 
		//when(dao.create(order)).thenReturn(new Integer(1)); // mock out method call, we want to return result of one
		when(dao.create(any(Order.class))).thenReturn(new Integer(1)); // OR using Mockito matchers

		boolean result = bo.placeOrder(order);

		//3. VERIFY RESULT
		assertTrue(result);
		verify(dao).create(order);//mockito class, § if method is called once
		//verify(dao, times(2)).create(order); is invoked 2 times?

	}

	@Test
	public void placeOrder_Should_not_Create_An_Order() throws SQLException, BOException {
		Order order = new Order();

		//2. SETTING EXPECTATIONS 
		when(dao.create(order)).thenReturn(new Integer(0)); // mock out method call, we want to return result of zero
		boolean result = bo.placeOrder(order);

		//3. VERIFY 
		assertFalse(result);
		verify(dao).create(order);//mockito class, § if method is called once

	}

	@Test(expected = BOException.class)
	public void placeOrder_Should_Throw_BOException() throws SQLException, BOException {
		Order order = new Order();

		when(dao.create(order)).thenThrow(SQLException.class);
		bo.placeOrder(order);

	}

	@Test
	public void cancelOrder_Should_Cancel_The_Order() throws SQLException, BOException {
		Order order = new Order();
		when(dao.read(ORDER_ID)).thenReturn(order);
		when(dao.update(order)).thenReturn(1);

		boolean result = bo.cancelOrder(ORDER_ID);

		assertTrue(result);
		verify(dao).read(ORDER_ID);
		verify(dao).update(order);
	}

	@Test
	public void cancelOrder_Should_not_Cancel_The_Order() throws SQLException, BOException {
		Order order = new Order();
		when(dao.read(ORDER_ID)).thenReturn(order);
		when(dao.update(order)).thenReturn(0);

		boolean result = bo.cancelOrder(ORDER_ID);

		assertFalse(result);
		verify(dao).read(123);
		verify(dao).update(order);
	}

	@Test(expected = BOException.class)
	public void cancelOrder_ShouldThrowBOExceptionOnRead() throws SQLException, BOException {
		when(dao.read(ORDER_ID)).thenThrow(SQLException.class);

		bo.cancelOrder(ORDER_ID);

	}

	@Test(expected = BOException.class)
	public void cancelOrder_Should_Throw_A_BOExceptionOnUpdate() throws SQLException, BOException {
		Order order = new Order();
		when(dao.read(ORDER_ID)).thenReturn(order);
		when(dao.update(order)).thenThrow(SQLException.class);
		bo.cancelOrder(ORDER_ID);
	}

	@Test
	public void deleteOrder_Deletes_The_Order() throws SQLException, BOException {
		when(dao.delete(ORDER_ID)).thenReturn(1);
		boolean result = bo.deleteOrder(ORDER_ID);

		assertTrue(result);
		verify(dao).delete(ORDER_ID);
	}
}
