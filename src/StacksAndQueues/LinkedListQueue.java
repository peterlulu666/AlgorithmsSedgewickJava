package StacksAndQueues;

public class LinkedListQueue<AnyType> {
    class Node<AnyType> {
        AnyType data;
        Node next;

        //Constructor
        public Node(AnyType data) {
            this.data = data;
            this.next = null;

        }

    }

    Node head;
    Node tail;
    int currentSize;

    //Constructor
    public LinkedListQueue() {
        this.head = null;
        this.tail = null;
        this.currentSize = 0;

    }

    // Add last
    void enQueue(AnyType data) {
        // Create a new node
        var newNode = new Node<AnyType>(data);
        // If the queue is empty
        if (currentSize == 0) {
            // Let the head pointer point to the newNode
            this.head = newNode;
            // Let the tail pointer point to the newNode
            this.tail = newNode;
            // Increment currentSize
            this.currentSize++;
            return;

        }

        // If the queue is not empty
        // Let tail.next point to the newNode
        this.tail.next = newNode;
        // Move the tail pointer
        this.tail = newNode;
        // Increment the currentSize
        this.currentSize++;

    }

    // Remove first
    AnyType deQueue() {
        // If the queue is empty
        if (this.currentSize == 0) {
            return null;

        }

        // If the queue is not empty
        // If the queue has one node
        // Declare removedData and store the data to the removedData
        var removedData = this.head.data;
        if (this.currentSize == 1) {
//            // Let the head pointer point to null
//            this.head = null;
            // Let the tail pointer point to null
            this.tail = null;
//            // Decrement the currentSize
//            this.currentSize--;
//            // Return the removedData
//            return (AnyType) removedData;

        }

        // If the queue has more than one node
        // Move the head pointer
        this.head = this.head.next;
        // Decrement the currentSize
        this.currentSize--;
        // Return the removedData
        return (AnyType) removedData;

    }

    void show() {
        // Declare the tmpPointer and store the head pointer address to the tmpPointer
        var tmpPointer = this.head;
        // Declare queueStr
        var queueStr = "";
        for (int i = 0; i < this.currentSize; i++) {
            // Print the data
            queueStr = queueStr + tmpPointer.data + " -> ";
            // Move the tmpPointer
            tmpPointer = tmpPointer.next;

        }

        System.out.println(queueStr + "null");

    }

    public static void main(String[] args) {
        var linkedListQueue = new LinkedListQueue<Integer>();
        linkedListQueue.enQueue(100);
        linkedListQueue.enQueue(200);
        System.out.println(linkedListQueue.deQueue());
        System.out.println(linkedListQueue.deQueue());
        linkedListQueue.show();

    }

}
