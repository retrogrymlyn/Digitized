package com.retrodough.engine;

import com.retrodough.rendering.Frame;
import com.retrodough.rendering.Images;
import com.retrodough.rendering.Window;



public class Main {
	static Window window = new Window();
	static GameThread tickThread = new GameThread();
	static Images images = new Images();

	public static void main(String[] args) {
		images.getImages();
		Frame.screenType = Frame.TITLE_SCREEN;
		new Thread(tickThread).start();
		window.startWindow();
	}

}
