/**
 * @author Matt
 *
 */
public class Application {

	/**
	 * @param args Tree Height
	 */
	public static void main(String[] args)
	{
		//System.out.println("Creating a tree of height "+ args[0]+".");
		Tree aTree=new Tree();//Creates a tree with root
		Node root=aTree.generatePracticeTree(5);
		DepthFirstSearch aSearch=new DepthFirstSearch();
		aSearch.DFS(root, 0);
		
		System.out.println("Number of nodes traversed: " + aSearch.getNodesTraversed());
		System.out.println("Height of the tree: " + aSearch.getMaxHeight());
		
		
		
	}//end main

}//end class