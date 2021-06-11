package com.javaex.ex03;

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
		//equals 메소드를 오버라이드 하였기 때문에 시선이 Object에 가있다.
		//그러므로 Rectangle로 다운캐스팅하여 메소드를 재정의 해준다.
		if(this.width*this.height == ((Rectangle)obj).width * ((Rectangle)obj).height) {
			return true;
		} else {
			return false;
		}
		
	}
	
	
	

}
