
public class Stars3D {
	
	private final float m_speed;
	private final float m_spread;
	
	private final float m_starX[];
	private final float m_starY[];
	private final float m_starZ[];
	
	public Stars3D(int numStars, float spread, float speed) {
		
		m_speed = speed;
		m_spread = spread;
		
		m_starX = new float[numStars];
		m_starY = new float[numStars];
		m_starZ = new float[numStars];
		
		
		for (int i = 0; i < m_starX.length; i++) {
			initStar(i);
		}
	}
	/*
	 * 3D COORINATE SYSTEM
	 * -1 IN X -> left of screen
	 * +1 IN X -> right of screen
	 * 
	 * -1 IN Y -> top of screen
	 * +1 IN Y -> bottom of screen
	 * 
	 */
	private void initStar(int i)
	{
		m_starX[i] = 2 *((float)Math.random() - 0.5f) * m_spread;
		m_starY[i] = 2 *((float)Math.random() - 0.5f) * m_spread;
		m_starZ[i] = ((float)Math.random() + 0.000001f) * m_spread;
	}
	
	public void UpdateAndRender(Bitmap target, float delta)
	{
		target.Clear((byte)0x00);
		
		for (int i = 0; i < m_starX.length; i++) {
//			m.star
		}
		
		
		
	}
}
