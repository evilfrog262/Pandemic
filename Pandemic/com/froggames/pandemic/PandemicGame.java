package com.froggames.pandemic;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.*;

public class PandemicGame {

	public static void main(String[] args) {
		startDisplay();
		// prompt for user information
		
		// display game board graphics
		
		// create cards
			// have associated image, color, city node
		
		// create decks
			// have array list or linked list of cards (Probably AL)
			// have shuffle or randomization
		
		// create world map game board object
			// hashmaps of cities to diseases, players, and research stations
		
		// create city node objects and arrange in a map
			// know what is adjacent to what
			// know what color/disease type each node is
		
		// create player objects and assign roles
			// methods for all actions
			// status -- is it my turn, what city am I in
		
		// create disease objects
			// number cubes remaining
			// color or type
			// status -- cured or eradicated	

	}
	
	private static void startDisplay() {
		try {
			Display.setDisplayMode(new DisplayMode(Utils.DISPLAY_WIDTH, Utils.DISPLAY_HEIGHT));
			Display.create();
		} catch (LWJGLException e) {
			e.printStackTrace();
		}
		
		// init openGL
		
		while (!Display.isCloseRequested()) {
			// render openGL
			renderSquare();
			GL11.glFlush();
			
			Display.update();
		}
		Display.destroy();
	}
	
	private static void renderSquare() {
		
	}

}
