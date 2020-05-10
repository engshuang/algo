package net.yes.demo.stack;

public class Stack {

	public static void main(String[] args) {
		LinkedStack linkedStack = new LinkedStack();
		linkedStack.push("A");
//		linkedStack.showData();
		printData(linkedStack.getTopData());		
		linkedStack.push("B");
//		linkedStack.showData();
		printData(linkedStack.getTopData());
		linkedStack.pop();
//		linkedStack.showData();
		printData(linkedStack.getTopData());
		linkedStack.pop();
//		linkedStack.showData();
		printData(linkedStack.getTopData());
		linkedStack.push("C");
//		linkedStack.showData();
		printData(linkedStack.getTopData());

	}
	
	private static void printData(String data) {
		System.out.println("Top is " + data + "\n");
	}

	public static class LinkedStack {

		private int size;

		private Node top;

		public LinkedStack() {
			this.size = 0;
			this.top = new Node(null);
		}

		public int size() {
			return this.size;
		}

		public String getTopData() {
			if (this.top == null) {
				return null;
			}
			return this.top.getData();
		}

		public void push(String data) {
			Node node = new Node(data, this.top);
			this.top = node;
			this.size++;
		}

		public String pop() {
			Node popNode = this.top;
			if (popNode == null) {
				System.out.println("Stack is empty");
				return null;
			}
			this.top = popNode.next;
			if (this.size > 0) {
				this.size--;
			}
			return popNode.getData();
		}
		
		public void showData() {
			System.out.println("Show data in stack, begin");
			Node currentNode = this.top;
			while(currentNode != null) {
				System.out.println(currentNode.getData());
				currentNode = currentNode.getNext();
			}
			System.out.println("Show data in stack, end.\n");
		}
	}

	public static class Node {
		private String data;
		private Node next;

		public Node(String data) {
			this.data = data;
		}

		public Node(String data, Node next) {
			this.data = data;
			this.next = next;
		}

		public String getData() {
			return data;
		}

		public void setData(String data) {
			this.data = data;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

	}

}
