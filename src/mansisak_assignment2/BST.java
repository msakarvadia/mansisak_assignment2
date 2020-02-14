package mansisak_assignment2;

public class BST implements BST_Interface {
	public BST_Node root;
	int size;

	public BST() {
		size = 0;
		root = null;
	}

	
	@Override
	// used for testing, please leave as is
	public BST_Node getRoot() {
		return root;
	}

	
	@Override
	public boolean insert(String s) {
		if(this.contains(s)) {
			return false;
		}
		BST_Node new_node = new BST_Node(s);
		if(size == 0) {
			root = new_node;
		}
		BST_Node current_node = root;
		BST_Node parent_node = null;
		while(current_node != null) {
			parent_node = current_node;
			if(s.compareTo(current_node.data)<0) {
				current_node = current_node.left;
			}
			else {
				current_node = current_node.right;
			}
		}
		if(s.compareTo(parent_node.data)<0) {
			parent_node.left = new BST_Node(s);
		}
		else {
			parent_node.right = new BST_Node(s);
		}
		size++;
		return true;
	}

	@Override
	public boolean remove(String s) {
		if (size == 0) {
			return false;
		}
		if (!this.contains(s)) {
			return false;
		}
		//TODO SOMEHOW ID THE CORRECT CELL AND REMOVE IT AND REARRANGE THE TREE
		size--;
		return false;
	}

	@Override
	public String findMin() {
		if (size == 0) {
			return null;
		}
		BST_Node current = root;
		while(current.left != null) {
			current = current.left;
		}
		return current.data;
	}

	@Override
	public String findMax() {
		if (size == 0) {
			return null;
		}
		BST_Node current = root;
		//TODO do this meathods por favor
		return current.data;
	}

	@Override
	public boolean empty() {
		if (size == 0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean contains(String s) {
		if (size == 0) {
			return false;
		}
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public int height() {
		if (size == 0) {
			return -1;
		}
		//TODO finish this
		return 0;
	}

	// --------------------------------------------------
	//
	// of course, fill in the methods implementations
	// for the interface
	//
	// --------------------------------------------------

}