package com.BinarySerachTree;

public class BinarySearchTree {
	
	public static  class Node
	{
		int data;
		Node left;
		Node right;
		
		public Node(int data)
		{
			this.data=data;
			this.left=null;
			this.right=null; 	
		}	
	}
	public Node root;
	
	public BinarySearchTree()
	{
		root=null;
	}
	
	public void insert(int data)
	{
		Node newNode = new Node(data);
		
		if(root == null)
		{
			root = newNode;
			return;
		}
		else
		{
			Node current = root;
			Node parent=null;
			
			while(true)
			{
				parent=current;
				
				if(data<current.data)
				{
					current = current.left;
					if(current == null)
					{
						parent.left=newNode;
						return;
					}
				}
				else
				{
					current = current.right;
					if(current == null)
					{
						parent.right=newNode;
						return;
					}
				}
			}
		}
	}
	
	public void inorderTraversal(Node node)
	{
		if(root == null)
		{
			System.out.println("Tree is empty");
			return;
		}
		else
		{
			if(node.left!=null)
				inorderTraversal(node.left);
			System.out.println(node.data+"");
			if(node.right!=null)
				inorderTraversal(node.right);
		}
	}
	
	public static void main(String args[])
	{
		BinarySearchTree bt = new BinarySearchTree(); 
		bt.insert(56);
		bt.insert(30);
		bt.insert(70);
		System.out.println("Binary serach tree after insertion");
		bt.inorderTraversal(bt.root);
	}


