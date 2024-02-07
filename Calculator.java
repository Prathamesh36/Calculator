package CalculatorProject;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CalculatorOperations operation = new CalculatorOperations();
        System.out.println("-----------------CALCULATOR----------------");
        while (true) {
            System.out.println("-------------Enter Your Choice-------------");
            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("5.Percentage");
            System.out.println("6.Square");
            System.out.println("7.Square root");
            System.out.println("8.Cube");
            System.out.println("9.Modulus");
            System.out.println("0.Exit");
            System.out.println("-------------------------------------------");
            try {
                System.out.print("Enter your choice: ");
                int choice = sc.nextInt();

                if (choice == 0) {
                    System.out.println("Thank you !!");
                    break;
                }
                switch (choice) {
                    case 1 -> System.out.printf("Addition is: %.2f\n" , operation.addition());
                    case 2 -> System.out.printf("Subtraction is: %.2f\n" , operation.subtract());
                    case 3 -> System.out.printf("Multiplication is: %.2f\n" , operation.multiply());
                    case 4 -> System.out.printf("Division is: %.2f\n" , operation.divide());
                    case 5 -> System.out.printf("Percentage is: %.2f\n" , operation.percentage());
                    case 6 -> System.out.printf("Square is: %.2f\n" , operation.square());
                    case 7 -> System.out.printf("Square-root is: %.2f\n" , operation.squareRoot());
                    case 8 -> System.out.printf("Cube is: %.2f\n" , operation.cube());
                    case 9 -> System.out.printf("Modulus is: %.2f\n" , operation.modulus());
                    default -> System.out.println("Invalid choice, Please enter number between 1 to 9");
                }
            } catch ( InputMismatchException e) {
                System.out.println("Error: "+e+": Please Enter number");
                sc.nextLine();
            }
            catch (ArithmeticException | IllegalArgumentException e){
                System.out.println("Error: "+e);
                sc.nextLine();
            }
        }
    }
}