package com.sparta;
import com.sparta.extension.ChildNotFoundException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ProgramTest {

    @ParameterizedTest
    @ValueSource(ints = {-1,10,3,5,})
    @DisplayName("Test the method to get root element")
    public void testGetRoot(int value){
    BinaryTree tree1=new BinaryTree();
    tree1.root=new Node(value);
    int expected=value;
    int result=tree1.getRootElement();
    Assertions.assertEquals(expected,result);
}

    @Test
    @DisplayName("Test getNumberOfElement given the exampleTree of size of 8")
    void testGetNumberOfElementGivenTreeSize8(){
        BinaryTree binTree = new ExampleTree().createTree();
        int result=binTree.getNumberOfElements();
        int expected=8;
        Assertions.assertEquals(expected,result);
    }

//    @Test
//    @DisplayName("Test addElement given the exampleTree")
//    void testAddElement(){
//        BinaryTree expectedBinaryTree = new ExampleTree().createTree();
//        BinaryTree resultBinaryTree=new BinaryTree();
//        resultBinaryTree.addElement(17);
//        resultBinaryTree.addElement(13);
//        resultBinaryTree.addElement(4);
//        resultBinaryTree.addElement(9);
//        resultBinaryTree.addElement(19);
//        resultBinaryTree.addElement(29);
//        resultBinaryTree.addElement(18);
//        resultBinaryTree.addElement(1);
//        Assertions.assertEquals(expectedBinaryTree,resultBinaryTree);
//    }

//    @Test
//    @DisplayName("Test addElement add root")
//    void testAddElementAddRoot(){
//        BinaryTree expectedBinaryTree = new BinaryTree();
//        BinaryTree resultBinaryTree=new BinaryTree();
//        resultBinaryTree.addElement(17);
//        expectedBinaryTree.setRoot(new Node(17));
//        expectedBinaryTree.setCurrentNode(new Node(17));
//        Assertions.assertEquals(expectedBinaryTree,resultBinaryTree);
//    }

    @ParameterizedTest
    @ValueSource(ints = {17,13,4,1,9,19,18,29})
    @DisplayName("findElement can finds existing element in the tree")
    void testFindElement(int element){
        BinaryTree testTree=new ExampleTree().createTree();
        boolean result=testTree.findElement(element);
        boolean expected=true;
        Assertions.assertEquals(expected,result);
    }
    @ParameterizedTest
    @ValueSource(ints = {2,10,30,40,50})
    @DisplayName("findElement cannot finds non existing element in the tree")
    void testFindNoElement(int element){
        BinaryTree testTree=new ExampleTree().createTree();
        boolean result=testTree.findElement(element);
        boolean expected=false;
        Assertions.assertEquals(expected,result);
    }

    @Test
    @DisplayName("find left child of node13")
    void findLeftChildOfNode13(){
        BinaryTree testTree=new ExampleTree().createTree();
        int expected=4;
        int result;
        try {
            result = testTree.getLeftChild(13);
        } catch (ChildNotFoundException e) {
            throw new RuntimeException(e);
        }
        Assertions.assertEquals(expected,result);
    }

    @Test
    @DisplayName("find no left child of node1")
    void findLeftChildOfNode1() {
        BinaryTree testTree = new ExampleTree().createTree();
        Assertions.assertThrows(ChildNotFoundException.class, () -> testTree.getLeftChild(1));
    }

    @Test
    @DisplayName("find right child of node19")
    void findRightChildOfNode19(){
        BinaryTree testTree=new ExampleTree().createTree();
        int expected=29;
        int result;
        try {
            result = testTree.getRightChild(19);
        } catch (ChildNotFoundException e) {
            throw new RuntimeException(e);
        }
        Assertions.assertEquals(expected,result);
    }

    @Test
    @DisplayName("find no left child of node13")
    void findNoRightChildOfNode13() {
        BinaryTree testTree = new ExampleTree().createTree();
        Assertions.assertThrows(ChildNotFoundException.class, () -> testTree.getLeftChild(113));
    }

        @Test
    @DisplayName("Checking No Right Child Exception works")
    void checkNoRightChildException() {
        BinaryTree binTree = new BinaryTree();
        binTree.addElement(12);
        binTree.addElement(22);
        Assertions.assertThrows(ChildNotFoundException.class, () -> binTree.getRightChild(22));

    }


//    @Test
//    @DisplayName("Checking existing Child does not throw Exception")
//    void checkNoRightChildException2() {
//        BinaryTree binTree = new BinaryTree();
//        binTree.addElement(12);
//        binTree.addElement(22);
//        Assertions.assertDoesNotThrow(ChildNotFoundException.class, () -> binTree.getRightChild(12));
//    }


    @Test
    @DisplayName("Checking No Left Child exception works")
    void checkNoLeftChildException() {
        BinaryTree binTree = new BinaryTree();
        binTree.addElement(12);
        Assertions.assertThrows(ChildNotFoundException.class, () -> binTree.getLeftChild(12));
    }

@Test
    @DisplayName("test the sortAscend")
    void testSortAscend(){
        int[] expected={1,4,9,13,17,18,19,29};
    BinaryTree testTree = new ExampleTree().createTree();
        int[] actual=testTree.getSortedTreeAsc();
        Assertions.assertArrayEquals(expected,actual);
}

    @Test
    @DisplayName("test the sortDescend")
    void testSortDescend(){
        int[] expected={29,19,18,17,13,9,4,1};
        BinaryTree testTree = new ExampleTree().createTree();
        int[] actual=testTree.getSortedTreeDesc();
        Assertions.assertArrayEquals(expected,actual);
    }
}
