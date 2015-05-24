package com.retrodough.rendering;

import java.awt.BorderLayout;
import javax.swing.JFrame;

import com.retrodough.engine.Input;

public class Window extends JFrame{
	
	private static final long serialVersionUID = 1L;

	Input input = new Input();

	public static final int WIDTH = 800;
	public static final int HEIGHT = 450;

	private final String TITLE = "Digitized Alpha";

	public static Frame frame = new Frame();

	// Starts the window
	public void startWindow() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(WIDTH, HEIGHT);
		this.setLocationRelativeTo(null);
		this.setTitle(TITLE);
		this.add(frame, BorderLayout.CENTER);
		this.addKeyListener(input);
		this.addMouseListener(input);
		this.addMouseMotionListener(input);

		this.setVisible(true);
	}
	
}