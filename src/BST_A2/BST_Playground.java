package BST_A2;

public class BST_Playground {
/*
 * you will test your own BST implementation in here
 *
 * we will replace this with our own when grading, and will
 * do what you should do in here... create BST objects,
 * put data into them, take data out, look for values stored
 * in it, checking size and height, and looking at the BST_Nodes
 * to see if they are all linked up correctly for a BST
 * 
*/
  
  public static void main(String[]args){

	BST t = new BST();
	t.insert("e");
	t.insert("f");
	t.insert("g");
	t.insert("h");
	
	t.insert("e");
	t.insert("x");
	t.insert("g");
	t.insert("h");
	
	t.insert("a");
	t.insert("y");
	t.insert("c");
	t.insert("d");
	
	t.insert("z");
	t.insert("i");
	t.insert("j");
	t.insert("k");
	
	t.insert("l");
	t.insert("n");
	t.insert("o");
	t.insert("m");
	t.insert("a");
	t.insert("b");
	t.insert("c");
	t.insert("d");
	
	t.insert("p");
	t.insert("r");
	t.insert("q");
	t.insert("s");
	
	t.insert("t");
	t.insert("w");
	t.insert("u");
	t.insert("v");
	
	t.insert("h");
	t.insert("i");
	t.insert("j");
	t.insert("k");
	
	t.insert("l");
	t.insert("n");
	t.insert("o");
	t.insert("m");
	
	t.insert("h");
	t.insert("i");
	t.insert("j");
	t.insert("k");
	
	t.insert("l");
	t.insert("n");
	t.insert("o");
	t.insert("m");
	
	//t.insert("f");
	//t.insert("d");
	
	//printLevelOrder(t);
	printInOrder(t.getRoot());
	System.out.println("");
	System.out.println("Contains: "+t.contains("a")+" ");
	System.out.println("Min: "+t.findMin()+" ");
	System.out.println("Max: "+t.findMax()+" ");
	System.out.println("Size: "+t.size()+" ");
	System.out.println("Empty?: "+t.empty()+" ");
	System.out.println("Height: "+t.height()+" ");
	System.out.println("Root value: "+t.getRoot()+" ");
	
	t.remove("a");
	t.remove("d");
	t.remove("m");
	t.remove("l");
	
	
	System.out.println("Contains: "+t.contains("a")+" ");
	System.out.println("Min: "+t.findMin()+" ");
	System.out.println("Max: "+t.findMax()+" ");
	System.out.println("Size: "+t.size()+" ");
	System.out.println("Empty?: "+t.empty()+" ");
	System.out.println("Height: "+t.height()+" ");
	System.out.println("Root value: "+t.getRoot()+" ");
	
	//printLevelOrder(t);
	printInOrder(t.getRoot());
	System.out.println("");
	
   // you should test your BST implementation in here
   // it is up to you to test it thoroughly and make sure
   // the methods behave as requested above in the interface
  
   // do not simple depend on the oracle test we will give
   // use the oracle tests as a way of checking AFTER you have done
   // your own testing

   // one thing you might find useful for debugging is a print tree method
   // feel free to use the printLevelOrder method to verify your trees manually
   // or write one you like better
   // you may wish to print not only the node value, and indicators of what
   // nodes are the left and right subtree roots,
   // but also which node is the parent of the current node
 
  }

  static void printLevelOrder(BST tree){ 
  //will print your current tree in Level-Order...
  //https://en.wikipedia.org/wiki/Tree_traversal
	//TODO: line 38 was modified by me
    int h=tree.height();
    for(int i=0;i<=h;i++){
      printGivenLevel(tree.getRoot(), i);
    }
    
  }
  static void printGivenLevel(BST_Node root,int level){
    if(root==null)return;
    if(level==0)System.out.print(root.data+" ");
    else if(level>0){
      printGivenLevel(root.left,level-1);
      printGivenLevel(root.right,level-1);
    }
  }
  static void printInOrder(BST_Node root){
  //will print your current tree In-Order
  if(root!=null){
    printInOrder(root.getLeft());
    System.out.print(root.getData() + " ");
    printInOrder(root.getRight());
  }
  }
}