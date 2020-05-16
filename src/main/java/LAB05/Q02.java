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
        System.out.print("Enter infix expression : ");
        Scanner a = new Scanner(System.in);
        String input = a.nextLine();
        System.out.println("The infix expression is: "+inputToInfix(input));
        String infix = inputToInfix(input);
        System.out.println("The postfix expression is: "+infixToPostfix(infix));
        String postfix = infixToPostfix(infix);
        System.out.println("The result is: "+postfixEvaluation(postfix));
    }
    
    public static String infixToPostfix(String a){
        String str="";
        char c = ' ';
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<a.length();i++){
            if(Character.isLetterOrDigit(a.charAt(i)))
                str += a.charAt(i);
            else if(a.charAt(i)=='(')
                stack.push(a.charAt(i));
            else if(a.charAt(i)==')'){
                c = stack.pop();
                while(c!='('){
                    str+=c;
                    c= stack.pop();
                }
            }else{
                if(!stack.isEmpty()){
                    if(stack.peek()=='(')
                        stack.push(a.charAt(i));
                    else{
                        c = stack.peek();
                        while(getPriority(a.charAt(i)) <= getPriority(c)){
                            str+=stack.pop();
                            if(!stack.isEmpty()){
                                c = stack.peek();
                                if(c=='(')
                                    break;
                            }else
                                break;
                        }
                        stack.push(a.charAt(i));
                    }
                }else
                    stack.push(a.charAt(i));
            }
        }
        while(!stack.isEmpty())
            str+=stack.pop();
        
        return str;
    }
    
    
    public static int getPriority(char a){
        switch(a){
                case '*':
                case '/':
                case '%':
                    return 2;
                case '+':
                case '-':
                    return 1;
                default:
                    return 0;
        }
    }
    
    public static String inputToInfix(String expression){
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
    
    public static int postfixEvaluation(String a){
        Stack<String> stack = new Stack<>();
        String temp;
        int num1=0, num2=0, result=0;
        for(int i=0;i<a.length();i++){
            if(Character.isLetterOrDigit(a.charAt(i))){
                temp = a.substring(i,i+1);
                stack.push(temp);
            }else{
                num2 = Integer.parseInt(stack.pop());
                num1 = Integer.parseInt(stack.pop());
                result = getResult(num1, num2, a.charAt(i));
                stack.push(result+"");
            }
        }
        result = Integer.parseInt(stack.pop());
        return result;
    }
    
    public static int getResult(int a,int b,char c){
        switch(c){
            case '+':
                return a+b;
            case '-':
                return a-b;
            case '*':
                return a*b;
            case '/':
                return a/b;
            case '%':
                return a%b;
        }
        return 0;
    }

    private boolean ifParenthesis(String c) {
        if (c.contentEquals("(") || c.contentEquals(")")) return true;
        return false;
    }

    private int getOperatorPrecedence(String c) {
       if (c.contentEquals("*") || c.contentEquals("/") || c.contentEquals("%")) return 1;
        return 0;
    }

    private boolean isAnOperator(String c) {
       if (c.contentEquals("+") || c.contentEquals("-") ||
                c.contentEquals("*") || c.contentEquals("/") ||
                c.contentEquals("%") || c.contentEquals("(") || c.contentEquals(")")) return true;
        return false;
    }
}
