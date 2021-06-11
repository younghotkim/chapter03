package com.javaex.ex02;

public class Point {
	
	private int x;
	private int y;
	
	public Point () {
		
	}
	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public boolean equals(Object obj)//시선이 Object 까지다.
	{
	
		//Point p	= ((Point)obj);
			
		if (this.x == ((Point)obj).x && this.y == ((Point)obj).y) {
			return true;
		} else {
			return false;
		}
	}

}
