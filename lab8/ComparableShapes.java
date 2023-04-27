public interface ComparableShapes
{ 
	public double compareAreaToPerimeterRatio(ComparableShape other);
}

public abstract class Shape implements ComparableShape
{
	private String name;
	public Shape(String name)
	{ name = this.name;
	}
	public  abstract double perimeter();
	
	public  abstract double area();
	
	
	public double compareAreaToPerimeterRatio(ComparableShape other)
	{	double x;
		Shape otherShape =(Shape)other;
		if( (this.area()/this.perimeter())== otherShape.area()/otherShape.perimeter())
		{ x= 0;
		}
		else if( (this.area()/this.perimeter()) < otherShape.area()/otherShape.perimeter())
		{x=1;
		}
		else if( (this.area()/this.perimeter()) > otherShape.area()/otherShape.perimeter())
		{x=-1;
		}	
		return x;

		
	}
	public String toString()
	{
		String s = this.name + ": perimeter=" + perimeter() + ", area=" + area();
		return s;
	}
	
 
} 

class Rectangle extends Shape
{
	private double x;
	private double y;
	public Rectangle(double x,double y,String name)
	{ 
		super(name);
		x = this.x;
		y = this.y;
	}
	public double perimeter()
	{	double p = 2*(this.x+this.y);
		return p;
	}
	public double area()
	{ double a = this.x*this.y;
		return a;
	}
}

class Circle extends Shape
{
	private double r;
	public Circle(double r,String name)
	{
		super(name);
		r = this.r;
	}
	public double perimeter()
	{ 	double p = 2*Math.PI*this.r;
		return p;
	}
	public double area()
	{	double a = Math.PI*this.r*this.r;
		return a;
	}
	
}


class ShapeTest
{	
	public static void main(String args[])
	{ 	
		Shape[] ShapeArray = new Shape[4];
		ShapeArray[0] = new Rectangle(1,2,"r1");
		ShapeArray[1] = new Circle(2,"c1");
		ShapeArray[2] = new Rectangle(2,3,"r2");
		ShapeArray[3] = new Circle(3,"c2");
		double logos = 0;
		int turn=0;
		for(int i=0;i<4;i++)
		{	
			System.out.println(ShapeArray[i].toString());
			if(ShapeArray[i].area()/ShapeArray[i].perimeter()>logos){
				logos=ShapeArray[i].area()/ShapeArray[i].perimeter();
				turn=i;
			}
	
		}
		System.out.println("The shape with the maximum area/perimeter is: " +"/n" +ShapeArray[turn].toString());
	}
}
