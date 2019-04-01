public class BinaryTree{

	public class Node{

		int value;
		Node left;
		Node right;

		public Node(int k){

			value = k;
			left = right = null;

		}
		
	}

	public Node node;

	public void insert(int k){
		node = insertR(node, k); 
	}

	private Node insertR(Node current, int val) {
		if (current == null) return new Node(val);
		
		if (val < current.value) current.left = insertR(current.left, val); 
		else if (val >= current.value) current.right = insertR(current.right, val);  
		
		return current;

	}

	public boolean search(int k){

		boolean isThere = searchR(node, k);
		//System.out.println(isThere);
		return isThere;
	}

	private boolean searchR(Node current, int val) {
		if (current == null) return false;
		
		if (val == current.value) return true;
		
		if(val < current.value) searchR(current.left, val);
		else searchR(current.right, val);
		
		return false;
	}

	public void remove(int k){
		node = removeR(node, k);
	}

	private Node removeR(Node current, int val) {
		
		if (current == null) {
			return null;
		}
	 
		if (val == current.value) {

			if (current.left == null && current.right == null) {
				return null;
			}

			if (current.right == null && current.left != null) {
				return current.left;
			}
			 
			if (current.left == null && current.right != null) {
				return current.right;
			}

			if(current.right != null && current.left != null) {
				int smallestValue = findSmallestValue(current.right);
				current.value = smallestValue;
				current.right = removeR(current.right, smallestValue);
				return current;
			}
			
		} 
		
		if (val < current.value) {
			current.left = removeR(current.left, val);
			return current;
		}
		
		current.right = removeR(current.right, val);
		return current;
	
	}

	public void InOrder() {
		node = printTree(node);
	}

	private Node printTree(Node node){
		if (node != null) {
			printTree(node.left);
			System.out.print(" " + node.value);
			printTree(node.right);
		}
		return node;
	}

	private int findSmallestValue(Node node) {
		return node.left == null ? node.value : findSmallestValue(node.left);
	}

}