package StacksAndQueues;

import java.util.Arrays;

public class ArrayStack<AnyType> {
    AnyType[] array;
    int capacity;
    int currentSize;

    // Constructor
    public ArrayStack(int capacity) {
        this.capacity = capacity;
        this.currentSize = 0;
        this.array = (AnyType[]) new Object[this.capacity];

    }

    void push(AnyType data) {
        // Check if the stack is full
        if (this.currentSize == capacity) {
            extendArray();

        }
        // Add data to array
        array[this.currentSize] = data;
        // Increment the currentSize
        this.currentSize++;

    }


    AnyType pop() {
        // Check if the stack is empty
        if (currentSize == 0) {
            return null;

        }
        // Declare the removedData
        var removedData = array[this.currentSize - 1];
        // Delete the data
        array[this.currentSize - 1] = null;
        // Decrement the currentSize
        this.currentSize--;
        // Return the removedData
        return removedData;

    }

    void show() {
        // Declare stackStr
        var stackStr = "";
        for (int i = 0; i < currentSize; i++) {
            stackStr = stackStr + array[i] + " ";

        }

        System.out.println("[ " + stackStr + "]");

    }

    private void extendArray() {
        // Declare extendCapacity
        var extendCapacity = capacity * 2;
        // Declare extendArray
        AnyType[] extendArray = (AnyType[]) new Object[extendCapacity];
        // Copy data in array to extendArray
        for (int i = 0; i < array.length; i++) {
            extendArray[i] = array[i];

        }
        // Let array point to extendArray
        // Let array reference to extendArray
        // Copy address of extendArray to array
        array = extendArray;
        // Let capacity point to extendCapacity
        // Let capacity reference to extendCapacity
        // Copy address of extendCapacity to capacity
        capacity = extendCapacity;

    }

    public static void main(String[] args) {
        var arrayStack = new ArrayStack<Integer>(2);
        arrayStack.push(100);
        arrayStack.push(200);
        arrayStack.push(300);
        arrayStack.push(400);
        arrayStack.push(500);
        System.out.println(arrayStack.pop());
        arrayStack.show();              
        System.out.println(Arrays.toString(arrayStack.array));

    }
}
