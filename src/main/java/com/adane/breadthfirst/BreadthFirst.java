package com.adane.breadthfirst;

import com.adane.util.Node;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by agebrem on 9/14/16.
 */
public class BreadthFirst {


    public String levelOrderTraverse(Node<Character> root) {

        if(root == null) {
            System.out.println("ERROR: Tree is empty...");
            return "";
        }

        String result = "";
        Queue<Node<Character>> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            Node<Character> current = queue.peek();
            result += current.data + ", ";
            queue.remove();
            if(current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }
        }
        return result;
    }

}
