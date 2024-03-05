import java.util.Scanner;

class InputOutput {
    public static void main(String[] args) {

      System.out.println("What's your favorite color?");
      Scanner scanner = new Scanner(System.in);
      String color = scanner.nextLine();
      System.out.println("Your favorite color is " + color);
      System.out.printf("Your favorite color is %s\n", color);
      System.out.printf("The hexadecimal value of %d is hex: %h\n", 11, 11);

    }
}
