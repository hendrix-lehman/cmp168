class DecisionBranches {
    public static void main(String[] args) {

      // if statement
      int x = 1;
      int y = 1;
      boolean b = true;

      if (b) {
        System.out.println("IF");
      } else if (x == y) {
        System.out.println("ELSE-IF");
      } else {
        System.out.println("ELSE");

      }

      String hello1 = "hello";
      String hello2 = "Hello";
      // if (hello1 == hello2) { // DO NOT USE == TO COMPARE STRINGS
      if (hello1.equalsIgnoreCase(hello2)) {
        System.out.println("hello1 == hello2");
      } else {
        System.out.println("hello1 != hello2");
      }

      // switch statement
      int day = 4;
      switch (day) {
        case 1:
          System.out.println("Monday");
          break;
        case 2:
          System.out.println("Tuesday");
          break;
        case 3:
          System.out.println("Wednesday");
          break;
        case 4:
          System.out.println("Thursday");
          break;
        case 5:
          System.out.println("Friday");
          break;
        case 6:
          System.out.println("Saturday");
          break;
        case 7:
          System.out.println("Sunday");
          break;
        default:
          System.out.println("Invalid day");
      }

      System.out.println("done!");

  }
}
