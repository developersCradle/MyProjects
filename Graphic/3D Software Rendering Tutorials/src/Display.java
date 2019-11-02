import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;

import javax.swing.JFrame;

/*
 * In Java render image or stuff like that, you do in CANVAS
 */
public class Display extends Canvas{

	
		/** The window being used for display */
		private final JFrame         m_frame;
		/** The bitmap representing the final image to display */
		private final Bitmap         m_frameBuffer;
		/** Used to display the framebuffer in the window */
		private final BufferedImage  m_displayImage;
		/** The pixels of the display image, as an array of byte components */
		private final byte[]         m_displayComponents;
		/** The buffers in the Canvas */
		private final BufferStrategy m_bufferStrategy;
		/** A graphics object that can draw into the Canvas's buffers */
		private final Graphics       m_graphics;
	
	public Display(int width, int height, String title) {
		Dimension size = new Dimension(width, height);
		setPreferredSize(size);
		setMinimumSize(size);
		setMaximumSize(size);
		
		m_frameBuffer = new Bitmap(width, height);
		/*
		 * All pixels in m_displayImage is being stored as groups of 3 bytes BGR
		 */
		m_displayImage = new BufferedImage(width, height, BufferedImage.TYPE_3BYTE_BGR);
		
		
		/*
		 * now we need direct access to bytes in display image
		 */
		m_displayComponents = ((DataBufferByte)m_displayImage.getRaster().getDataBuffer()).getData();
		
		m_frameBuffer.Clear((byte)0x80);//Gray 
		m_frameBuffer.DrawPixels(100, 100, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0xFF);
		
		/*
		 * BufferedImage.TYPE_3BYTE_BGR
		 *  - Specifies type of data Java uses for pixels
		 */
		
		
		m_frame = new JFrame();
		m_frame.add(this);
		m_frame.setResizable(false);
		m_frame.pack();
		m_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		m_frame.setLocationRelativeTo(null);
		m_frame.setTitle(title);
		m_frame.setVisible(true);
		
		
		/*
		 * Manually allocating buffer where we can draw in 
		 */
		
		createBufferStrategy(1);
		m_bufferStrategy = getBufferStrategy();
		m_graphics = m_bufferStrategy.getDrawGraphics();//Graphics object 
		
	}	
	
	public Bitmap GetFrameBuffer() {
		return m_frameBuffer;
	}
	
	public void swapBuffers()
	{
		m_frameBuffer.CopyToByteArray(m_displayComponents);
		//We copy our Bitmap into displayComponents
		m_graphics.drawImage(m_displayImage, 0, 0,
				m_frameBuffer.getWidth(), m_frameBuffer.getHeight(), null);
		m_bufferStrategy.show();
		
	}


	
}
