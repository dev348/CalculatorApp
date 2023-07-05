import java.util.Scanner;

// Abstract class representing a calculator
abstract class Calculator {
    abstract double performOperation(double x, double y);
}

// Concrete class implementing the Calculator for addition
class AdditionCalculator extends Calculator {
    @Override
    double performOperation(double x, double y) {
        return x + y;
    }
}

// Concrete class implementing the Calculator for subtraction
class SubtractionCalculator extends Calculator {
    @Override
    double performOperation(double x, double y) {
        return x - y;
    }
}

// Concrete class implementing the Calculator for multiplication
class MultiplicationCalculator extends Calculator {
    @Override
    double performOperation(double x, double y) {
        return x * y;
    }
}

// Concrete class implementing the Calculator for division
class DivisionCalculator extends Calculator {
    @Override
    double performOperation(double x, double y) {
        if (y != 0) {
            return x / y;
        } else {
            throw new ArithmeticException("Cannot divide by zero!");
        }
    }
}

// Main class to test the calculator
public class CalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the operation from the user
        System.out.print("Enter the operation (+, -, *, /): ");
        String operation = scanner.nextLine();

        // Get the operands from the user
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Create an instance of the appropriate Calculator based on the operation
        Calculator calculator;
        switch (operation) {
            case "+":
                calculator = new AdditionCalculator();
                break;
            case "-":
                calculator = new SubtractionCalculator();
                break;
            case "*":
                calculator = new MultiplicationCalculator();
                break;
            case "/":
                calculator = new DivisionCalculator();
                break;
            default:
                System.out.println("Invalid operation.");
                return;
        }

        // Perform the calculation using the selected calculator
        double result = calculator.performOperation(num1, num2);
        System.out.println("Result: " + result);
    }
}
