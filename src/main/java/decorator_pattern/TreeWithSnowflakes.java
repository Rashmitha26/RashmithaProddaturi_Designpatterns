package decorator_pattern;

public class TreeWithSnowflakes extends TreeDecorator{
	
	public TreeWithSnowflakes(ChristmasTree tree){
		super(tree);
	}
	public String decorate() {
		String x="Before: "+tree.decorateTree();
		x=x+" After: Snowflakes added!";
		return x;
	}
}
