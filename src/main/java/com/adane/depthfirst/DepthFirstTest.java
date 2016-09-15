package com.adane.depthfirst;

import com.adane.util.Node;
import com.adane.util.TreeUtil;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by agebrem on 9/14/16.
 */
public class DepthFirstTest {

    PreOrder preorder;
    InOrder inOrder;
    PostOrder postOrder;
    Node<Character> root;

    @Before
    public void init(){
        preorder = new PreOrder();
        inOrder = new InOrder();
        postOrder = new PostOrder();
        root = TreeUtil.getRoot();
    }

    @Test
    public void validatePreOrderTraversal(){
        Assert.assertEquals("F,D,B,A,C,E,J,G,I,H,K,", preorder.preorderTraversal(root));
    }

    @Test
    public void validateInOrderTraversal(){
        Assert.assertEquals("A,B,C,D,E,F,G,H,I,J,K,", inOrder.InOrderTraversal(root));
    }

    @Test
    public void validatePostOrderTraversal(){
        Assert.assertEquals("A,C,B,E,D,H,I,G,K,J,F,", postOrder.postOrderTraversal(root));
    }
}
