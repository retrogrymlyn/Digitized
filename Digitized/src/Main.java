public class Main {
	
	static Window window = new Window();
	static GameThread thread = new GameThread();

	public static void main(String[] args) {
		thread.start();
		window.startWindow();
	}

}
