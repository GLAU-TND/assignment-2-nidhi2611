/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:08 PM
 */
package problem4.main;

import problem1.mybst.MyBinarySearchTree;

import java.util.Scanner;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree tree = new MyBinarySearchTree();
        MyQueue queue = new MyQueue();
        System.out.println("no of elements you want to add");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < sc.nextInt(); i++) {
            tree.add(sc.nextInt());
        }
        queue.enqueue(tree.root);
        queue.printQueue();
    }
}
