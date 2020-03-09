package facade_pattern;
public class FacadePattern {
	public static void main(String args[]) {
		ShapeBuilder shapeBuilder=new ShapeBuilder();
		shapeBuilder.drawSquare();
		shapeBuilder.drawTriangle();
	}
}
