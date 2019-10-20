// A java program to implement Stack concept using Java Collection Framework

import java.io.*;
import java.util.*;

public class stack {

	static void stack_push(Stack<Integer>MyStack,int i)
	{
		MyStack.push(i);
	}
	
	static void stack_pop(Stack<Integer>MyStack)
	{
		System.out.println("Pop :" + (Integer)MyStack.pop());
	}
	static void stack_peek(Stack<Integer>MyStack)
	{
		System.out.println("Element on Top: " + (Integer)MyStack.peek());
	}
	
	static void stack_search(Stack<Integer> MyStack, int ele)
	{
		Integer pos = (Integer)MyStack.search(ele);
		if(pos == -1)
			System.out.println("Element not found");
		else
			System.out.println("Element position: " + pos);
	}
	
	
	
	public static void main(String[] args) {
		Stack<Integer>MyStack = new Stack<Integer>();
		stack_push(MyStack,2);
		stack_push(MyStack,4);
		stack_push(MyStack,6);
		stack_push(MyStack,7);
		stack_pop(MyStack);
		stack_push(MyStack,8);
		stack_peek(MyStack);
		stack_search(MyStack,2);
		stack_search(MyStack,6);
		stack_search(MyStack,13);
		
		
		
		
		

	}

}
