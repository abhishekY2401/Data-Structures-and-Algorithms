class Stack {
	int a[];
	int top;
	int capacity;

	public Stack(int capacity) {
		this.capacity = capacity;
		top = -1;
		a = new int[capacity];
	}

	void push(int data) {

		if (top == capacity - 1) {
			System.out.println("Stack Overflow");
		}
		top++;
		a[top] = data;
		System.out.println(data + " is pushed inside the stack");
	}

	void pop() {

		if (top == -1) {
			System.out.println("Under flow");
		} else {
			top--;
			System.out.println("Element is popped from the stack");
		}
	}

	int peek() {
		if (isEmpty()) {
			System.out.println("Empty Stack");
		}
		return a[top];
	}

	boolean isEmpty() {
		return top == -1;
	}

	void displayContent() {
		System.out.print("Elements in the stack are : ");

		for (int i = 0; i <= top; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public static void main(String[] args) {
		// push(), pop(), peek(), isEmpty(), size()

		// Allocating memory for the stack by initializing its object
		Stack stack = new Stack(10);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		stack.push(7);
		stack.push(8);
		stack.push(9);

		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();

		int val = stack.peek();
		System.out.print("Element at the peek position : " + val);
        System.out.println();
		stack.displayContent();

	}
}
