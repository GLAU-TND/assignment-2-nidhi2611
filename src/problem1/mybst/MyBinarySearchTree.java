/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.mybst;

import problem1.node.TreeNode;

// to implement BinarySearchTree
public class MyBinarySearchTree {
    public static StringBuilder preOrderString;
    static int levels = 0;
    public TreeNode root;

    public MyBinarySearchTree() {
        this.root = null;
        preOrderString = new StringBuilder();

    }

    public static void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        preOrderString.append(root.getData() + " ");
        preOrder(root.getLeft());
        preOrder(root.getRight());
    }

    public void add(final int value) {
        this.root = addService(this.root, value);
    }

    private TreeNode addService(TreeNode treeRoot, int value) {
        return treeRoot;
    }
}
