package com.mohit.ds.linkedlist;

class Node{
	int item;
	Node nextNode;

	public Node(int item) {
		super();
		this.item = item;
		this.nextNode=null;
	}	


}

public class LinkedList {

	public LinkedList() {
		head=null;
	}

	public LinkedList(int data) {
		head=new Node(data);
	}

	Node head;

	public void addNodeAtTail(int data){
		if (head==null)
			head=new Node(data);	
		Node temp=head;
		while(temp.nextNode!=null)
			temp=temp.nextNode;
		temp.nextNode=new Node(data);
	}	

	public void addNodeAtHead(int data){
		if (head==null)
			head=new Node(data);	
		Node newHead= new Node(data);
		newHead.nextNode=head;
		head=newHead;
	}	

	public void find(int data){
		if (head==null)
			System.out.println("list is empty");	
		if(head.item==data) System.out.println("found at head");	
		Node temp=head;
		while(temp.nextNode!=null)
		{if (temp.nextNode.item==data) System.out.println("found");
		temp=temp.nextNode;
		}

	}
	public void printElements() {
		if(head==null) System.out.println("empty List");

		if (head.nextNode==null){
			System.out.println(head.item);
			return;
		}
		Node temp=head;
		while(temp.nextNode!=null){
			System.out.println(temp.item); 
			temp=temp.nextNode;
		}
		System.out.println(temp.item);

	}


	public static void main(String[] args) {

		LinkedList list=new LinkedList(10);
		list.addNodeAtTail(20);
		list.addNodeAtHead(5);
		list.printElements();
		list.addNodeAtTail(30);
		list.printElements();
		list.addNodeAtHead(2);
		list.printElements();
	}


}
