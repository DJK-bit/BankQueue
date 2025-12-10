/**
 * Implementation of a circular Queue
 */
public class MyQueue {

    private int[] data;
    private int front = 0;
    private int rear = 0;
    private int size = 0;

    MyQueue(int capacity) {
        data = new int[capacity];
    }

    /**
     * Adds a new value to the rear of the queue.
     *
     * Time complexity: O(1)
     * Space complexity: O(1)
     *
     * @param value the value the user wants to add to the rear of the queue.
     */
    public void enqueue(int value) {
        if (isFull()) {
            return;
        }
        data[rear] = value;
        rear = (rear + 1) % data.length;
        size++;
    }

    /**
     * Removes and returns the value at the front of the queue.
     *
     * Time complexity: O(1)
     * Space complexity: O(1)
     *
     * @return the value the user wants to remove from the front of the queue.
     */
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int value = data[front];
        front = (front + 1) % data.length;
        size--;

        return value;
    }

    /**
     * Checks if the queue is empty.
     *
     * Time complexity: O(1)
     * Space complexity: O(1)
     *
     * @return true if queue is empty, false otherwise
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Checks if the queue is full.
     *
     * Time complexity: O(1)
     * Space complexity: O(1)
     *
     * @return true if queue is full, false otherwise
     */
    public boolean isFull() {
        return size == data.length;
    }

    /**
     * Returns the value at the front of the queue.
     *
     * Time complexity: O(1)
     * Space complexity: O(1)
     *
     * @return the value at the front of the queue
     */
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        return data[front];
    }

    /**
     * Gets the size of the queue.
     *
     * Time complexity: O(1)
     * Space complexity: O(1)
     *
     * @return the size of the queue
     */
    public int size() {
        return size;
    }

    /**
     * Gets the capacity of the queue.
     *
     * Time complexity: O(1)
     * Space complexity: O(1)
     *
     * @return the capacity of the queue
     */
    public int capacity() {
        return data.length;
    }


     /**
     * Prints all elements inside of the queue.
     *
     * Time complexity: O(n)
     * Space complexity: O(1)
     *
     */
    public void print() {
        if (isEmpty()) {
            System.out.println("Empty");
            return;
        }

        int index = front; 

        for (int i = 0; i < size; i++) {
            System.out.print(data[index]+" ");
            index = (index + 1) % data.length; 
        }
    }
}
