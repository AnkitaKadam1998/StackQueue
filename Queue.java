package com.stackQueue;

public class Queue {
	
	int[] queue;
	int rear;
	int front;
	int capacity=5; //total number of elements in queue
	
	public Queue()
	{
		rear = -1;
		front = -1;
		queue = new int[capacity];
	}
	
	public boolean isEmpty()
	{
		return rear <= front;
	
	}
	int enqueue(int data)
	{
		return queue[++rear]=data;
	}
	int dequeue()
	{
		if(isEmpty())
		{
			System.out.println("queue is empty");		
		}
		
		if(rear>=front)
		{
			return queue[++front];
		}
		return (Integer) null;
	}
	
	int size()
	{
		return rear-front; 
	}
	
	public static void main(String args[])
	{
		Queue queue = new Queue();
		System.out.println(queue.isEmpty());
		queue.enqueue(56);
		queue.enqueue(30);
		queue.enqueue(70);
		System.out.println(queue.isEmpty());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.isEmpty());		
		
	}
}
