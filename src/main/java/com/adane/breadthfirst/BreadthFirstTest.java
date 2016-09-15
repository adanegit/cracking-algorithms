package com.adane.breadthfirst;

import com.adane.util.Node;
import com.adane.util.TreeUtil;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by agebrem on 9/14/16.
 */
public class BreadthFirstTest {

    BreadthFirst bs;
    Node<Character> root;

    @Before
    public void init(){
        root = TreeUtil.getRoot();
    }

    @Test
    public void validateLevelOrderTraversal(){
        Assert.assertEquals("F, D, J, B, E, G, K, A, C, I, H, ", bs.levelOrderTraverse(root));
    }
}
