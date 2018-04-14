package chapter11;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
/*
 * After this you could parse xml data using DOM or many other ways parse xml in Java
 */
public class Internet {

	private static final String FLOWERS_FEED = 
			"http://services.hanselandpetal.com/feeds/flowers.xml";
	
	public static void main(String[] args) throws IOException 
	{
		//We seperate variable declaration here so we can reference them inside finally scope
		
		InputStream stream = null;
		BufferedInputStream buf = null;
		
		try 
		{
			URL url = new URL(FLOWERS_FEED); 
			stream = url.openStream();
			
			buf = new BufferedInputStream(stream);
			
			StringBuilder  sb = new StringBuilder(); //String builder collects data from request

			while(true)
			{
				int data = buf.read(); // returns -1 -> read failed, read was succesfull -> return numeric value
				
				if (data == -1) //read failed
				{
					break;
				}
				else
				{
					sb.append((char)data); //We append value to StringBuilder
				}
			}
			
			System.out.println(sb);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		} 
		finally //We need close our stream explicit -> Streams implements AutoClosable interface, which allows to close them 
		{
			stream.close();//coz we are not using try-with-resources we need to close them manually
			buf.close();
		}
	}

}
