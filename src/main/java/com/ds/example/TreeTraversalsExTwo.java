package com.ds.example;


class TreeExamples
{
   int size = 0;
	public NodeTree createTree()

    {
     /*
                 1
               2   3
            4  5 	-6	
                      7*/
    	NodeTree  root = new NodeTree(1);
    	NodeTree n1 = new NodeTree(2);
    	NodeTree n2 = new NodeTree( 3);
    	NodeTree n3 = new NodeTree (4);
    	NodeTree n4 = new NodeTree(5 );
    	NodeTree n5 = new NodeTree (6);
    	NodeTree n6 = new NodeTree (7);

        root.left = n1 ;
        root.right = n2 ;
        n1.left = n3;
        n1.right =n4 ;
        n4.right = null;
        n4.right = null;
        n2.right =n5;
        n5.right = n6;
        return root;
    }
	
	
	public int height(NodeTree node)
	{
		if (node ==null)
		{
			return 0;
		}
		
		else
		{
			int ltreeHeight = height(node.left);
			int rtreeHeight = height(node.right);
			
			if (ltreeHeight > rtreeHeight)
			{
				return ltreeHeight+1;
			}
			else
				return rtreeHeight+1;
		}
	}
	
	public void printNodeAtLevel(NodeTree root, int i) {
	
		//int height = height(root);
		//System.out.println(height);
		
		if (root==null)
			return ;
		
		if ( i == 1)
		{
			System.out.println(root.key);
		
		}
		
		
		else if ( i > 1)
		{
			printNodeAtLevel(root.left , i -1);
			printNodeAtLevel(root.right, i -1);
		}
		
	}
 
}



public class TreeTraversalsExTwo{

	public static void main(String[] args) {
		TreeExamples tt = new TreeExamples();
		NodeTree root = tt.createTree();
		
		tt.printNodeAtLevel(root,4);
	
	}
	
	
}

