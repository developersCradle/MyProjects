package chapter12;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
/*
 * Jar files contains one or more Java classes pre-compiled
 * You can run jar file as complete Java application using tool called "jar"
 * 
 */
public class JarFile 
{
	private static final String FLOWERS_FEED = 
			"http://services.hanselandpetal.com/feeds/flowers.xml";
	
	public static void main(String[] args) throws IOException
	{
		
				InputStream stream = null;
				BufferedInputStream buf = null;
				
				try 
				{
					URL url = new URL(FLOWERS_FEED); 
					stream = url.openStream();
					
					buf = new BufferedInputStream(stream);
					
					StringBuilder  sb = new StringBuilder();

					while(true)
					{
						int data = buf.read(); 
						
						if (data == -1) 
						{
							break;
						}
						else
						{
							sb.append((char)data); 
						}
					}
					
					System.out.println(sb);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				} 
				finally 
				{
					stream.close();
					buf.close();
				}
			}

	}


