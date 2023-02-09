package com.sparta;

package com.sparta.mg.binarytree;

public interface IBinaryTree {
    int getRootElement();

    int getNumberOfElements();

    void addElement(int element);

    void addElements(int[] elements);

    boolean findElement(int value);

    int getLeftChild(int element);

    int getRightChild(int element);

    int[] getSortedTreeAsc();

    int[] getSortedTreeDesc();
}