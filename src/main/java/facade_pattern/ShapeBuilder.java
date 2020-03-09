package facade_pattern;

public class ShapeBuilder {
	private Shape square;
	private Shape triangle;
	public ShapeBuilder() {
	     square = new Square();
	     triangle=new Triangle();
	} 
	public void drawSquare(){
		 square.draw();
	}
	public void drawTriangle() {
		   triangle.draw();
	   }
}
