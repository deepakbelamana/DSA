package com.rbst;
class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}
/*
class BinarySearchTree {
    Node root;

    // Insert a new node into the BST
    Node insert(Node root, int key) {
        if (root == null) {
            return new Node(key);
        }

        if (key < root.data) {
            root.left = insert(root.left, key);
        } else if (key > root.data) {
            root.right = insert(root.right, key);
        }

        return root;
    }

    // Check if a value is present in the BST
    boolean isNodePresent(Node root, int value) {
        if (root == null) {
            return false;
        }
        if (root.data == value) {
            return true;
        }
        if (root.data < value) {
            return isNodePresent(root.right, value);
        }
        return isNodePresent(root.left, value);
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        int[] keys = {15, 10, 20, 8, 12, 17, 25};

        for (int key : keys) {
            tree.root = tree.insert(tree.root, key);
        }

        int valueToSearch = 12;
        if (tree.isNodePresent(tree.root, valueToSearch)) {
            System.out.println(valueToSearch + " is present in the BST.");
        } else {
            System.out.println(valueToSearch + " is not present in the BST.");
        }
    }
}
*/

