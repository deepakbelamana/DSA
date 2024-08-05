import com.customStack.CustomStack;
import com.customStack.SortStack;
import com.hashTable.GroupAnagrams;
import com.linkedList.LinkedList;
import com.rbst.BinarySearchTree;
import com.slidingWindow.CountOccurencesOfAnagrams;
import com.slidingWindow.FirstNegativIntegerInWindowK;
import com.slidingWindow.SlidingWindowMaximum;

import java.util.*;
import java.util.ArrayList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        BinarySearchTree myBST = new BinarySearchTree();

        myBST.insert(47);
        myBST.insert(21);
        myBST.insert(76);
        myBST.insert(18);
        myBST.insert(27);
        myBST.insert(52);
        myBST.insert(82);

        System.out.println("Breadth First Search:");
        System.out.println(myBST.BFS());


    }
}
