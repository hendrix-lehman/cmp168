class Demo1 {

  public void method1() {
    System.out.println("method1");
    // method1();
    int i = 0;
    while (i < 10) {
      System.out.println("while");
      i++;
    }
  }

  public static void main(String[] args) {
    Demo1 d = new Demo1();
    d.method1();
  }
}
