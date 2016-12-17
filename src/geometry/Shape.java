package geometry;

public abstract class Shape {
	  
	  private String name; 
	  private String color; 
	  
	  Shape(String Name, String Color) 
	  { 
		    this.name = Name; 
		    this.color = Color; 
	  } 
	  protected String getName()
	  {
	  	return this.name;
	  }
	  protected String getColor()
	  {
		  return this.color;
	  }
	  	
	  
	  abstract public double calcArea();
}
