package geometry;

public class Square extends Shape {
	private double side;
	public Square(double side) {
	super("SQUARE","ORANGE");
	this.side = side;
	}
	public double calcArea() {
	return side * side;
	}

}
