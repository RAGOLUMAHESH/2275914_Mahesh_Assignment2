package com.assignment2.mahesh;

class Shape {
	public double getArea() {
		return 0;
	}

}
class Rectangle extends Shape{
	
    private double length;
    private double width;
	
	public Rectangle(double length,double width) {
		this.length = length;
		this.width = width;
		
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return this.length * this.width;
	}
	
}

public class Main {

	public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 4);
        System.out.println("Area of rectangle: " + rectangle.getArea());

	}

}
