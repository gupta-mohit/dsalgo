package com.mohit.ds.linkedlist;

public class ReverseLinkList {

	static Node reversedHead;
	/*
	 * https://youtu.be/sYcOK51hl-A?list=PL2_aWCzGMAwI3W_JlcBbtYTwiQSsOTa6P
	 */
	private static void reverseUsingIteration(LinkedList list) {
		// TODO Auto-generated method stub
		Node curr=list.head;
		if(curr.nextNode==null){ 
			System.out.println("only one node!");
			return;
		}

		Node prev = null;
		while(curr!=null)
		{
			Node next=curr.nextNode;
			curr.nextNode=prev;
			prev=curr;
			curr=next;
		}

		list.head=prev;


	}
	/*
	 * https://www.youtube.com/watch?v=KYH83T4q6Vs&index=11
	 */
	private static void reverseUsingRecursiontion(LinkedList list) {
		reversedHead=list.head;
		recurse(reversedHead);
		//printBackwardsUsingRecursion(head);
	}

	private static void recurse(Node node) {
		// TODO Auto-generated method stub
		if(node.nextNode==null)
		{reversedHead=node;
		return;
		}
		recurse(node.nextNode);
		Node q=node.nextNode;
		q.nextNode=node;
		node.nextNode=null;

	}
	private static void printBackwardsUsingRecursion(Node head) {

		if(head==null)
			return;
		printBackwardsUsingRecursion(head.nextNode);
		System.out.println(head.item);
	}

	public static void main(String[] args) {

		LinkedList list=new LinkedList(8);
		list.addNodeAtTail(9);
		list.addNodeAtTail(10);
		list.addNodeAtTail(11);
		//list.printElements();
		ReverseLinkList.reverseUsingIteration(list);
		list.printElements();
		ReverseLinkList.reverseUsingRecursiontion(list);
		list.printElements();
		printBackwardsUsingRecursion(reversedHead);


	}




}
