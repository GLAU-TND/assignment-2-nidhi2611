/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.node;
// to define node properties
public class Node {
    private Node rear;
    private int size;

    public Node() {
        rear = null;
        size = 0;

    }

    public int getSize() {
        return size;
    }

    public Node getRear() {
        return rear;
    }

    public void setRear(Node rear) {
        this.rear = rear;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
