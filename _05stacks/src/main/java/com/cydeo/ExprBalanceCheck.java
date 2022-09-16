package com.cydeo;

public class ExprBalanceCheck {
    public static void main(String[] args) {
        System.out.println(e);

    }
    public static boolean balanceCheck(String expr){
        //create stack
        MyStack<Character> myStack=new MyStack<>();
        //iterate over expr
        for (int i = 0; i < expr.length(); i++) {
            Character ch=expr.charAt(i);
            //filter non player chars
            if(ch!='('&& ch!='['&& ch!='{' && ch!=')' && ch!=']' && ch!='}')continue;
            //if it as
            if (ch=='('|| ch=='[' ||ch=='{'){
                myStack.push(ch);
                continue;;
            }
            if(myStack.isEmpty()) return false;


        }
        //return if stack is empty

    }

}
