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
            boolean response = false;
            Node temp = front;
            while (temp.getNext() != null) {
                int k = node.compareTo(temp.getData());
                if (k > 0) {
                    node.setNext(temp);
                    front = node;
                    size++;
                    break;
                } else if (k <= 0) {
                    rear.setNext(node);
                    rear = node;
                    size++;
                    break;
                }
            }

        }
        }

    }



