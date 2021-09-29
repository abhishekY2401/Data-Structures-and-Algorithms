class Stack {
	static int a[];
	static int top;
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
	}

	int pop() {
		int res = -1;

		if (top == -1) {
			System.out.println("Under flow");
		} else {
			res = a[top];
			top--;
		}

		return res;
	}

	int peek() {
		if (top == -1) {
			System.out.println("Empty Stack");
		}
		return a[top];
	}

	boolean isEmpty() {
		return top == -1;
	}

	void displayArray() {
		System.out.print("Elements in the stack are : ");

		for (int i = 0; i <= top; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public static void main(String[] args) {
		// push(), pop(), peek(), isEmpty(), size()

		Stack stack = new Stack(5);
		stack.push(1);
		System.out.println("Your data is pushed inside the stack.");
		stack.push(2);
		System.out.println("Your data is pushed inside the stack.");
		stack.push(3);
		System.out.println("Your data is pushed inside the stack.");
		stack.push(4);
		System.out.println("Your data is pushed inside the stack.");
		stack.push(5);
		System.out.println("Your data is pushed inside the stack.");

		stack.pop();
		System.out.println("Last element is popped from the stack.");
		stack.pop();
		System.out.println("Last element is popped from the stack.");

		int val = stack.peek();
		System.out.println("Element at the top of stack is : " + val);

		stack.displayArray();

	}
}