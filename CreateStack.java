package com.stackQueue;

import java.util.LinkedList;

public class CreateStack 
{
		public static void main(String args[])
		{
			LinkedList<Integer> linkedList = new LinkedList<>();
			linkedList.push(70);
			linkedList.push(30);
			linkedList.push(56);
			
			System.out.println(linkedList);
			System.out.printf("Top element is %d\n",linkedList.peek());
			linkedList.pop();
			System.out.println(linkedList);
			System.out.printf("Top element is %d\n",linkedList.peek());
			linkedList.pop();
			System.out.println(linkedList);
			System.out.printf("Top element is %d\n",linkedList.peek());
			linkedList.pop();
			System.out.println(linkedList);
			
		}
	}

