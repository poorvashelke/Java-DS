package BST;
import BinaryTree.BinaryNode;

public class BST {
	private BinaryNode root;
	
	public BST() {
		root = null;
	}
	
//	addNode T(n) = O(h)
	public void addNode(int data) {
		if(root == null) {
			root = new BinaryNode(data);
			return;
		}
		addNodeHelper(root, data);
	}
	
	private void addNodeHelper(BinaryNode current, int data) {
//		Base case:start by only root node is thr
		if(current.getData() > data && current.getLeft() == null) {
			current.addLeft(data);
		}
		else	 if(current.getData() < data && current.getRight() == null) {
			current.addRight(data);
		}
//		more child in root
		else if(current.getData() > data) {
			addNodeHelper(current.getLeft(), data);
		}
		else {
			addNodeHelper(current.getRight(), data);
		}
	}
	
//	in BST inorder is always sorted
	public void nodeInorder() {
		if(root == null) {
			return;
		}
		root.inOrder();
	}
	
	public boolean search(int key) {
		if(root == null) {
			return false;
		}
		return searchHelper(root, key);
	}
	private boolean searchHelper(BinaryNode current, int key) {
		if(current.getData() == key) {
			return true;
		}
		if(current.getData() > key) {
			return searchHelper(current.getLeft(), key);
		}
		return searchHelper(current.getRight(), key);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BST tree = new BST();
		tree.addNode(100);
		tree.addNode(20);
		tree.addNode(50);
		tree.addNode(130);
		tree.addNode(110);
		tree.addNode(150);
		System.out.print("In-order BST: ");
		tree.nodeInorder();

	}

}
