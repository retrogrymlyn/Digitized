
public class GameThread implements Runnable {
	
	Thread thread = new Thread(this);
	
	int timer = 0;
	int CustomTimer = 0;
	boolean customTiming = false;
	
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
			timer += 1;
			if(customTiming){
				CustomTimer += 1;
			}
			
			
			//second
			if(timer % 58 == 0){
				timer = 0;
			}
			
			//half second
			if(timer % 29 == 0){
				if(Main.window.frame.halfSecond == 0){
					Main.window.frame.halfSecond = 1;
				}else{
					Main.window.frame.halfSecond = 0;
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
