package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(10);
        binarySearchTree.insert(15);
        binarySearchTree.insert(5);
        binarySearchTree.insert(21);
        binarySearchTree.insert(13);
        binarySearchTree.insert(3);
        binarySearchTree.insert(1);
        binarySearchTree.insert(4);

        binarySearchTree.showThreePrefix(binarySearchTree.firstNode);
        binarySearchTree.showThreeInfix(binarySearchTree.firstNode);
        binarySearchTree.showThreePostfix(binarySearchTree.firstNode);
    }

}
