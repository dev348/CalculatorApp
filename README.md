# CalculatorApp Class

The `CalculatorApp` class is the main class that drives the calculator application.

## Functionality

1. It creates an instance of the `Scanner` class to read user input from the console.

2. The program prompts the user to enter the desired operation (`+`, `-`, `*`, `/`).

3. The user is prompted to enter the first number, which is stored in the `num1` variable.

4. Similarly, the user is prompted to enter the second number, which is stored in the `num2` variable.

5. Based on the operation entered by the user, the program creates an instance of the appropriate `Calculator` subclass.

6. The program calls the `performOperation()` method of the selected calculator, passing in `num1` and `num2` as arguments.

7. The `performOperation()` method performs the requested operation and returns the result as a `double`.

8. The resulting value is stored in the `result
