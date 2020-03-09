package template_patterns;

public class Parallelogram extends Shape{
	Parallelogram(float l1,float l2){
		super.side1=l1;
		super.side2=l2;
	}
	public void draw()
	{
		System.out.println("It is a quadrilateral where opposite sides are parallel.However adjacent sides need not be perpendicular");
	}
	public double getArea() {
		area=side1*side2;
		return area;
		
	}
	@Override
	public String toString()
	{
		String x="The shape chosen is 'Parallelogram. Its area is "+getArea();
		return x;
	}
	
}
