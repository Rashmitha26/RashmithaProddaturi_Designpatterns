package decorator_pattern;

public abstract class TreeDecorator implements ChristmasTree {
	ChristmasTree tree;
	public TreeDecorator(ChristmasTree tree) {
		this.tree=tree;
	}
	public String decorateTree()
	{
		return tree.decorateTree();
	}
}
