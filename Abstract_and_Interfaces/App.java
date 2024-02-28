class App {

  public static void main(String[] args) {
    Car car = new Toyota();
    Car car2 = new Ford();

    car.start();
    car.stop();

    car2.start();
    car2.stop();

    if (car instanceof Toyota) {
      System.out.println("car is a Toyota");
      Toyota toyota = (Toyota) car;
      toyota.brake();
    }

    if (car2 instanceof Toyota) {
      // this will not execute because car2 is a Ford
      System.out.println("car2 is a Toyota");
    } else if (car2 instanceof Ford) {
      // this will execute because car2 is a Ford
      System.out.println("car2 is a Ford");
      Ford ford = (Ford) car2;
      ford.speedBoost();
    }

    boolean isSameType = car.getClass().equals(car2.getClass());
    System.out.printf("car class is %s and car2 class is %s\n", car.getClass(), car2.getClass());
    System.out.println("car and car2 are the same type: " + isSameType);

    boolean isSame = car.equals(car2);
    System.out.println("car and car2 are the same: " + isSame);
  }

}
