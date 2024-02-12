import java.util.Random;

class Variables {
  public static void main(String[] args) {
    
    // 00000000 00000000 00000000 00000000  = 0
    // 00000000 00000000 00000000 00000000  = null
    // 00000000 00000000 00000000 00000000  = boolean false
    // 00000000 00000000 00000000 00000000  = char \u0000
    // 00000000 00000000 00000000 00000000  = NaN <== JavaScript

    int variableName;
    int VARIABLE_NAME;
    int VariableName;
    int VAriableName;


    variableName = 10;

    // "int" is a data type for integers
    // "favoriteNumber" is the name of the variable
    // "17" is the value that is assigned to the variable
    int favoriteNumber = 17;
    // "int" is a data type for integers
    // "anotherNumber" is the name of the variable
    // there is no value assigned to the variable
    // there it is initialized with the default value of 0
    int anotherNumber;

    boolean isSunny = false;

    double pi = 3.14159265359;

    favoriteNumber = 42;

    boolean isJavaFun = true;

    char myGrade = 'A';

    String myName = "John";

    System.out.println(myName.charAt(0));
    System.out.println(myName.charAt(1));

    System.out.println("Hello World!");


    int i = 2147483647;
    System.out.println(i);
    i++;
    System.out.println(i);

    short s = 32767;
    s = (short)(s + 1);
    System.out.println(s);

    System.out.println(65);
    System.out.println((char)170);

    System.out.println(Math.pow(2, 3));

    Random rand = new Random();
    System.out.println(rand.nextInt(100));
  }
}
