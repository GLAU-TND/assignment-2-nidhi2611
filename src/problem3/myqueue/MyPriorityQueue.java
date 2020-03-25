/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem3.myqueue;

import problem3.Student;
import problem3.node.Node;

public class MyPriorityQueue {
    private Node rear;
    private Node front;
    private int size;

    public MyPriorityQueue() {
        rear = null;
        front = null;
        size = 0;
    }

    public void enqueue(Student data) {
        Node node = new Node(data);
        if (front == null) {
            front = node;
            rear = node;
            size++;
        } else {
            Node temp = front;
                int k = node.compareTo(temp.getData());
                if (k > 0) {
                    node.setNext(temp);
                    front = node;
                    size++;

                } else if (k <= 0) {
                    rear.setNext(node);
                    rear = node;
                    size++;
                }
            }


    }

    public void show() {
        Node temp = front;
        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }

    public void peek() {
        System.out.println(front.getData());
    }

}



