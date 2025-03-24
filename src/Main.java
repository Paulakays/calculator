//Import necessary klassen
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Create an instance of Calculator and Scanner
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner ( System.in );

        //Instructions for the user
        System.out.println("This is a calculator that can add, subtract, multiply, divide and calculate the percentage of two numbers");

        //User is prompted to enter first number
        System.out.println ( "Enter the first number" );
        double firstNumber = scanner.nextDouble();

        //User is prompted to enter the type of operator they would like to use
        System.out.println("Choose the type of operation: " +
                "addition(+),subtraction (-),division(/),percentage(%),multiplication(*)");
        String operation = scanner.next();

        //User is prompted to enter the second number
        System.out.println ( "Enter the second number" );
        double secondNumber = scanner.nextDouble();

        //Initialisation of the double variable
        double result = 0;

        //Switch case is used to handle different operations
        switch (operation) {
            case "*":
                result = calculator.multiplication(firstNumber,secondNumber);
                break;
                case "/":
                    result = calculator.division(firstNumber,secondNumber);
                    break;
            case "+":
                result = calculator.sum(firstNumber,secondNumber);
                break;

            case "-":
                result = calculator.subtraction(firstNumber,secondNumber);
                break;

            case "%":
                result = calculator.percentage(firstNumber,secondNumber);
                break;
                default:
                    System.out.println("Invalid operation.Please enter +,-,*,/ or % ");

        }

        //The result is printed out
        System.out.println ( "The result is: " +result);

    }
}
