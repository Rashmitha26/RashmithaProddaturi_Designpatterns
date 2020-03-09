package decorator_pattern;

public class TreeWithLights extends TreeDecorator{
	public TreeWithLights(ChristmasTree tree){
		super(tree);
	}
	public String decorateTree() {
		String x="Before: "+tree.decorateTree();
		x=x+" After: Lights added!";
		return x;
	}

}
