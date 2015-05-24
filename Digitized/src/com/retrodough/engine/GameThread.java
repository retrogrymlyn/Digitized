package com.retrodough.engine;

import com.retrodough.rendering.Window;


public class GameThread implements Runnable {
	
	public static int animation = 0;
	
	//The main game loop.
	public void run() {
		long lastTime = System.nanoTime();
		double delta = 0;
		double ns = 1000000000.0 / 60.0;
		long timer = System.currentTimeMillis();
		int frames = 0;
		int updates = 0;
		while(true){
			long now = System.nanoTime();
			delta += (now - lastTime) / ns;
			lastTime = now;
			if (delta >= 1){
				if (animation >= 59){
					animation = 0;
				}else{
					animation ++;
				}
				//Data that needs to be updated
				
				updates++;
				delta--;
			}
			Window.frame.repaint();
			frames++;
			if(System.currentTimeMillis() - timer > 1000){
				timer += 1000;
				System.out.println(updates + ":tps "+frames+":fps");
				updates = 0;
				frames = 0;
			}
		}
	}

}
