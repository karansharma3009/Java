package com.ds.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


class TreeFunctions
{
	int index =0;
	HashMap<Integer,ArrayList<Integer>> hash = new HashMap<Integer, ArrayList<Integer>>();
	public NodeTree createTree()
	{
    
	NodeTree  root = new NodeTree(1);
	NodeTree n1 = new NodeTree(2);
	NodeTree n2 = new NodeTree( 3);
	NodeTree n3 = new NodeTree (4);
	NodeTree n4 = new NodeTree(5 );
	NodeTree n5 = new NodeTree (6);
	NodeTree n6 = new NodeTree (7);
	NodeTree n7 = new NodeTree (8);
	NodeTree n8 = new NodeTree (9);
	
	          

 root.left = n1 ; //2
 root.right = n2 ; //3

 n1.left = n3;
 n1.right = n4 ;
 n2.left = n5;
 n2.right = n6;
 n3.left = n7;
 n3.right = n8 ;
 
 
 
 return root;
	}

	public void setVerticalIndexing(NodeTree root , int x) {
	
		index = x;
		
		if (root ==null)
		{
			return ;
		}
		
		if ( hash.containsKey(x)){
			ArrayList<Integer> L = hash.get(x);
			L.add(root.key);
		}
		else
		{
			ArrayList<Integer> al = new ArrayList<Integer>();
			al.add(root.key);
			hash.put(x,al);
		}
		
		setVerticalIndexing(root.left , x-1);
		setVerticalIndexing(root.right,x+1);
		
	}
	
	public void printHash()
	{
		
		
		for ( Integer i : hash.keySet())
		{
			System.out.println("Key ->" + i + ": Value " + hash.get(i));
			
			for ( Integer j : hash.get(i))
			{
				System.out.println("key is "+ i +"value is " +j);
			}
		}
	}
}

public class VerticalTraversing {
	
	public static void main(String[] args) {
		TreeFunctions tf = new TreeFunctions();
		NodeTree root = tf.createTree();
		tf.setVerticalIndexing(root ,0);
		tf.printHash();
		
	}

}
