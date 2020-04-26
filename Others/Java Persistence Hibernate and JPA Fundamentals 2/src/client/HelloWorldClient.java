package client;

import org.hibernate.Session;
import org.hibernate.Transaction;

import entity.Address;
import entity.Guide;
import entity.Message;
import entity.Person;
import entity.Student;
import util.HibernateUtil;


public class HelloWorldClient {
	public static void main(String[] args) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction txn = session.getTransaction();
		try {
			txn.begin();
			
			/*
			//Creating object
			Message msg = new Message();
//			msg.setText("Hello Automatic Dirty NOT Checking");
//			session.save(msg);

			//Finding objects
			msg = (Message) session.get(Message.class, 10L);
			
			//Updating objects
			msg = (Message) session.get(Message.class, 10L);
			msg.setText("Hello Automatic Dirty Checking");
			
			//Deleting objects
			 msg = (Message) session.get(Message.class, 10L);  
			session.delete(msg);
			
			*/
			
//			Person person = new Person("nimi", new Address("katu1", "kaupunki", "90100"));
//
//			session.save(person);
//    
//			Person personGet = (Person) session.get(Person.class, 1L);
//			personGet.getAddress();
//			
    		
			

			Guide guide = new Guide("2000MO10789", "Mike Lawson", 1000);
			Student student = new Student("2014JT50123", "John Smith", guide);

			session.save(guide);
			session.save(student);
    
			txn.commit();
		}	catch(Exception e) {
    			if(txn != null) { txn.rollback(); }
    			e.printStackTrace();
		}	finally {
				if(session != null) { session.close(); }
		}
	
	}
}

