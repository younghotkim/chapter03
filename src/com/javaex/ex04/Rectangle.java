package com.javaex.ex04;

public class Rectangle {
	
	private int width;
	private int height;
	
	public Rectangle () {
		
	}
	
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public boolean equals(Object obj) {
		
		if(this.width == ((Rectangle)obj).width && this.height == ((Rectangle)obj).height) {
			return true;
		} else {
			return false;
		}
		
	}
	
	
	

}
