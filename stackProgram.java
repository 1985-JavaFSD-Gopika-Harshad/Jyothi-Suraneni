package Revature;

import java.util.Stack;

/*Generic Stack Implementation
Create a generic stack class GenericStack<T> that supports the following operations:
push(T item): Adds an item to the top of the stack.
T pop(): Removes and returns the item at the top of the stack.
T peek(): Returns the item at the top of the stack without removing it.
boolean isEmpty(): Checks if the stack is empty.
int size(): Returns the number of items in the stack.*/
public class stackProgram {

	public static void main(String[] args) {
		Stack s=new Stack();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		System.out.println(s.pop());
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s);
		System.out.println(s.empty());
		System.out.println(s.size());
		System.out.println(s.isEmpty());
		

	}

}
