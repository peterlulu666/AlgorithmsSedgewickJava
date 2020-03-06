package StacksAndQueues;

public class LinkedListStack<AnyType> {
    class Node<AnyType> {
        AnyType data;
        Node next;

        // Constructor
        public Node(AnyType data) {
            this.data = data;
            this.next = null;

        }

    }

    Node head;
    int currentSize;
    // Constructor


    public LinkedListStack() {
        this.head = null;
        this.currentSize = 0;

    }

    void push(AnyType data) {
        // Create a new node
        var newNode = new Node<AnyType>(data);
        // Let newNode.next point to the head
        newNode.next = this.head;
        // Let the head pointer point to the newNode
        this.head = newNode;
        // Increment the currentSize
        this.currentSize++;

    }

    AnyType pop() {
        // Check if the stack is empty
        if (this.currentSize == 0) {
            return null;

        }
        // Store the removed data in removedData
        var removedData = this.head.data;
        // Move the head pointer
        this.head = this.head.next;
        // Decrement the currentSize
        this.currentSize--;
        // Return the removedData
        return (AnyType) removedData;

    }

    void show() {
        // Copy the head pointer and store the address to tmpPointer
        var tmpPointer = this.head;
        var listStr = "";
        for (int i = 0; i < this.currentSize; i++) {
            // Print the data
            listStr = listStr + tmpPointer.data + " -> ";
            // Move the tmpPointer
            tmpPointer = tmpPointer.next;

        }
        System.out.println(listStr + "null");

    }

    public static void main(String[] args) {
        var linkedListStack = new LinkedListStack<Integer>();
        linkedListStack.push(100);
        linkedListStack.push(200);
        linkedListStack.show();
        System.out.println(linkedListStack.pop());
        linkedListStack.show();

    }
}
