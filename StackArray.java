package com.stackQueue;

public class StackArray {
		
	int top;
	int capacity;
	int stack[];
	
	StackArray()
	{
		top = -1;
		capacity = 10;
		stack = new int[capacity];
	}
	
	public boolean isEmpty() 
	{
		return top == -1;
	}
	
	public boolean isFull()
	{
		return top == capacity -1;
	}
	
	public int push (int data)
	{
		if(isFull())
		{
			System.out.println("Stack is Full");	
		}
		return stack [++top] = data;
	}
	
	public int pop()
	{
		if(isEmpty())
		{
			System.out.println("stack is empty");
		}
		return stack[top--];
	}
	
	public int peek()
	{
		return stack[top];
	}
	
	public void display () {            
        for(int i: stack)
        {
        	System.out.println(i);
        }
	}
	
	public static void main(String args[])
	{
		StackArray stackarray = new StackArray();
		System.out.println("Initial stack Empty:"+stackarray.isEmpty());
		stackarray.push(10);
		stackarray.push(20);
		stackarray.push(30);
		stackarray.push(40);
		System.out.println(stackarray.peek());
		System.out.println("After pop operation");
		System.out.println(stackarray.pop());
		System.out.println(stackarray.pop());
		System.out.println("After peek operation");
		System.out.println(stackarray.peek());
		
	}

}
