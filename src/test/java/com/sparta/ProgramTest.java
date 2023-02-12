package com.sparta;

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

}
