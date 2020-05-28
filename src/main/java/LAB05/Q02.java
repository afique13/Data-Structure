/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB05;

import java.util.Scanner;

/**
 *
 * @author Owner
 */
public class Q02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter infix expression : ");
        String infix = scanner.nextLine();
        System.out.println("The infix expression is: " + toSymbol(infix));
        infix = toSymbol(infix);
        System.out.println("The postfix expression is: " + infixToPostfix(infix));
        infix = infixToPostfix(infix);
        countPostfixExpression(infix);
    }
    
    public static String toSymbol(String expression) {
        String newExpression = expression;
        newExpression = newExpression.replace("mul", "*");
        newExpression = newExpression.replace("add", "+");
        newExpression = newExpression.replace("sub", "-");
        newExpression = newExpression.replace("div", "/");
        newExpression = newExpression.replace("mod", "%");
        newExpression = newExpression.replace("ob", "(");
        newExpression = newExpression.replace("cb", ")");
        return newExpression;
    }
    
    public static String infixToPostfix(String expression) {
        String newExpression = "";
        Stack<String> operator = new Stack<>();
        String[] split = expression.split(" ");
        for (int i = 0; i < split.length; i++) {
            String c = split[i];
            if (!isAnOperator(c)) { // its an operand
                newExpression += c + " ";
            } else { // its an operator
                if (operator.isEmpty() || getOperatorPrecedence(c) > getOperatorPrecedence(operator.peek()) || operator.peek().contentEquals("(")) {
                    operator.push(c);
                } else {
                    if (!ifParenthesis(c)) {
                        while (!operator.isEmpty() && getOperatorPrecedence(c) <= getOperatorPrecedence(operator.peek())) {
                            if (operator.peek().contentEquals("(") || operator.peek().contentEquals(")")) break;
                            newExpression += operator.pop() + " ";
                        }
                        operator.push(c);
                    } else { //if got parentheses
                        if (c.contentEquals("(")) {
                            operator.push(c);
                        } else { // close bracket )
                            while (!operator.peek().contentEquals("(")) {
                                newExpression += operator.pop() + " ";
                            }
                            operator.pop();
                        }
                    }
                }
            }
        }
        while (!operator.isEmpty()) newExpression += operator.pop() + " ";
        return newExpression;
    }
    
    public static boolean isAnOperator(String c) {
        if (c.contentEquals("+") || c.contentEquals("-") ||
                c.contentEquals("*") || c.contentEquals("/") ||
                c.contentEquals("%") || c.contentEquals("(") || c.contentEquals(")")) return true;
        return false;
    }
    
    public static int getOperatorPrecedence(String c) {
        if (c.contentEquals("*") || c.contentEquals("/") || c.contentEquals("%")) return 1;
        return 0;
    }

    public static boolean ifParenthesis(String c) {
        if (c.contentEquals("(") || c.contentEquals(")")) return true;
        return false;
    }
    
    public static void countPostfixExpression(String expression) {
        int value;
        Stack<String> stack = new Stack<>();
        String[] split = expression.split(" ");
        for (int i = 0; i < split.length; i++) {
            stack.push(split[i]);
            if (isAnOperator(split[i])) {
                String newCharacter = evaluate(stack.pop(), stack.pop(), stack.pop());
                stack.push(newCharacter);
            }
        }
        value = Integer.valueOf(stack.pop());
        System.out.println("The result is: " + value);
    }
    
    public static String evaluate(String operator, String operand2, String operand1) {
        int finalValue = 0;
        int value1 = Integer.valueOf(operand1);
        int value2 = Integer.valueOf(operand2);
        if (operator.contentEquals("+")) {
            finalValue = value1 + value2;
        } else if (operator.contentEquals("-")) {
            finalValue = value1 - value2;
        } else if (operator.contentEquals("*")) {
            finalValue = value1 * value2;
        } else if (operator.contentEquals("/")) {
            finalValue = value1 / value2;
        } else if (operator.contentEquals("%")) {
            finalValue = value1 % value2;
        }
        return String.valueOf(finalValue);
    }
}
