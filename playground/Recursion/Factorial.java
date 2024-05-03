class Factorial {

  // iterative function to find factorial of a number
  public static int factorialIterative(int n) {
    int result = 1;
    for (int i = 1; i <= n; i++) {
      result *= i;
    }
    return result;
  }

  // Recursive function to find factorial of a number
  public static int factorial(int n) {
    if (n == 0 || n == 1) { // base case
      return 1;
    } else {
      // try {
      // System.out.printf("factorial(%d) = %d * factorial(%d - 1)\n", n, n, n);
      // Thread.sleep(2000); // sleep for 1 second
      // } catch (InterruptedException e) {
      // e.printStackTrace();
      // }
      int result = n * factorial(n - 1); // recursive call
      // try {
      // System.out.printf("factorial(%d) = %d\n", n, result);
      // Thread.sleep(1000); // sleep for 1 second
      // } catch (InterruptedException e) {
      // e.printStackTrace();
      // }

      return result;

    }
  }

  public static void main(String[] args) {
    int n = 4;
    System.out.printf("Factorial of %d is %d\n", n, factorial(n));

    System.out.println("\nIterative approach");
    System.out.printf("Factorial of %d is %d\n", n, factorialIterative(n));

  }
}
