package com.ds.example;
class NodeTree
{
    int key;
    NodeTree left, right;

    public NodeTree(int item)
    {
        key = item;
        left = right = null;
    }
}

class TreeTraversals
{
   int size = 0;
	public NodeTree createTree()

    {
     /*
                 1
               2   3
            4  5 	-6	*/
    	NodeTree  root = new NodeTree(1);
    	NodeTree n1 = new NodeTree(2);
    	NodeTree n2 = new NodeTree( 3);
    	NodeTree n3 = new NodeTree (4);
    	NodeTree n4 = new NodeTree(5 );
    	NodeTree n5 = new NodeTree (6);
    	

        root.left = n1 ;
        root.right = n2 ;
        n1.left = n3;
        n1.right =n4 ;
        n4.right = null;
        n4.right = null;
        n2.right =n5;
        n2.left = null;
        return root;
    }
    
    public void preOrderTraversal(NodeTree root)
    {
    	if (root ==null) return ;
    	System.out.println(root.key);
    	preOrderTraversal(root.left);
    	preOrderTraversal(root.right);
    	
    }
    
    public void inOrderTraversal(NodeTree root)
    {
    	if (root ==null) return ;
    	
    	inOrderTraversal(root.left);
    	System.out.println(root.key);
    	inOrderTraversal(root.right);
    	
    }
    
    public void postOrderTraversal(NodeTree root)
    {
    	if (root ==null) return ;
    	
    	postOrderTraversal(root.left);
    	
    	postOrderTraversal(root.right);
    	System.out.println(root.key);
    }
    
    public int calculateSize(NodeTree root){
    
    	if(root==null)
    		return 0;
    	else 
    	{
    		size++;
    		calculateSize(root.left);
    		calculateSize(root.right);
    	}
    	
    return size;
    }
    
    
				    /*
				    1
				  2   3
				4  5 	-6	*/
    public void printBoundries(NodeTree root)
    {
    	if (root ==null) return ;
    	System.out.println("print boundries wala");
        System.out.println(root.key + " ");
        
        // Print the left boundary in top-down manner.
        printBoundaryLeft(root.left);

        // Print all leaf nodes
        printLeaves(root.left);
        printLeaves(root.right);

        // Print the right boundary in bottom-up manner
        printBoundaryRight(root.right);
  
}

private void printLeaves(NodeTree left) {
	
	if ( left ==null) { return ;}
		
	if ( left.left==null && left.right ==null)
	{
		System.out.println(left.key);
		
	}
	else
	{
		printLeaves(left.left);
		 printLeaves(left.right);
	}

	}

private void printBoundaryLeft(NodeTree left) {
				
	if (left==null) return ;
	if(left.left!=null && left.right!=null){ // this if is just to save printing leaf node multiple time
	System.out.println(left.key);
	printBoundaryLeft(left.left);
	}
}

private void printBoundaryRight(NodeTree right) {
	
	if (right==null) return ;
	
	
	printBoundaryLeft(right.right);
	System.out.println(right.key); // Here print is used after Calling all recursion as we need to use post order traversal .
						
					}


/* Compute the "height" of a tree -- the number of
nodes along the longest path from the root node
down to the farthest leaf node.*/
/*
		1
	 2     3
  4     5 	  6	*/


int height(NodeTree node) 
{
   if (node == null)
       return 0;
   else
   {
       /* compute the height of each subtree */
       int lheight = height(node.left); 
       int rheight = height(node.right);

       /* use the larger one */
       if (lheight > rheight)
           return (lheight + 1);
       else
           return (rheight + 1);
   }
}


/* Function to print REVERSE level order traversal a tree*/
void reverseLevelOrder(NodeTree node) 
{
    int h = height(node);
    int i;
    for (i = h; i >= 1; i--) 
    //THE ONLY LINE DIFFERENT FROM NORMAL LEVEL ORDER
    {
        printGivenLevel(node, i);
    }
}

/* Print nodes at a given level */
void printGivenLevel(NodeTree node, int level) 
{
    if (node == null)
        return;
    if (level == 1)
    {
        System.out.print("at level "+ level+ "--> "+ node.key + " ");
    }
    else if (level > 1) 
    {
        printGivenLevel(node.left, level - 1);
        printGivenLevel(node.right, level - 1);
    }
}

}



public class TreeTraverseMethods{

	public static void main(String[] args) {
		TreeTraversals tt = new TreeTraversals();
		NodeTree root = tt.createTree();
		tt.preOrderTraversal(root);
		
		// preorderTraversal 
		
tt.inOrderTraversal(root);
tt.postOrderTraversal(root);
int size = tt.calculateSize(root);

System.out.println(size+1);

tt.printBoundries(root);

tt.printGivenLevel(root, 3);
	}
	
	
}

