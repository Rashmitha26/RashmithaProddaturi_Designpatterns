package template_patterns;

public class Rectangle extends Shape{
	public Rectangle(float l1,float l2) {
		super.side1=l1;
		super.side2=l2;
	}
	public void draw() {
		System.out.println("It has 4 sides and 4 corners.\n Adjacent sides are perpencicular to each other.\nOpposite sides are parallel to each other");
	}
	public double getArea()
	{
		super.area=side1*side2;
		return area;
	}
	@Override
	public String toString()
	{
		String x="The shape chosen is 'Rectangle'. Its area is "+getArea();
		return x;
	}
}
