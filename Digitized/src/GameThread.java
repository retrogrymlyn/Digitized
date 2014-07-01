
public class GameThread implements Runnable {
	
	Thread thread = new Thread(this);
	
	int second = 0;
	
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
			second += 1;
			if(second >= 29){
				second = 0;
				if(Main.window.frame.second == 0){
					Main.window.frame.second = 1;
				}else{
					Main.window.frame.second = 0;
				}
			}
			try {
				Thread.sleep(17);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
