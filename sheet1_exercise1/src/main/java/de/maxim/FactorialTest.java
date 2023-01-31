package de.maxim;

import java.util.Scanner;


public class FactorialTest {

    public static void main(String[] args) {

        Scanner eingabe = new Scanner(System.in);
        int n = 1;
        while(true) {
            for(int i = n; i > 0; i--){
                // Wiedergabe aller Zahlen von n bis 1
                System.out.println(i + "! = " + Factorial.getFactorial(i));
            }
            System.out.print("Please enter a non-negative number: ");
            n = eingabe.nextInt();
            if(n < 0)
                break;
        }
        eingabe.close();
    }
}
