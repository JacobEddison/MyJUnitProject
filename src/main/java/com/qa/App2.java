package com.qa;

public class App2 {
    public static void main(String[] args){

    }
    public int calculator(int num1, int num2, String operator){
        if (operator.equals("*")){
            return num1*num2;
        }
        else if (operator.equals("/")){
            if (num1==0 || num2==0){
                return 0;
            }
            return num1/num2;
        }
        else if (operator.equals("+")){
            return num1+num2;
        }
        else if (operator.equals("-")){
            return num1-num2;
        }
        else {
            return 0;
        }
    }
}
