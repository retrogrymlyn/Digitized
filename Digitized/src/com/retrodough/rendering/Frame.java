package com.retrodough.rendering;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

import com.retrodough.engine.GameThread;

public class Frame extends JPanel {
	private static final long serialVersionUID = 1L;

	BufferedImage img = new BufferedImage(1980,1020,BufferedImage.TYPE_INT_ARGB);
	
	public static String UserInput = "";
	
	public static int screenType = 0;
	public static final int TITLE_SCREEN = 1,HELP_SCREEN = 2;
	public static boolean UnknownCommand = false;
	
	int w = Window.WIDTH;
	int h = Window.HEIGHT;
	int yOffset = w/70;
	int xOffset = h/12;
	int fontScale = w/25;
	
	// What actually paints.
	public void paint(Graphics g) {
		w = this.getWidth();
		h = this.getHeight();
		yOffset = w/70;
		xOffset = h/12;
		fontScale = w/25;
		
		Graphics f = img.getGraphics();
		switch(screenType){
			case TITLE_SCREEN:
				TitleScreen(f); break;
			case HELP_SCREEN:
				HelpScreen(f); break;
			default:
				System.out.println("Unkown screen type!");
		}
		g.drawImage(img, 0, 0, this);
	}
	
	//Title screen
	public void TitleScreen(Graphics g){
		
		g.setColor(new Color(0xff000000));
		g.fillRect(0,0,this.getWidth(),this.getHeight());
		g.setColor(Color.white);
		g.setFont(new Font("VT323", Font.PLAIN, fontScale));
		
		if (GameThread.animation > 30) {
			g.drawString("Digitized: " + UserInput + "_", yOffset, xOffset);
		} else {
			g.drawString("Digitized: " + UserInput, yOffset, xOffset);
		}
		
		if(UnknownCommand){
			g.drawString("Unknown command", yOffset, xOffset*2);
		}
		g.drawString("Type help for more info", yOffset, (int) (xOffset * 11.5));
	}
	
	//Help screen
	public void HelpScreen(Graphics g){
		g.setColor(new Color(0xff000000));
		g.fillRect(0,0,this.getWidth(),this.getHeight());
		g.setColor(Color.white);
		g.setFont(new Font("VT323", Font.PLAIN, fontScale));
		
	}
	
}
