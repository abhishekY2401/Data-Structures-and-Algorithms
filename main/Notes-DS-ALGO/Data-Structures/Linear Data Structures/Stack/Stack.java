public class Stack {
    int top;
    int capacity;
    int[] a;

    Stack(int capacity) {
        this.top = -1;
        this.capacity = capacity;
        a = new int[capacity];
    }

    // implement three functions - push, pop, peek

    void push(int data) {
        // check whether the stack is empty
        if (top == capacity - 1) {
            System.out.println("Oops! Stack is full. Cannot push any element more. OverFlow!");
        } else {
            top++;
            a[top] = data;
            System.out.println(data + " is inserted in stack");
        }
    }

    void pop() {
        // check whether the stack is empty
        if (isEmpty()) {
            System.out.println("Oops! Stack is empty. Cannot pop any element. UnderFlow!");
        } else {
            top--;
            System.out.println("Element is popped");
        }
    }

    void peek() {
        if (isEmpty()) {
            System.out.println("Oops! Stack is empty. Cannot pop any element. UnderFlow!");
        } else {
            System.out.println("Element at the top position is " + a[top]);
        }
    }

    void display() {
        System.out.print("[");
        for (int i=0; i<=top; i++) {

            System.out.print(a[i]);
            if (i < top) {
                System.out.print(", ");
            }
            if (i == top) {
                System.out.println("]");
            }
        }
    }

    boolean isEmpty() {
        return (top == -1);
    }

    public static void main(String[] args) {
        Stack stack = new Stack(10);
        stack.push(2);
        stack.push(25);
        stack.push(12);
        stack.push(82);
        stack.push(20);
        stack.push(72);

        stack.pop();
        stack.pop();

        stack.peek();

        stack.display();
    }
}
