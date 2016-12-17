package geometry;

public class Triangle extends Shape {
	private double a;
	private double b;
	private double c;
	public Triangle(double a, double b,double c) {
	super("TRIANGLE","GREEN");
	this.a = a;
	this.b = b;
	this.c = c;
	}
	public double calcArea() {
		double t=(a+b+c)/2;
	return Math.sqrt(t*(t-a)*(t-b)*(t-c));
	}

}
