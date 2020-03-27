package problem4.myqueue;

public class MyQueue {
    private Node front, end, tmp;
    private int size;

    public MyQueue() {
        front = null;
        end = null;
        tmp = null;
        size = 0;

    }

    public int getSize(MyQueue queue) {
        queue.tmp = queue.front;
        while (queue.tmp != null) {
            ++size;
            queue.tmp = queue.tmp.getNext();
        }
        queue.tmp = queue.front;
        return size;

    }

    public void setSize(int size) {

        this.size = size;

    }


}
