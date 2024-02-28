class Toyota extends Car {
  @Override
  public void stop() {
    System.out.println("Toyota stopping");
  }

  public void brake() {
    System.out.println("Toyota braking");
  }

  @Override
  public boolean equals(Object obj) {
    System.out.println("Toyota equals");
    if (obj instanceof Toyota) {
      return true;
    }
    return false;
  }
}
