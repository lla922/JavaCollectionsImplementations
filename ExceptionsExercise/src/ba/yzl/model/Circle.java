package ba.yzl.model;

import ba.yzl.Exception.NegativeRadiusException;

public class Circle {
	
	private int radius;
	
	public Circle() {
		this(1); 
	}
	
	public Circle(int radius) {
		if(radius < 0) {
			throw new NegativeRadiusException(radius);
		}
		this.radius = radius;
	}
	
	public double getArea() {
		return Math.PI * radius * radius;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Circle radius : " + radius + " area : " + getArea();
	}

}
