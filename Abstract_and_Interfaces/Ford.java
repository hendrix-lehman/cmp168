class Ford extends Car {
  @Override
  public void start() {
    System.out.println("Ford starting");
  }

  @Override
  public void stop() {
    System.out.println("Ford stopping");
  }

  public void speedBoost() {
    System.out.println("Ford boosting speed");
  }

  @Override
  public boolean equals(Object obj) {
    System.out.println("Ford equals");
    if (obj instanceof Ford) {
      return true;
    }
    return false;
  }
}
