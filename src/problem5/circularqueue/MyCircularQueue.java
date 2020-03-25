/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.circularqueue;


import problem5.node.Node;
import problem5.student.Student;

//to implement circular queue
public class MyCircularQueue {
    private Node rear;
    private int size;

    MyCircularQueue() {
        rear = null;
        size = 0;
    }

    public void enqueue(Student data) {
        Node node = new Node(data);
        if (!isEmpty()) {
            rear = node;
            size++;
        } else {
            node.setNext(rear.getNext());
            rear.setNext(node);
            rear = node;
            size++;
        }

    }

    private boolean isEmpty() {
        boolean response = false;
        if (rear == null)
            response = true;
        return response;
    }

    public boolean dequeue() {
        boolean response = false;
        if (!isEmpty()) {
            size--;
            response = true;
            if (rear.getNext() == rear) {
                rear = null;
            } else {
                rear.setNext(rear.getNext().getNext());
            }
        }
        return response;
    }
}
