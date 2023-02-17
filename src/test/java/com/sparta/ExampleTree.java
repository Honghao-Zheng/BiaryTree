package com.sparta;

import java.util.logging.Logger;

//package com.sparta;
//
public class ExampleTree {
    private static final Logger logger=Logger.getLogger(Main.class.getName());
     Node node4=new Node(4);
     Node node1=new Node(1);
     Node node9=new Node(9);
     Node node19=new Node(19);
     Node node18=new Node(18);
     Node node29=new Node(29);
     Node node17=new Node(17);
     Node node13=new Node(13);
    BinaryTree exampleTree=new BinaryTree();

    public ExampleTree() {
        this.node4.setLeftChild(node1);
        this.node4.setRightChild(node9);
        this.node13.setLeftChild(node4);
        this.node19.setLeftChild(node18);
        this.node19.setRightChild(node29);
        this.node17.setLeftChild(node13);
        this.node17.setRightChild(node19);
        this.exampleTree.setRoot(this.node17);
        this.exampleTree.setCurrentNode(this.node17);

    }
    public BinaryTree createTree(){
        return this.exampleTree;
    }
}
