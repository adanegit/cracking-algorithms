package com.adane.stack;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by agebrem on 9/13/16.
 */
public class AppTest {

    App app = new App();

    @Test
    public void validateIsParenthesisBalanced(){
        Assert.assertTrue(app.isParenthesisBalanced("{25(A + B[X - Y] + Z)}"));
        Assert.assertFalse(app.isParenthesisBalanced("{25(A + B[X - Y) + Z]}"));
        Assert.assertFalse(app.isParenthesisBalanced("]()}"));
        Assert.assertFalse(app.isParenthesisBalanced(""));

    }
}
