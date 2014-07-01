import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JPanel;


public class Frame extends JPanel{
	private static final long serialVersionUID = 1L;

	private Image img;
	private Graphics doubleB;
	
	private Image Background;
	
	//gathers any Images and stores them in variables.
	public void backgroundPanel(){
		Background = Toolkit.getDefaultToolkit().getImage("resources/TestBackground.png");
	}
	
	//The double buffer.
	public void update(Graphics g){
		if(img == null){
			img = createImage(this.getSize().width, this.getSize().height);
			doubleB = img.getGraphics();
		}
		
		doubleB.setColor(getBackground());
		doubleB.fillRect(0, 0, this.getSize().width, this.getSize().height);
		
		doubleB.setColor(getForeground());
		paint(doubleB);
		
		g.drawImage(img, 0, 0, this);
	}
	
	//The What actually paints.
	public void paint(Graphics g){
		backgroundPanel();
		g.drawImage(Background, 0, 0, getWidth(), getHeight(), this);
	}
	
}
