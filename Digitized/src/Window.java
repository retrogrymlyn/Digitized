import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class Window implements KeyListener {
	private JFrame window = new JFrame();

	public boolean TitleScreen = false;

	private final int WIDTH = 800;
	private final int HEIGHT = 450;

	private final String TITLE = "Digitized Alpha";

	public Frame frame = new Frame();

	// Starts the window
	public void startWindow() {
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(WIDTH, HEIGHT);
		window.setLocationRelativeTo(null);
		window.setTitle(TITLE);
		window.add(frame, BorderLayout.CENTER);
		window.addKeyListener(this);

		window.setVisible(true);
	}

	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() != KeyEvent.VK_SHIFT	&& e.getKeyCode() != KeyEvent.VK_BACK_SPACE && e.getKeyCode() != KeyEvent.VK_ENTER) {
			Main.window.frame.UserInput += e.getKeyChar();
		}
		if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE && Main.window.frame.UserInput.length() > 0) {
			Main.window.frame.UserInput = Main.window.frame.UserInput
					.substring(0, Main.window.frame.UserInput.length() - 1);
		}
		if(e.getKeyCode() == KeyEvent.VK_ENTER){
			
		}
	}

	public void keyReleased(KeyEvent e) {

	}

	public void keyTyped(KeyEvent e) {

	}
}
