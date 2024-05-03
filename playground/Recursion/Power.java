class Power {
  // iterative function to calculate exponent
  public static int powerIterative(int base, int exp) {
    int result = 1;
    for (int i = 0; i < exp; i++) {
      result *= base;
    }
    return result;
  }

  // recursive function to calculate exponent
  public static int power(int base, int exp) {
    if (exp == 0) {
      return 1;
    } else {
      return base * power(base, exp - 1);
    }
  }

  public static void main(String[] args) {

    int base = 3;
    int exp = 4;

    System.out.println(base + " raised to the power of " + exp + " is " + power(base, exp));

    System.out.println(base + " raised to the power of " + exp + " is " + powerIterative(base, exp));

  }
}
