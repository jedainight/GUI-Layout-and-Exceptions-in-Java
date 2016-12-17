package geometry;

public class Circle extends Shape {
	private static final double PI = 3.14159;
	private double radius;
	public Circle(double radius) {
	super("CIRCLE","BLACK");
	this.radius = radius;
	}
	public double calcArea() {
	return PI*(radius*radius);
	}

}
