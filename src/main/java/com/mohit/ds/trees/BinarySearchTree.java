package com.mohit.ds.trees;

class Node{
	Integer data;
	Node left;
	Node right;

	public Node() {
		left=null;
		right=null;
		data=null;
	}

	public Node (Integer data){
		left=null;
		right=null;
		this.data=data;
	}	

}

/**
 * @author mohit
 * This class represents a binary search tree
 */
public class BinarySearchTree {

	Node root;

	public void insert( Integer value){
		insert(root,value);
	}

	public void insert(Node node, Integer value) {

		if(root==null){
			root=new Node(value);
			return;
		}

		if (value < node.data)
		{
			if (node.left != null)
			{
				insert(node.left, value);
			} 
			else
			{     
				node.left = new Node(value);
			}
		} 
		else if (value > node.data)
		{
			if (node.right != null)
			{
				insert(node.right, value);
			}
			else
			{
				node.right = new Node(value);
			}
		}
	}

	//inserting elements in a binary search tree
	public void insertRecursively(Integer Value){

		insertRecursively(root,Value);
	}

	public Node insertRecursively(Node currNode ,Integer value){


		if (root==null)
		{ Node createdRoot=new Node(value); 
		root=createdRoot;
		return root;	
		}		
		else 
			if (currNode==null)
			{ Node createdRoot=new Node(value); 
			return createdRoot;
			}	
			else
			{
				if(value<currNode.data)
				{
					currNode.left=insertRecursively(currNode.left,value);
					return currNode;
				}
				else if(value > currNode.data)
				{
					currNode.right= insertRecursively(currNode.right,value);
					return currNode;
				}
				else 
				{
					System.out.println("duplicate value"); 
					return currNode;
				}
			} 

	}
	/*
	 * Inserting into BST , iterative method
	 * @author Mohitg
	 */
	Node insertIteratively(Node root, Integer data){
		Node nodeToInsert=new Node(data);

		//return the newly created node, calling method will make it root
		if (root==null) return root;

		Node parent=null,current=root; 

		while (current!=null){
			parent=current;
			if(current.data<=data)
				current=current.right;
			else current=current.left;
		}
		if (parent.data<=data)
			parent.right=nodeToInsert;
		else 
			parent.left=nodeToInsert;

		 return root;

	}




	////Tree traversals
	/* Given a binary tree, print its nodes according to the
    "bottom-up" postorder traversal. */
	//L-R-V
	void printPostorder(Node node)
	{
		if (node == null)
			return;

		// first recur on left subtree
		printPostorder(node.left);

		// then recur on right subtree
		printPostorder(node.right);

		// now deal with the node
		System.out.print(node.data + " ");
	}

	/* Given a binary tree, print its nodes in inorder*/
	//L-V-R
	void printInorder(Node node)
	{
		if (node == null)
			return;

		/* first recur on left child */
		printInorder(node.left);

		/* then print the data of node */
		System.out.print(node.data + " ");

		/* now recur on right child */
		printInorder(node.right);
	}

	/* Given a binary tree, print its nodes in preorder*/// V-L-R
	void printPreorder(Node node)
	{
		if (node == null)
			return;

		/* first print data of node */
		System.out.print(node.data + " ");

		/* then recur on left sutree */
		printPreorder(node.left);

		/* now recur on right subtree */
		printPreorder(node.right);
	}

	// Wrappers over above recursive functions
	void printPostorder()  {     printPostorder(root);  }
	void printInorder()    {     printInorder(root);   }
	void printPreorder()   {     printPreorder(root);  }



	/*
	 * Searching in binary tree
	 * order of complexity is O(n) worst case
	 * In case of a balanced tree , order of complexity is o(log n)
	 */

	Node search(Node root , Integer key){
		if(root==null) return null ;
		else if((root.data)==key)
			return root;

		else if (key <root.data) 
			return search(root.left,key);
		else 
			return search(root.right,key);


	}
	
	/*
	 * Size of binary tree 
	 * Size of binary tree is total number of nodes
	 */

	public static void main(String[] args) {
		BinarySearchTree bst =new BinarySearchTree();

		BinarySearchTree bst2 =new BinarySearchTree(); 

		bst2.insertRecursively(10);
		bst2.insertRecursively(5);
		bst2.insertRecursively(11);
		bst2.insertRecursively(15);
		bst2.insertRecursively(14);
		bst2.insertRecursively(1);

		bst.insert(10);
		bst.insert(5);
		bst.insert(11);
		bst.insert(15);
		bst.insert(14);
		bst.insert(1);

		bst.printPostorder();
		bst2.printPostorder();

		System.out.println(bst.search(bst.root, 11).toString());

	}


}
