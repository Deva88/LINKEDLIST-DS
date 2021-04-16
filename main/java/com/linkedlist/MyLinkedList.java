package com.linkedlist;

public class MyLinkedList {

    public INode head;
    public INode tail;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void add(INode newNode) {
        if (this.tail == null) {
            this.tail = newNode;
        }
        if (this.head == null) {
            this.head = newNode;
        } else {
            INode tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }
    }
    public void show() {
        INode node=head;
        while(node.getNext()!=null) {
            System.out.println(node.getKey());
            node=node.getNext();
        }
        System.out.println(node.getKey());
    }
}