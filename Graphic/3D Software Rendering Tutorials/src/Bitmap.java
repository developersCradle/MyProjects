import java.util.Arrays;

/**
 * Stores a set of pixels in a component-based format.
 * The component-based format stores colors as follows:
 *
 * Byte 0: Alpha
 * Byte 1: Blue 
 * Byte 2: Green
 * Byte 3: Red
 *
 * This format is fast, compact, and ideal for software rendering.
 * It has the following key advantages:
 * - Entire images can be copied to the screen with a single call to
 * System.arrayCopy. (If the screen is not in ABGR pixel format, it requires
 * some conversion. However, the conversion is typically quick and simple).
 * - Per component operations, such as  lighting, can be performed cheaply without any 
 * pixel format converison.
 *
 * This class is primarily intended to be a high-performance image storing 
 * facility for software rendering. As such, there are points where ease of 
 * use is compromised for the sake of performance. If you need to store and 
 * use images outside of a software renderer, it is recommended that you use 
 * Java's standard image classes instead.
 */
public class Bitmap {
	

	private final int m_width;
	private final int m_height;
	private final byte m_components[];//COLOR components

	
	public Bitmap(int width, int height) {
		m_width = width;
		m_height = height;
		m_components = new byte[width * height * 4];
	}
	
	
	
	public int getWidth() {
		return m_width;
	}

	public int getHeight() {
		return m_height;
	}

	
	/*
	 * Clears whole bitmap to specific shade of gray
	 */
	public void Clear(byte shade)
	{
		Arrays.fill(m_components, shade);
	}
	
	/*
	 * Sets 1 pixel on bitmap to particular ARGB value
	 */
	public void DrawPixels(int x, int y, byte a, byte b, byte g, byte r)
	{
		int index = (x + y * m_width) * 4;//Index of particular pixel
		m_components[index] = a;	//Alpha is stored at first element
		m_components[index + 1] = b;//Blue is stored at second element
		m_components[index + 2] = g;
		m_components[index + 3] = r;
	}
	
	public void CopyToByteArray(byte[] dest)
	{
		for (int i = 0; i < m_width * m_height; i++) {
			
			dest[i * 3    ] = m_components[i * 4 + 1];
			dest[i * 3 + 1] = m_components[i * 4 + 2];
			dest[i * 3 + 2] = m_components[i * 4 + 3];
			
			/*
			 * We are copying to bgr destination
			 */
		}
	}
	
	
	
	
	/*
	 * Coz we are using Java, we need this. Java presents pixel in Integer[] and we are char[] 
	 *UPDATE
	 *Java allows specify what pixels format it uses internally
	 *
	 */
///////////////NOT NEEDED ANYMORE///////////////
//	public void CopyToIntArray(int[] dest)
//	{
//		for (int i = 0; i < m_width * m_height; i++) {
//			
//			/* Left-shift operator <<
//			 * 	- Left shifts left operand by # bits specified on right
//			 * Exmample.
//			 * 00000110 = 6
//			 * - 6<<1
//			 * 00001100 = 12
//			 */
//			int a = (int)(m_components[i * 4    ]  << 24);
//			int r = (int)(m_components[i * 4 + 1]) << 16;
//			int g = (int)(m_components[i * 4 + 2]) << 8;
//			int b = (int)(m_components[i * 4 + 3]);
//			
//			/* 8 bits in a byte
//			 * character is 1 byte in JAVA
//			 * integer   is 4 bytes in JAVA
//			 */
//			
//			/*
//			 * Combining to one Integer
//			 */
//			
//			/*
//			 * Bitwise OR |
//			 * 	-Returns 1 if either of inputs bits is 1
//			 *  00000001
//			 *  00000011
//			 *  --------
//			 *  00000011 <- Comes, its like merging
//			 */
//		
//			
//			dest[i] = a | r | g | b;
//		}
//	}
}
