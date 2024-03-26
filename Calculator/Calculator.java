package Calculator;

import java.util.Scanner;

/**
 * Calculator
 */
public class Calculator {

    static int addition(int x, int y) {
        return x + y;
    }
    static int substraction(int x,int y){
        return x - y;
    }
    static int multiplication(int x,int y){
        return x * y;
    }
    static int division(int x,int y){
        return x / y;
    }
    static int reminder(int x,int y){
        return x % y;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number :");
        int x = sc.nextInt();
        System.out.println("Enter the second number :");
        int y = sc.nextInt();
        System.out.println("Enter a option 1.addition 2.substraction 3.multiplication 4.division 5.reminder");
        int num = sc.nextInt();


        if(num == 1){
            System.out.println("Addition is :" +addition(x, y));
        }
        else if(num == 2){
            System.out.println("Substraction is :"+substraction(x, y));
        }
        else if(num == 3){
            System.out.println("Multiplication is :"+multiplication(x, y));
        }
        else if(num == 4){
            System.out.println("Division is :"+division(x, y));
        }
        else if(num == 5){
            System.out.println("Reminder is :"+reminder(x,y));
        }
        else{
            System.out.println("Invalid Input");
        }
        sc.close();
    }
}