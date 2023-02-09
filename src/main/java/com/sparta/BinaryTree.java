package com.sparta;

public class BinaryTree implements IBinaryTree{
    Node root;
    Node currentNode;




    @Override
    public int getRootElement() {
        return this.root.getValue();
    }

    @Override
    public int getNumberOfElements() {
        return 0;
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
    }

    @Override
    public void addElements(int[] elements) {
        for(int element: elements){
            this.addElement(element);
        }
    }

    @Override
//    public boolean findElement(int value) {
//        Node currentNode = root;
//        boolean exists = true;
//        while (currentNode.getValue() != value) {
//            if (value > currentNode.getValue()) {
//                if (!currentNode.isRightChildEmpty()) {
//                    currentNode = currentNode.getRightChild();
//                } else {
//                    exists = false;
//                    break;
//                }
//            } else {
//                if (!currentNode.isLeftChildEmpty()) {
//                    currentNode = currentNode.getLeftChild();
//                } else {
//                    exists = false;
//                    break;
//                }
//            }
//        }
//        return exists;
//    }
    public boolean findElement(int value) {
        BinaryTree tree=new BinaryTree(value)
        if (currentNode.getValue() == value) {
            return true;
        } else {
            if (!currentNode.isLeftChildEmpty())
                return findElement(currentNode.getLeftChild().getValue());
            else if (!currentNode.isRightChildEmpty())
                return findElement(currentNode.getRightChild().getValue());
        }
        return false;
    }


    @Override
    public int getLeftChild(int element) {
        return 0;
    }

    @Override
    public int getRightChild(int element) {
        return 0;
    }

    @Override
    public int[] getSortedTreeAsc() {
        return new int[0];
    }

    @Override
    public int[] getSortedTreeDesc() {
        return new int[0];
    }
}
