package com.company;


public class BinarySearchTree {

    Node firstNode;

    public void insert(int value) {
        if (firstNode == null) {
            firstNode = new Node(value);
        } else {
            insertOn(value, firstNode);
        } //какой то другой метод

    }

    private void insertOn(int value, Node firstNode) {
        if (firstNode.value > value) {
            if (firstNode.currentLeft == null) {
                firstNode.currentLeft = new Node(value);
            } else {
                insertOn(value, firstNode.currentLeft);
            }


        } else if (firstNode.value < value) {
            if (firstNode.currentRight == null) {
                firstNode.currentRight = new Node(value);
            } else insertOn(value, firstNode.currentRight);
        }


    }

    public void showThreePrefix(Node firstNode) {
        if (firstNode != null) {
            System.out.print(firstNode.value+ " ");
            showThreePrefix(firstNode.currentLeft);
            showThreePrefix(firstNode.currentRight);
        }

    }

    public void showThreeInfix(Node firstNode) {

        if (firstNode != null) {
            showThreeInfix(firstNode.currentLeft);
            System.out.print(firstNode.value+ " ");
            showThreeInfix(firstNode.currentRight);
        }
    }

    public void showThreePostfix(Node firstNode) {
        if (firstNode != null) {
            showThreePostfix(firstNode.currentLeft);
            showThreePostfix(firstNode.currentRight);
            System.out.print(firstNode.value+ " ");
        }

    }

    public class Node {

        Node currentLeft;
        Node currentRight;
        int value;

        Node(int value) {
            this.value = value;
        }
    }
}