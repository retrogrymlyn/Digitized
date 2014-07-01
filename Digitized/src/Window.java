import javax.swing.JFrame;


public class Window {
	private JFrame window = new JFrame();
	
	private final int WIDTH = 800;
	private final int HEIGHT = 450;

	private final String TITLE = "Digitized Alpha";
	
	public void startWindow(){
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(WIDTH, HEIGHT);
		window.setLocationRelativeTo(null);
		window.setTitle(TITLE);
		
		window.setVisible(true);
	}
}