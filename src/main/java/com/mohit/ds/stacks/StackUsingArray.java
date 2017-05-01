package com.mohit.ds.stacks;

public class StackUsingArray {
	
	public StackUsingArray(int capacity) {
		this.arr = new int[capacity];
		this.top=-1;
	}

	int arr[];
	int top;
	
	public void push(int data){
		if (top==arr.length-1){
			System.out.println("Stack is full");
		}
		
		else
			arr[++top]=data;
	}
	
	public int pop(){
		int popped = 0;
		if (top==-1)
			{System.out.println("stack is empty");
			return Integer.MIN_VALUE;
			}		
		else 
			popped= arr[top--];
		return popped;
		
		
	}
	public int peek(){
		if (top==-1)
			{System.out.println("Stak empty!");
		      return Integer.MIN_VALUE;
			}
		else 
		return arr[top];
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StackUsingArray stack= new StackUsingArray(10);
		stack.push(10);
		stack.push(20);
		stack.push(30);
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		stack.push(40);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		

	}

}
