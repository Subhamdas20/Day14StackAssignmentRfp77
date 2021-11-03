package com.blz.stack;
import com.bz.linkedlist.MyLinkedList;
import com.bz.linkedlist.INode;
import com.bz.linkedlist.MyNode;
public class MyStack {
    /*
    * To create stack operations
    * */

    private  MyLinkedList myLinkedList;
    /*
    *  Constructor
    */
    public MyStack() {
        this.myLinkedList = new MyLinkedList();
    }
/*
* used to push nodes
*/
    public void push(INode myNode){
        myLinkedList.add(myNode);

    }
    public INode peak(){
        return myLinkedList.head;
    }
    public void printStack() {
        myLinkedList.printNodes();
    }
    public void enqueu(INode myNode) {
        myLinkedList.append(myNode);
    }

}
