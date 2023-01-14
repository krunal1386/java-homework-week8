package calculate;

import java.util.Scanner;

public class Calculator {
    //declare instance method
    public void addition(int a, int b){
        int ans = a+b;
        System.out.println("Addition =" + ans);
    }
    //declare instance method
    public void subtraction(int a, int b){
        int ans = a-b;
        System.out.println("subtraction =" + ans);
    }
    //declare instance method
    public void multiplication(int a, int b){
        int ans = a*b;
        System.out.println("multiplication =" + ans);
    }
    //declare instance method
    public void division(int a, int b){
        int ans = a/b;
        System.out.println("division =" + ans);
    }

    void calculateResult(int a, int b, char c){
        Calculator obj = new Calculator(); //create object
        if (c=='+'){
        }else if (c=='-'){
            subtraction(a, b);
        }else if (c =='*'){
            multiplication(a, b);
        }else{
            division(a,b);
        }
    }


}



