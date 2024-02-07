package CalculatorProject;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CalculatorOperations operation = new CalculatorOperations();
        while (true) {
            System.out.println("----------Enter Your Choice----------");
            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("5.Percentage");
            System.out.println("6.Square");
            System.out.println("7.Square root");
            System.out.println("8.Exit");
            System.out.println("-------------------------------------");
            try {
                System.out.print("Enter your choice: ");

                int choice = sc.nextInt();
                if(choice <1 || choice>8) {
                    System.out.println("Invalid choice, Please enter number between 1 to 7");
                    continue;
                }
                if (choice == 8) {
                    System.out.println("Thank you !!");
                    break;
                }
                switch (choice) {
                    case 1 -> System.out.println("Addition is: " + operation.addition());
                    case 2 -> System.out.println("subtraction is: " + operation.subtract());
                    case 3 -> System.out.println("Multiplication is: " + operation.multiply());
                    case 4 -> System.out.println("Division is: " + operation.divide());
                    case 5 -> System.out.println("Percentage is: " + operation.percentage());
                    case 6 -> System.out.println("Square is: " + operation.square());
                    case 7 -> System.out.println("Square-root is: " + operation.squareRoot());
                }
            } catch ( InputMismatchException e) {
                System.out.println("Error: "+e+": Enter number");
                sc.nextLine();
            }
            catch (ArithmeticException | IllegalArgumentException e){
                System.out.println("Error: "+e);
                sc.nextLine();
            }
        }
    }
}