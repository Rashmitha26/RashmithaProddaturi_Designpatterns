package decorator_pattern;

public class DecoratorPattern {
	public static void main(String args[]) {
		TreeWithoutDecoration treeWithoutDecoration = new TreeWithoutDecoration();
		String decorated=treeWithoutDecoration.decorateTree();
		String treeWithLights = new TreeWithLights(treeWithoutDecoration).decorateTree();
		System.out.println(treeWithLights);
		String treeWithSnowflakes = new TreeWithSnowflakes(treeWithoutDecoration).decorate();
		System.out.println(treeWithSnowflakes);
		
	}

}
