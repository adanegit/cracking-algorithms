package com.adane.util;

/**
 * Created by agebrem on 9/14/16.
 */
public class TreeUtil {

    private static Node<Character> root = new Node<>('F');

    public static Node<Character> getRoot() {
        Node<Character> d = new Node('D');
        Node<Character> j = new Node('J');
        Node<Character> b = new Node('B');
        Node<Character> e = new Node('E');
        Node<Character> g = new Node('G');
        Node<Character> k = new Node('K');
        Node<Character> a = new Node('A');
        Node<Character> c = new Node('C');
        Node<Character> i = new Node('I');
        Node<Character> h = new Node('H');

        root.left = d;
        root.right = j;
        d.left = b;
        d.right = e;
        j.left = g;
        j.right = k;
        b.left = a;
        b.right = c;
        g.right = i;
        i.left = h;

        return root;
    }

}
