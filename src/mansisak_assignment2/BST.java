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
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean remove(String s) {
		if (size == 0) {
			return false;
		}
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String findMin() {
		if (size == 0) {
			return null;
		}
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String findMax() {
		if (size == 0) {
			return null;
		}
		// TODO Auto-generated method stub
		return null;
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
		return 0;
	}

	// --------------------------------------------------
	//
	// of course, fill in the methods implementations
	// for the interface
	//
	// --------------------------------------------------

}