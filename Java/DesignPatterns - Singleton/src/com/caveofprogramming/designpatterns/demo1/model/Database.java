package com.caveofprogramming.designpatterns.demo1.model;

/*
 * 1 connection to Database per application
 */


public class Database {

	private static Database instance = new Database();
	
	
	//JAVA allows private constructors
	//private only here instation is allowed
	
	private Database() {
		
	}
	
	public static Database getInstance()
	{
		return instance;
	}
	
	// old days using Singleton pattern
	private static Database instanceOld;

	/*
	 * Called lazy instantiation, lazy coz act of instantiation happen in last possible moment
	 */
	// - Was obsolete coz not thread safe
	public static Database getDatabaseInstanceOld()
	{
		if (instanceOld == null) {
			instanceOld = new Database();
		}
		
		return instanceOld;
	}
	
	public void connect()
	{
		System.out.println("Connected to database.");
	}
	public void disconeced()
	{
		System.out.println("Disconnected.");
	}
}
