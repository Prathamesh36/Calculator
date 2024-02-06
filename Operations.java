package CalculatorProject;

import java.util.Scanner;

abstract class Operations{
    abstract double addition();
    abstract double subtract();
    abstract double multiply();
    abstract double divide();
    abstract double percentage();
    abstract double square();
    abstract double squareRoot();
}

class CalculatorOperations extends Operations{

    @Override
    double addition() {
        Scanner sc = new Scanner(System.in);
        double sum=0;
        double i=1;
        System.out.println("Enter multiple numbers (Enter 0 to get total addition): ");
        while (i!=0){
            i=sc.nextDouble();
            sum+=i;
        }
        return sum;
    }

    @Override
    double subtract(){
        Scanner sc = new Scanner(System.in);
        double sub=0;
        double i=1;
        System.out.println("Enter multiple numbers (Enter 0 to get total subtraction): ");
        int fn=0;
        while (i!=0){
            i=sc.nextDouble();
            if(fn==0) {
                fn++;
                sub=i;
            }
            else {
                sub -= i;
            }
        }
        return sub;
    }

    @Override
    double multiply() {
        Scanner sc = new Scanner(System.in);
        double mul=1;
        double i=0;
        System.out.println("Enter multiple numbers (Enter 1 to get total multiplication): ");
        while (i!=1){
            i=sc.nextDouble();
            mul*=i;
        }
        return mul;
    }

    @Override
    double divide() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numerator: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter denominator: ");
        double num2 = sc.nextDouble();
        if(num2 != 0) return num1/num2;
        else throw new ArithmeticException("Number cannot divided by zero");
    }

    @Override
    double percentage() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter number 2: ");
        double num2 = sc.nextDouble();
        return (num1*num2)/100;
    }

    @Override
    double square() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        double num1 = sc.nextDouble();
        return num1*num1;
    }

    @Override
    double squareRoot() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        double num1 = sc.nextDouble();
        if (num1>=0) return Math.sqrt(num1);
        else throw new IllegalArgumentException("Invalid input for square root, enter positive number");
    }
}
