package com.sparta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class BinaryTree implements IBinaryTree{
    Node root;
    Node currentNode;


//    ArrayList<Integer> arrOfInt=ArrayList<Integer>();

    @Override
    public int getRootElement() {
        return this.root.getValue();
    }

    @Override
    public int getNumberOfElements() {
        if (root == null) {
            return 0;
        }
        int total = 1;
        Node tempNode = currentNode;
        if (!currentNode.isLeftChildEmpty()) {
            currentNode = currentNode.getLeftChild();
            total += getNumberOfElements();
        }
        currentNode = tempNode;
        if (!currentNode.isRightChildEmpty()) {
            currentNode = currentNode.getRightChild();
            total += getNumberOfElements();
        }

        currentNode = tempNode;

        return total;
    }



/*
constructor and method follows dont use recursion but do work
leave these comment to now
 */
//    public BinaryTree(int value) {
//        this.root = new Node(value);
//    }
//
//    @Override
//    public void addElement(int element) {
//
//        Node currentNode = root;
//        while (currentNode.getValue() != element) {
//            if (element > currentNode.getValue()) {
//                if (currentNode.isRightChildEmpty()) {
//                    currentNode.setRightChild(new Node(element));
//                } else {
//                    currentNode = currentNode.getRightChild();
//                }
//            } else {
//                if (currentNode.isLeftChildEmpty()) {
//                    currentNode.setLeftChild(new Node(element));
//                } else {
//                    currentNode = currentNode.getLeftChild();
//                }
//            }
//        }
//
//    }

    @Override
    public void addElement(int element) {
//if root node does not exist then create it, if it does exist then insert node
        if(root == null){
            root=new Node(element);
            currentNode=root;
        }
        if (element<currentNode.getValue()){
            if(currentNode.getLeftChild()==null){
                currentNode.setLeftChild(new Node(element));
            } else {
                currentNode=currentNode.getLeftChild();
                addElement(element);
            }
        }
        if(element>currentNode.getValue()){
            if(currentNode.getRightChild()==null){
                currentNode.setRightChild(new Node(element));
            } else {
                currentNode=currentNode.getRightChild();
                addElement(element);
            }
        }
//        arrOfInt.add(element);
        currentNode=root;
    }

    @Override
    public void addElements(int[] elements) {
        for(int element: elements){
            this.addElement(element);
        }
    }

    @Override
    public boolean findElement(int value) {
        Node foundNode=findNode(value);
        if (foundNode ==null){
            return false;
        } else{
            return true;
        }
    }

public Node findNode(int value){
    if(currentNode == null){
        currentNode=root;
        return null;
    } else{
        if(currentNode.getValue() == value){
            Node storedNode=currentNode;
            currentNode=root;
            return storedNode;
        }
        else if (value<currentNode.getValue()){
            currentNode=currentNode.getLeftChild();
            return findNode(value);
        }
        else {
            currentNode=currentNode.getRightChild();
            return findNode(value);
        }
    }
}

    @Override
    public int getLeftChild(int element) {
        Node foundNode=findNode(element);
        if (foundNode == null){
            return 0;
        } else{
            Node leftChild=foundNode.getLeftChild();
            if (leftChild==null){
                return 0;
            } else {
                return leftChild.getValue();
            }
        }
    }

    @Override
    public int getRightChild(int element) {
        Node foundNode=findNode(element);
        if (foundNode == null){
            return 0;
        } else{
            Node rightChild=foundNode.getLeftChild();
            if (rightChild==null){
                return 0;
            } else {
                return rightChild.getValue();
            }
        }
    }

    @Override
    public int[] getSortedTreeAsc() {
        List<Integer> integerList = new ArrayList<Integer>();
        Node tempNode = currentNode;

        int[] leftArray;
        int[] rightArray;

        if (!currentNode.isLeftChildEmpty()) {
            currentNode = currentNode.getLeftChild();
            leftArray = getSortedTreeAsc();
        } else {
            leftArray = new int[0];
        }
        currentNode = tempNode;
        if (!currentNode.isRightChildEmpty()) {
            currentNode = currentNode.getRightChild();
            rightArray = getSortedTreeAsc();
        } else {
            rightArray = new int[0];
        }
        currentNode = tempNode;

        int[] value = new int[1];
        value[0] = currentNode.getValue();
        int[] temp = IntStream.concat(Arrays.stream(leftArray), Arrays.stream(value)).toArray();
        int[] result = IntStream.concat(Arrays.stream(temp), Arrays.stream(rightArray)).toArray();
        return result;
    }

    @Override
    public int[] getSortedTreeDesc() {
        Node tempNode = currentNode;

        int[] leftArray;
        int[] rightArray;

        if (!currentNode.isRightChildEmpty()) {
            currentNode = currentNode.getRightChild();
            leftArray = getSortedTreeDesc();
        } else {
            leftArray = new int[0];
        }
        currentNode = tempNode;

        if (!currentNode.isLeftChildEmpty()) {
            currentNode = currentNode.getLeftChild();
            rightArray = getSortedTreeDesc();
        } else {
            rightArray = new int[0];
        }
        currentNode = tempNode;

        int[] value = new int[1];
        value[0] = currentNode.getValue();
        int[] temp = IntStream.concat(Arrays.stream(leftArray), Arrays.stream(value)).toArray();
        int[] result = IntStream.concat(Arrays.stream(temp), Arrays.stream(rightArray)).toArray();
        return result;
    }
}
