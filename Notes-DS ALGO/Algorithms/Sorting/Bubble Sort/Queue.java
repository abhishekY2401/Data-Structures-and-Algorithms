public class Queue {
    int[] arr;
    int front, rear;
    int capacity;

    Queue(int capacity) {
        this.capacity = capacity;
        front = -1;
        rear = -1;
        arr = new int[capacity];
    }

    // adds the element from the rear side
    void enqueue(int data) {
        if (rear == capacity - 1) {
            System.out.println("Overflow!");
        }
        else if (front == -1 && rear == -1) {
            front++;
            rear++;
            arr[rear] = data;
            System.out.println(data + " is enqueued in the queue");
        } else {
            rear++;
            arr[rear] = data;
            System.out.println(data +" is enqueued in the queue");
        }

    }

    // deletes the element from the front side
    void dequeue() {
        if (front == -1) {
            System.out.println("Underflow!");
        }
        else if (front > rear) {
            front = - 1;
            rear = -1;
            System.out.println("Underflow!");
        } else {
            front++;
            System.out.println("Element is dequeued from the queue");
        }
    }

    void displayContent() {

        if ((front == -1 && rear == -1) || (front > rear)) {
            System.out.println("Queue is Empty");
        } else {
            System.out.print("Elements in the queue are : ");
            for (int i = front; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {

        // Allocating the memory for Queue by initializing the object
        Queue queue = new Queue(8);
        queue.enqueue(1);
        queue.enqueue(5);
        queue.enqueue(3);
        queue.enqueue(8);
        queue.enqueue(1);
        queue.enqueue(9);

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        queue.displayContent();
    }
}
