import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JPanel;


public class Frame extends JPanel{
	private static final long serialVersionUID = 1L;

	private Image img;
	
	public void backgroundPanel(){
		img = Toolkit.getDefaultToolkit().createImage("resources/TestBackground.png");
	}
	
	public void paintComponent(Graphics g){
		g.drawImage(img, 0, 0, getWidth(), getHeight(), null);
	}
	
}