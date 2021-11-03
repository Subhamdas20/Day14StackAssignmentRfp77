package com.bz.teststack;
import com.bz.linkedlist.MyLinkedList;
import com.bz.linkedlist.MyNode;
import com.bz.linkedlist.INode;
import com.blz.stack.MyStack;
import org.junit.Assert;
import org.junit.Test;

public class MyStackTest {
    @Test
    public void given3NumbersWhenAddedToStackShouldHaveLastAddedNotes(){
        MyNode<Integer>  myFirstNode = new MyNode(70);
        MyNode<Integer> mySecondNode = new MyNode(30);
        MyNode<Integer>  myThirdNode = new MyNode(56);
        MyStack myStack = new MyStack();
        myStack.push(myFirstNode);
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);
        myStack.printStack();
        INode peak = myStack.peak();
        Assert.assertEquals(myThirdNode , peak);
    }
}
