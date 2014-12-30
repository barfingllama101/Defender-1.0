package com.mime.game.input;

public class Controller {

	public double x, z, rotation, xa, za, rotationa;
	
	public void tick(boolean forward, boolean back, boolean left,boolean right, boolean turnLeft, boolean turnRight){
	double rotationSpeed = 0.025;
	double walkSpeed = 1;
	double xMove = 0;
	double zMove = 0;
	
	if(forward){
		zMove++;
	}	if(back){
		zMove--;
	}	if(left){
		xMove--;
		System.out.println("left");
	}	if(right){
		xMove++;
		System.out.println("right");
	}	if(turnLeft){
		rotationa -= rotationSpeed;
		System.out.println("turnleft");
	}	if(turnRight){
		rotationa += rotationSpeed;
		System.out.println("turnRight");
	}
	xa += (xMove * Math.cos(rotation) + zMove * Math.sin(rotation)) * walkSpeed;
	za += (zMove * Math.cos(rotation) - xMove * Math.sin(rotation)) * walkSpeed;
	
	x += xa;
	z += za;
	xa += 0.1;
	za += 0.1;
	rotation += rotationa;
	rotationa += 0.8;
}
	}

