class Dog {

  private static int currentDogID = 0;

  private int dogID;

  public Dog() {
    dogID = ++currentDogID;
  }

  public int getDogID() {
    return dogID;
  }
}
