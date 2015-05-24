package com.retrodough.rendering;

import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class Images {
	
	public static BufferedImage background;
	
	
	public void getImages(){
		try {
			background = ImageIO.read(getClass().getResourceAsStream("/resources/BlackBackground.png"));
			
			File fontFile = new File("fonts/VT323.ttf");
			Font font = Font.createFont(Font.TRUETYPE_FONT, fontFile);
			GraphicsEnvironment ge = GraphicsEnvironment
					.getLocalGraphicsEnvironment();
			ge.registerFont(font);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
