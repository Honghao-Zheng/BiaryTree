package com.sparta;

import java.util.Arrays;
import java.util.logging.Logger;

import com.sparta.extension.ChildNotFoundException;
import com.sparta.logging.logWrapper;


public class Main {
    public static final Logger logger=Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {

        logWrapper.logIt(logger);

//        BinaryTree binTree = new BinaryTree();
//        binTree.addElement(17);
//        binTree.addElement(13);
//        binTree.addElement(4);
//        binTree.addElement(9);
//        binTree.addElement(19);
//        binTree.addElement(29);
//        binTree.addElement(18);
//        binTree.addElement(1);
//        System.out.println(binTree.findElement(15));//false
//        System.out.println(binTree.findElement(3));//false
//        System.out.println(binTree.findElement(17));//true
//        System.out.println(binTree.findElement(24));//false
//        System.out.println(binTree.findElement(9));//true
//        System.out.println(binTree.findElement(19));//true
//        System.out.println(binTree.findElement(29));//true
//        System.out.println(Arrays.toString(binTree.getSortedTreeAsc()));
//        System.out.println(binTree.getNumberOfElements());

//       try {
//           System.out.println(binTree.getRightChild(13));
//       } catch (ChildNotFoundException e){
//           e.printStackTrace();
//       }
//        System.out.println(binTree.getLeftChild(19));
//        System.out.println(binTree.getLeftChild(18));

    }
}
