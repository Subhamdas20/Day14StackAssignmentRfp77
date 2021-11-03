package com.blz.stack;

import com.bz.linkedlist.MyLinkedList;
import com.bz.linkedlist.INode;
import com.bz.linkedlist.MyNode;

public class MyStack {
    /*
     * To create stack operations
     * */

    private MyLinkedList myLinkedList;

    /*
     *  Constructor
     */
    public MyStack() {
        this.myLinkedList = new MyLinkedList();
    }

    /*
     * used to push nodes
     */
    public void push(INode myNode) {
        myLinkedList.add(myNode);

    }

    /*
     * used to peak
     */
    public INode peak() {
        return myLinkedList.head;
    }

    public void printStack() {
        myLinkedList.printNodes();
    }

    public INode pop() {
        return myLinkedList.pop();
    }
    public boolean isEmpty() {
        return myLinkedList.head == null;
    }

}
