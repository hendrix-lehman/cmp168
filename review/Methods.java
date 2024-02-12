class Methods {

  // inner class
  public class InnerClass {
    int x;

    public InnerClass(int x) {
      this.x = x;
    }

    public int getX() {
      return x;
    }

    public void setX(int x) {
      this.x = x;
    }
  }

  public static void countDown(int start) {
    for (int i = start; i > 0; i--) {
      if (i == start / 2) {
        System.out.println(i + " half way there");
      } else {
        System.out.println(i);
      }
    }
    System.out.println("Blast off!");
  }

  private static int add(String x, int y) {
    // return x + y;
    //
    return Integer.parseInt(x) + y;
  }

  public static int add(int a, int b) {
    a = 1;
    System.out.println("a in add: " + a);
    return a + b;
  }

  public static int add(InnerClass inner, int b) {
    inner.setX(1);
    System.out.println("inner: " + inner.getX());
    return inner.getX() + b;
  }

  public static void main(String[] args) {
    // Methods methods = new Methods(); // create an instance of the class
    Methods.countDown(10);
    Methods.countDown(10);
    Methods.countDown(8);
    int a = 33;
    System.out.println("a in main: " + a);
    int result = Methods.add(a, 7);
    System.out.println("a in main: " + a);
    // int result2 = Methods.add("abc", 7);
    System.out.println(result);

    InnerClass inner = new Methods().new InnerClass(9);
    System.out.println("main: " + inner.getX());
    int result2 = Methods.add(inner, 7);
    System.out.println("main: " + inner.getX());
    System.out.println(result2);
  }
}
