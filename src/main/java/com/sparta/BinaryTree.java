package com.sparta;

public class BinaryTree implements IBinaryTree{
    Node root;
    public BinaryTree(int value) {

        this.root = new Node(value);
    }

//    Node leftChild;
//    Node rightChild;



    @Override
    public int getRootElement() {
        return this.root.getValue();
    }

    @Override
    public int getNumberOfElements() {
        return 0;
    }

    @Override
    public void addElement(int element) {
        Node currentNode;
        if(element> root.getValue()){
            currentNode=root.getRightChild();
        } else {

        }

    }

    @Override
    public void addElements(int[] elements) {

    }

    @Override
    public boolean findElement(int value) {
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
