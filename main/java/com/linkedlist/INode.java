package com.linkedlist;

public interface INode<K> {

    K getKey();

    void setKey(K key);

    INode getNext();

    void setKey(INode next);

    void setNext(INode next);

}