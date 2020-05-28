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
public class Q04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a expression : ");
        String input = scanner.nextLine();
        System.out.println(input);
        checkExpression(input);
    }
    
     public static void checkExpression(String expression) {
        Stack<Character> symbol = new Stack<>();
        char c, first, second, third;
        for (int i = 0; i < expression.length(); i++) {
            c = expression.charAt(i);
            if (c == '\\') {
                i++;
                continue;
            }

            if (isOpenBracket(c)) {
                symbol.push(c);
            } else if (isCloseBracket(c)) {
                if (!symbol.isEmpty()) {
                    first = symbol.peek();
                    if (getPair(first) == c) {
                        symbol.pop();
                    } else if (getPair(first) != c) {
                        for (int a = 0; a < i; a++) System.out.print(" ");
                        System.out.print("^ Missing " + getPair(first));
                        System.out.println();
                        break;
                    }
                } else { //Stack is empty but suddenly found a close bracket
                    for (int a = 0; a < i; a++) System.out.print(" ");
                    System.out.print("^ Extra " + c);
                    System.out.println();
                    break;
                }
            }

            if (c == ';' && !symbol.isEmpty() && isOpenBracket(symbol.peek())) {
                for (int a = 0; a < i; a++) System.out.print(" ");
                System.out.print("^ Missing " + getPair(symbol.peek()));
                System.out.println();
                break;
            }
        }

        if (symbol.getSize() == 0) {
            System.out.println("The expression is balanced, as all things should be");
        }
    }
     
     public static boolean isOpenBracket(char c) {
        if (c == '(' || c == '{' || c == '[') return true;
        return false;
    }

    private static boolean isCloseBracket(char c) {
        if (c == ')' || c == '}' || c == ']') return true;
        return false;
    }

    private static char getPair(char c) {
        if (c == '(') {
            return ')';
        } else if (c == ')') {
            return '(';
        } else if (c == '[') {
            return ']';
        } else if (c == ']') {
            return '[';
        } else if (c == '{') {
            return '}';
        } else if (c == '}') {
            return '{';
        }
        return 0;
    } 
    
}
