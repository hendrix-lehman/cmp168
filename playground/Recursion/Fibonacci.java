class Fibonacci {

  // iterative method to find n-th Fibonacci number
  public static int fibonacciIterative(int n) {
    if (n <= 1) {
      return n;
    }
    int fib = 1;
    int prevFib = 1;

    for (int i = 2; i < n; i++) {
      int temp = fib;
      fib += prevFib;
      prevFib = temp;
    }
    return fib;
  }

  // recursive method to find n-th Fibonacci number
  public static int fibonacci(int n) {
    if (n <= 1) {
      return n;
    }
    return fibonacci(n - 1) + fibonacci(n - 2);
  }

  public static void main(String[] args) {

    int n = 10;
    System.out.println("Fibonacci series till " + n + " terms: ");
    for (int i = 0; i < n; i++) {
      System.out.print(fibonacci(i) + " ");
    }
    System.out.println();

    System.out.println("Fibonacci series till " + n + " terms: ");
    for (int i = 0; i < n; i++) {
      System.out.print(fibonacciIterative(i) + " ");
    }
    System.out.println();

  }
}
