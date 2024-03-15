import java.util.InputMismatchException;
import java.util.Scanner;

class App {

  // defensive programming
  // design by contract

  public static void doCalculation(int number) /* throws MyCustomException */ {
    int result = 100 / number;
    System.out.println("The result is: " + result);

    try {

      System.out.println("this is a try block");
    } finally {
      System.out.println("this is a finally block");
    }

    // try {
    // int result = 100 / number;
    // System.out.println("The result is: " + result);
    // } catch (Exception e) {
    // throw new MyCustomException("This is a custom exception message. Exception: "
    // + e.getMessage());
    // }
  }

  // The syntax for a try-catch block is as follows:
  // try {
  // one or multiple expressions that may throw an exception
  // } zero or multiple catch blocks
  // catch (ExceptionType identifier) {
  // one or multiple expressions that handle the exception
  // }
  // optionally, a finally block
  // finally {
  // one or multiple expressions that are always executed
  // }

  public static void main(String[] args) {

    Scanner scanner = null;
    int number = 0;
    boolean retry = true;

    while (retry) {

      try {
        scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        number = scanner.nextInt();

        if (number <= 0) {
          System.out.println("The number: " + number + " is not valid. Numbers must be greater than zero");
        } else {
          doCalculation(number);
          doCalculation(number + 1);

          retry = false;
          System.out.println("The code executed successfully");
        }

      } catch (ArithmeticException e) {
        System.out.printf("Please try again. The number: %d is not valid. Numbers must be greater than zero", number);
        // } catch (Exception e) {
        // System.out.println("An error occurred");
      } catch (InputMismatchException e) {
        System.out.println("*** Please enter a valid number");
        // } catch (MyCustomException e) {
        // System.out.println(e.getMessage());
      } finally {
        // finally blocks are perfect for closing resources
      }
    }
    if (scanner != null) {
      scanner.close();
    }

  }
}
