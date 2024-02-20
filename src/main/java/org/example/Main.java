package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static double powerFn(double powerBase, double powerExponent) {
        return Math.pow(powerBase, powerExponent);
    }

    public static double logFn(double naturalLogNumber) {
        return Math.log(naturalLogNumber);
    }

    public static int factorialFn(int factorialNumber) {
        int factorialResult = 1;
        for(int i = 1; i <= factorialNumber; i++) {
            factorialResult *= i;
        }
        return factorialResult;
    }

    public static double sqrtFn(double squareRootNumber) {
        return Math.sqrt(squareRootNumber);
    }

    public static void calculator()
    {
        int choice;
        Scanner scan = new Scanner(System.in);
        do
        {
            System.out.print("\n::: Calculator :::\n");
            System.out.print("1. Square Root\n");
            System.out.print("2. Factorial\n");
            System.out.print("3. Natural Logarithm\n");
            System.out.print("4. Power Function\n");
            System.out.print("5. Exit\n\n");
            System.out.print("Enter Your Choice : ");
            choice = scan.nextInt();
            switch(choice)
            {
                case 1 : System.out.print("Enter a number : ");
                    double squareRootNumber = scan.nextDouble();
                    double squareRootResult = sqrtFn(squareRootNumber);
                    System.out.print("Result = " + squareRootResult);
                    break;
                case 2 : System.out.print("Enter a number : ");
                    int factorialNumber = scan.nextInt();
                    int factorialResult = factorialFn(factorialNumber);
                    System.out.print("Result = " + factorialResult);
                    break;

                case 3 : System.out.print("Enter a number : ");
                    double logNumber = scan.nextDouble();
                    double logResult = logFn(logNumber);
                    System.out.print("Result = " + logResult);
                    break;

                case 4 : System.out.print("Enter 2 numbers : ");
                    double baseNumber = scan.nextDouble();
                    double exponentNumber = scan.nextDouble();
                    double powerResult = powerFn(baseNumber, exponentNumber);
                    System.out.print("Result = " + powerResult);
                    break;

                case 5 : System.exit(0);
                    break;

                default : System.out.print("Wrong Choice!!!");
                    break;
            }
            System.out.print("\n---------------------------------------\n");
        }while(choice != 5);
        scan.close();
    }

    public static void main(String[] args) {
        calculator();
    }
}