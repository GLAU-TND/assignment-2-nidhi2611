package problem5.node;

import problem5.student.Student;

public class Node {
    private Student data;
    private Node next;

    public Node(Student data) {
        this.data = data;
        next = null;
    }

}
