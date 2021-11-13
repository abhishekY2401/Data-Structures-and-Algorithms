public class Queue {
    int front, rear;
    int capacity;
    int[] a;

    Queue(int capacity) {
        this.front = -1;
        this.rear = -1;
        this.capacity = capacity;
        a = new int[capacity];
    }

    // implement three functions - push, pop, peek

    void enqueue(int data) {
        // check whether the queue is full
        if (rear == capacity - 1) {
            System.out.println("Oops! Queue is full. Cannot push any element more. OverFlow!");
        }
        else if (isEmpty()) {
            front = -1;
            rear = -1;
            front++;
            rear++;
            a[rear] = data;
            System.out.println(data + " is inserted in queue");
        } else {
            rear++;
            a[rear] = data;
            System.out.println(data + " is inserted in queue");
        }
    }

    void dequeue() {
        // check whether the stack is empty
        if (isEmpty()) {
            System.out.println("Oops! Queue is empty. Cannot pop any element. UnderFlow!");
        } else {
            front++;
            System.out.println("Element is popped");
        }
    }

    void display() {
        System.out.print("[");
        for (int i=front; i<=rear; i++) {

            System.out.print(a[i]);
            if (i < rear) {
                System.out.print(", ");
            }
            if (i == rear) {
                System.out.println("]");
            }
        }
    }

    boolean isEmpty() {
        return ((front == -1 && rear == -1) || (front > rear));
    }

    public static void main(String[] args) {
        Queue queue = new Queue(10);
        queue.enqueue(29);
        queue.enqueue(24);
        queue.enqueue(15);
        queue.enqueue(89);
        queue.enqueue(25);
        queue.enqueue(78);

        queue.dequeue();
        queue.dequeue();

        queue.display();
    }
}
