package studio7;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {
	
	private double length;
	private double width;

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	public String toString() 
    { 
      return length + " * " + width + " = " + getArea();
    }
	
	public double getLength()
	{
		return length;
	}
	
	public double getWidth()
	{
		return width;
	}
	
	public double getArea()
	{
		return length * width;
	}
	
	public double getPerimeter()
	{
		return 2 * (length + width);
	}
	
	public boolean isSmaller(Rectangle r2)
	{
		return getArea() < r2.getArea();
	}
	
	public boolean isSquare()
	{
		return length == width;
	}
	
	public void draw()
	{
		StdDraw.rectangle(0.5, 0.5, width/2, length/2);
	}

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(.3,.2);
		Rectangle r2 = new Rectangle(.5,.5);
		System.out.println(r1);
		System.out.println(r2);
		
		System.out.println(r1.getPerimeter());
		
		System.out.println("r1 is smaller than r2 : " + r1.isSmaller(r2));
		System.out.println("r2 is a sqaure: " + r2.isSquare());
		
		r1.draw();
		r2.draw();
	}

}
