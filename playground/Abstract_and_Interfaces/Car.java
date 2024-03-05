abstract class Car {

  // this method IS NOT abstract
  // it is implemented here but can be overridden by a child class
  public void start() {
    System.out.println("Car starting");
  }

  // this method IS abstract
  // it is not implemented here and MUST be overridden by a child class
  public abstract void stop();

  @Override
  public boolean equals(Object obj) {
    System.out.println("Car equals");
    if (obj instanceof Car) {
      return true;
    }
    return false;
  }
}
