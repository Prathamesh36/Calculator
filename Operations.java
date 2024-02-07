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
    abstract double cube();
    abstract double modulus();

}

class CalculatorOperations extends Operations{

    @Override
    double addition() {
        Scanner sc = new Scanner(System.in);
        double sum=0;
        double num=1;
        System.out.println("Enter multiple numbers separated by space : ");
        System.out.println("(Enter 0 at end to get total addition)");
        while (num!=0){
            num=sc.nextDouble();
            sum+=num;
        }
        return sum;
    }

    @Override
    double subtract(){
        Scanner sc = new Scanner(System.in);
        double sub=0;
        double num=1;
        System.out.println("Enter multiple numbers separated by space : ");
        System.out.println("(Enter 0 at end to get total addition)");
        int flag=0;
        while (num!=0){
            num=sc.nextDouble();
            if(flag==0) {
                flag++;
                sub=num;
            }
            else {
                sub -= num;
            }
        }
        return sub;
    }

    @Override
    double multiply() {
        Scanner sc = new Scanner(System.in);
        double mul=1;
        double num=0;
        System.out.println("Enter multiple numbers separated by space: ");
        System.out.println("(Enter 1 at end to get total multiplication)");
        while (num!=1){
            num=sc.nextDouble();
            mul*=num;
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

    @Override
    double cube() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        double num1 = sc.nextDouble();
        return num1*num1*num1;
    }

    @Override
    double modulus() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter number 2: ");
        double num2 = sc.nextDouble();
        return num1%num2;
    }
}
