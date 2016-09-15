package com.adane.stack;

import java.util.Stack;

/**
 * Created by agebrem on 9/13/16.
 */
public class App {

    public boolean isParenthesisBalanced(String expression) {
        // check if expression is null or empty
        if(expression == null || expression.equals("")) {
            System.out.println("ERROR: Expression can't be empty or NULL");
            return false;
        }

        Stack stack = new Stack();
        for (int i=0; i<expression.length(); i++) {

            if(expression.charAt(i) == '['
                    || expression.charAt(i) == '{'
                    || expression.charAt(i) == '(') {
                stack.push(expression.charAt(i));
            } else if (expression.charAt(i) == ']'
                    || expression.charAt(i) == '}'
                    || expression.charAt(i) == ')') {

                if(stack.isEmpty()
                        || (expression.charAt(i) == ']' && (Character)stack.peek() != '[')
                        || (expression.charAt(i) == '}' && (Character)stack.peek() != '{')
                        || (expression.charAt(i) == ')' && (Character)stack.peek() != '(')) {
                    return false;
                }
                stack.pop();

            }
        }

        return stack.isEmpty();
    }
}
