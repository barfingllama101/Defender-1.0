package com.mime.game;

import java.awt.event.KeyEvent;
import com.mime.game.input.Controller;
import com.mime.game.*;
import com.mime.game.graphics.*;

public class Game  {
public int time;
public Controller controls;

public Game(){
	controls = new Controller();
	
}
public void tick(boolean[] key){
	time++;
	boolean forward = key[KeyEvent.VK_W];
	boolean back = key[KeyEvent.VK_S];
	boolean left = key[KeyEvent.VK_A];
	boolean right = key[KeyEvent.VK_D];
	boolean turnLeft = key[KeyEvent.VK_LEFT];
	boolean  turnRight = key[KeyEvent.VK_RIGHT];
	
	controls.tick(forward, back, left, right, turnLeft, turnRight);
		
}
}
