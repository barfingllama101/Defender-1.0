package com.mime.game.graphics;

import com.mime.game.Display;


public class Render {
	public final int width;
	public final int height;
	public final int[] pixels;
	
	private Display display;
	
	public Render(int width, int height){
		this.width = height;
		this.height = height;
		pixels = new int[width * height];
		
	
	}
	
	public void draw(Render render, int xOffset, int yOffset ){
		for (int y = 0; y<render.height; y++){
			int yPix = y+yOffset;
			for (int x = 0; x<render.width; x++){
				int xPix = x+xOffset;
			
			if (yPix < 0 || yPix >= display.HEIGHT){
			continue;
			}
			if (xPix <0 || xPix >= display.WIDTH){
				
				continue;
			}
			
			int alpha= render.pixels[x+y*render.width];
			if (alpha > 0){
				pixels[xPix+yPix*width] = alpha;
			}
		}
		}
		}
	

	public Display getDisplay() {
		return display;
	}

	public void setDisplay(Display display) {
		this.display = display;
	}
}
