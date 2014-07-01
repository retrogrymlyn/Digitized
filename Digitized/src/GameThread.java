
public class GameThread implements Runnable {
	
	Thread thread = new Thread(this);
	
	//Starts the thread.
	public void start(){
		if(!thread.isAlive()){
			thread.start();
		}
	}
	
	//The main game loop.
	public void run() {
		while (true){
			Main.window.frame.repaint();
			try {
				Thread.sleep(17);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
