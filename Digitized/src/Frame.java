import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JPanel;


public class Frame extends JPanel{
	private static final long serialVersionUID = 1L;

	private Image img;
	private Graphics doubleB;
	
	private Image Background;
	
	public int second = 0;
	
	//gathers any Images and stores them in variables.
	public void gatherImages(){
		Background = Toolkit.getDefaultToolkit().getImage("resources/BlackBackground.png");
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
		g.drawImage(Background, 0, 0, getWidth(), getHeight(), this);
		g.setColor(Color.white);
		g.setFont(new Font("TimesRoman",Font.PLAIN, getHeight()/10));
		if(second == 1){
			g.drawString("Digitized_", getWidth()/70, getHeight()/10);
		}else{
			g.drawString("Digitized", getWidth()/70, getHeight()/10);
		}
	}
	
}
