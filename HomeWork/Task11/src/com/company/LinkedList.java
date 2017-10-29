package com.company;

public class LinkedList<T> {

    private Node<T> head;
    private Node<T> tail;
    private int count;

    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.count = 0;
    }


    public void add(T element) {
        Node<T> temp=new Node<>(element);

        if (head != null) {
            tail.next=temp;
            tail=temp;

            count++;
        } else {
            head = temp;
            tail=head;
            count++;
        }
    }
    public T get(int index){

         Node<T> temp = head;
         for (int i =0;i<index;i++){
             temp= temp.next;
         }
         return temp.value;

    }

    public int size(){
        return count;
    }

    private static class Node<E> {
        E value;
        Node<E> next;

        public Node(E value) {
            this.value = value;

        }
    }

}
