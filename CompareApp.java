/*
 * @author Tadisa Jakarasi
 * @date 25/06/2024
 * Week 4- Lab Task
 */


import java.util.Scanner;

public class CompareApp {
    public static void main(String[] args) {
        // Declaring the variables
        int num1, num2; // whole numbers only
        Scanner keyboard = new Scanner(System.in); // creating the scanner object
        System.out.println("Enter first number: ");
        num1 = keyboard.nextInt(); //input method for number 1 called
        System.out.println("Enter second number: ");
        num2 = keyboard.nextInt();
        if (num1 == num2) // If statement true condition
        {
            System.out.println("Numbers ARE equal");
        }
        else if (num1>=num2) // else statement false condition
        {
            System.out.println("FIRST number BIGGER");
            System.out.println("Numbers ARE NOT equal");
        }
        else
        {
            System.out.println("SECOND number BIGGER");
            System.out.println("Numbers ARE NOT equal");
        }
        System.out.println("END OF PROGRAM");

    }
}
