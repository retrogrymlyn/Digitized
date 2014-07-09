import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import javax.swing.JPanel;

public class Frame extends JPanel {
	private static final long serialVersionUID = 1L;

	private Image img;
	private Graphics doubleB;

	private Image Background;

	public int halfSecond = 0;
	
	public String UserInput = "";
	
	public boolean UnknownCommand = false;

	// gathers any Images and stores them in variables.
	public void gatherImages() {
		Background = Toolkit.getDefaultToolkit().getImage(
				"resources/BlackBackground.png");
		try {
			File fontFile = new File("resources/VT323.ttf");
			Font font = Font.createFont(Font.TRUETYPE_FONT, fontFile);
			GraphicsEnvironment ge = GraphicsEnvironment
					.getLocalGraphicsEnvironment();
			ge.registerFont(font);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	// The double buffer.
	public void update(Graphics g) {
		if (img == null) {
			img = createImage(this.getSize().width, this.getSize().height);
			doubleB = img.getGraphics();
		}

		doubleB.setColor(getBackground());
		doubleB.fillRect(0, 0, this.getSize().width, this.getSize().height);

		doubleB.setColor(getForeground());
		paint(doubleB);

		g.drawImage(img, 0, 0, this);
	}

	// What actually paints.
	public void paint(Graphics g) {
		//If TitleScreen is true, renders the title screen.
		if (Main.window.TitleScreen == true) {
			g.drawImage(Background, 0, 0, getWidth(), getHeight(), this);
			g.setColor(Color.white);
			g.setFont(new Font("VT323", Font.PLAIN, getHeight() / 12));
			
			if (halfSecond == 1) {
				g.drawString("Digitized: " + UserInput + "_", getWidth() / 70, getHeight() / 12);
			} else {
				g.drawString("Digitized: " + UserInput, getWidth() / 70, getHeight() / 12);
			}
			
			if(UnknownCommand){
				g.drawString("Unknown command", getWidth()/70, (getHeight()/12)*2);
			}
			
			g.drawString("Type help for more info", getWidth()/70, getHeight() - (getHeight()/20));
		}
	}
}
