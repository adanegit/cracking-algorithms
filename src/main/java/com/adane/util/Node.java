package com.adane.util;

/**
 * Created by agebrem on 9/12/16.
 */
public class Node<T> {

    public T data;
    public Node left;
    public Node right;

    public Node(T data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

}
