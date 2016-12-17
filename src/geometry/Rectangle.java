package geometry;

public class Rectangle extends Shape {
	private double height;
	private double width;
	public Rectangle(double height, double width) {
		super("RECTANGLE","BLUE");
	    this.height = height;
		this.width = width;
	}
	public double calcArea() {
	return height * width;
	}
}
