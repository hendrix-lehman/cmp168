class GetSum {

  // iterative function that sums two values
  public static int getSumIterative(int a, int b) {
    while (a != 0) {
      b++;
      a--;
    }
    return b;
  }

  // recursive function that sums two values
  public static int getSum(int a, int b) {
    // base case
    if (a == 0) {
      return b;
    }
    // recursive case
    try {
      System.out.printf("(a) = %d (b) = %d\na - 1 = %d, b + 1 = %d\n", a, b, a - 1, b + 1);
      Thread.sleep(2000);
    } catch (Exception e) {
    }
    return getSum(a - 1, b + 1);
  }

  public static void main(String[] args) {
    int a = 3;
    int b = 2;
    int sum = getSum(a, b);

    System.out.println("The sum of " + a + " and " + b + " is " + sum);

    int sumIterative = getSumIterative(a, b);
    System.out.println("The sum of " + a + " and " + b + " is " + sumIterative);

  }
}
