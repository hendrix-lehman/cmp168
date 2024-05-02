class CountDown {
  // iterative method to count down from n to 0
  public void countDownIterative(int n) {
    for (int i = n; i >= 0; i--) {
      System.out.println(i);
    }
    System.out.println("Done!");
  }

  // recursive method to count down from n to 0
  public void countDown(int n) {
    if (n == 0) {
      System.out.println("Hooray!");
      return;
    }
    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    countDown(n - 1);
    System.out.println(n);
  }

  public static void main(String[] args) {

    CountDown cd = new CountDown();
    // System.out.println("Iterative countdown:");
    // cd.countDownIterative(5);

    System.out.println("\nRecursive countdown:");
    cd.countDown(3);

  }
}
