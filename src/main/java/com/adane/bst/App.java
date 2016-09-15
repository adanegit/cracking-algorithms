package com.adane.bst;

import com.adane.bt.BinaryTree;

/**
 * Created by agebrem on 9/12/16.
 */
public class App {

    public static void main(String[] args) {
        BST bst = new BST();
        bst.insert(15);
        bst.insert(20);
        bst.insert(10);
        bst.insert(12);
        bst.insert(25);
        bst.insert(17);
        bst.insert(6);

        // Find min of BST
        System.out.println(bst.findMin(bst.root));

        // Find max of BST
        System.out.println(bst.findMax(bst.root));

        // Find height of BST
        System.out.println(bst.findHeight(bst.root));

        //
        System.out.println(BinaryTree.isBinarySearchTree(bst.root));
    }
}
