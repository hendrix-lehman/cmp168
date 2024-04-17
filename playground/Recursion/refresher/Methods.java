class Methods {

  // this method has a primitive data type as input parameter
  public void method1(int a) {
    System.out.println("Method 1");
    // this variable b is local to method1
    // hence it is NOT accessible in main method
    // input parameter a is also local to method1
    // hence it is NOT accessible in main method
    int b = -2;
    a = -1;
  }

  // this method has a reference data type as input parameter
  public void method2(SampleClass obj) {
    System.out.println("Method 2");
    // this variable obj is local to method2
    // hence it is NOT accessible in main method
    // input parameter obj is also local to method2
    // hence it is NOT accessible in main method
    obj.setId(-1);
    obj.setName("NAME CHANGED");
  }

  // this method has a reference data type as input parameter
  // the input parameter is a String is immutable
  public void method3(String str) {
    System.out.println("Method 3");
    // this variable str is local to method3
    // hence it is NOT accessible in main method
    // input parameter str is also local to method3
    // hence it is NOT accessible in main method
    str = "STRING CHANGED";
  }

  public int method4(int a, int b) {
    method1(a);
    method2(new SampleClass(0, "New"));
    return a + b;
  }

  public SampleClass method5(int id, String name) {
    SampleClass localVariableForThisReference = new SampleClass(0, "Local");
    return localVariableForThisReference;
  }

  public static void main(String[] args) {
    Methods obj = new Methods();
    int x = 8;
    obj.method1(x);
    System.out.println(x);

    SampleClass obj2 = new SampleClass(1, "Main");
    obj.method2(obj2);
    System.out.println(obj2.getId());
    System.out.println(obj2.getName());

    String str = "Main";
    obj.method3(str);
    System.out.println(str);

    String a = "abc";
    a = "new value";

    int result = obj.method4(1, 2);
    System.out.println(result);

    SampleClass sc = obj.method5(1, "Sample");
    System.out.println(sc.getId() + " " + sc.getName());
  }
}
