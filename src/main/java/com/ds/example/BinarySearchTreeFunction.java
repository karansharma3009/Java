package com.ds.example;

class BinarySearchTree
{
	NodeBST root;
	class NodeBST{
	int value;
	NodeBST left;
	NodeBST right;
	
	public NodeBST(int value)
	{
		this.value = value;
		this.left = null;
		this.right= null;
	}
	}

	BinarySearchTree()
	{
		root =null;
	}

	public NodeBST AddNode(int key,NodeBST root)
	{
		
		if( root==null){
			root = new NodeBST(key);
			return root;
		}
		
			
			if ( key > root.value )
			{
				
				root.right= AddNode(key,root.right);
				
			}
		
			else
			{
			
				root.left=AddNode(key,root.left);
			}
			
	   return root;
				
	}

	public void createTree() {
	root = AddNode(30 ,root);
	root = AddNode(40,root);
	root = AddNode(50,root);
	root = AddNode(70,root);
	root = AddNode(22,root);
	root = AddNode(21,root);
	root = AddNode(10,root);
	root = AddNode(5,root);
	root = AddNode(44,root);
	root = AddNode(25,root);
	root = AddNode(45,root);
	root = AddNode(43,root);
	}
	
	public void printTree(){
		inorderRec(root);
	}
	
	 public  void inorderRec(NodeBST root) {
	        if (root != null) {
	            inorderRec(root.left);
	            System.out.println(root.value);
	            inorderRec(root.right);
	        }
	    }
	
}

public class BinarySearchTreeFunction {

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.createTree();
		bst.printTree();
		
	}

}
