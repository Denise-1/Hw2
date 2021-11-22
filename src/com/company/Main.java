// Denise Chen
// IS 147-04
// d189@umbc.edu
// 10/28/2021
// make a simple calculator with a loop

package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to calculate: ");
        int firstNumber = input.nextInt();

        System.out.println("Enter another number to calculate: ");
        int secondNumber = input.nextInt();

        boolean operation = false;

        int operationInput = 0;
        while (!operation) {           // loops the operationInput until user enters 0
            System.out.println("Choose your operation 1[add], 2[subtract], 3[multiply], 4[divide]" +
                    " or 0[quit]: ");
            operationInput = input.nextInt();

            if (operationInput == 1) {
                System.out.println("The sum is: " + (firstNumber + secondNumber));
            } else if (operationInput == 2){
                System.out.println("The difference is: " + (firstNumber - secondNumber));
            } else if (operationInput == 3){
                System.out.println("The product is: " + (firstNumber * secondNumber));
            } else if (operationInput == 4){
                System.out.println("The quotient is: " + (firstNumber / secondNumber));
            } else if (operationInput == 0){
                break;
            } else {
                System.out.println("This is not a valid operation");
            }
        } // while loop end
        System.out.println("This is the end of the calculations");      // operationInput == 0 breaks out of while loop and prints this
    } // public static void end
} // public class Main end