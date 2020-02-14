package mansisak_assignment2;

import java.util.LinkedList;
import java.util.Queue;

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
		if (this.contains(s)) {
			return false;
		}
		BST_Node new_node = new BST_Node(s);
		if (size == 0) {
			root = new_node;
			size++;
			return true;
		}
		BST_Node current_node = root;
		BST_Node parent_node = null;
		while (current_node != null) {
			parent_node = current_node;
			if (s.compareTo(current_node.data) < 0) {
				current_node = current_node.left;
			} else {
				current_node = current_node.right;
			}
		}
		if (s.compareTo(parent_node.data) < 0) {
			parent_node.left = new BST_Node(s);
		} else {
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
		// TODO SOMEHOW ID THE CORRECT CELL AND REMOVE IT AND REARRANGE THE TREE
		size--;
		return false;
	}

	@Override
	public String findMin() {
		if (size == 0) {
			return null;
		}
		BST_Node current = root;
		while (current.left != null) {
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
		while (current.right != null) {
			current = current.right;
		}
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
		BST_Node current_node = root;
		while (current_node != null) {
			if (s.equals(current_node.data)) {
				return true;
			}
			if (s.compareTo(current_node.data) < 0) {
				current_node = current_node.left;
			} else {
				current_node = current_node.right;
			}
		}
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
		if (size == 1) {
			return 0;
		}
		Queue<BST_Node> q = new LinkedList<BST_Node>();
		q.add(root);
		int height = 0;

		while (true) {
			int number_of_nodes = q.size();
			if (number_of_nodes == 0) {
				return height;
			}
			height++;
			while (number_of_nodes > 0) {
				BST_Node current_node = q.peek();
				q.remove();
				if (current_node.left != null) {
					q.add(current_node.left);
				}
				if (current_node.right != null) {
					q.add(current_node.right);
				}
				number_of_nodes--;
			}
		}
	}

	// --------------------------------------------------
	//
	// of course, fill in the methods implementations
	// for the interface
	//
	// --------------------------------------------------

}