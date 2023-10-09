 /**
  * Class will run a depth first search on a tree
  * @author Matt
  *
  */
public class DepthFirstSearch {
	Node root;
	private int nodesTraversed;
	private int maxHeight;
	
	/**
	 * Constructor for the DFS class
	 * @param root The root node of the tree to be searched
	 */
	public DepthFirstSearch() {
		System.out.println("Call DFS with root node to do a Depth First Search");
		nodesTraversed = 0;
		maxHeight = 0;
	}
	
	/**
	 * Runs a traversal of the tree
	 * @param node The current node during traversal
	 * @return Height of the current tree at the node
	 */
	public void DFS(Node node, int height) {
		if (node == null) {
			return;
			}
		
		System.out.println(node.getData());
		nodesTraversed++;
		
		int currentHeight = height + 1;
		maxHeight = Math.max(maxHeight, currentHeight);
		DFS(node.getlChild(), currentHeight);
	    DFS(node.getrChild(), currentHeight);
	    } 

	/**
     * Get the total number of nodes traversed.
     *
     * @return The number of nodes traversed during DFS.
     */
	public int getNodesTraversed() {
	        return nodesTraversed;
	    }
	    
	/**
     * Get the height of the tree.
     *
     * @return The height of the tree.
     */
	public int getMaxHeight() {
	        return maxHeight;
	    }

}//end class