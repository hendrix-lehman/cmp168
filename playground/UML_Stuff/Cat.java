class Cat {

  // - numWhiskers : int
  private int numWhiskers;

  // - whiskerLength : double
  private double whiskerLength;

  // - age : int
  private int age;

  // - isVaccinated : boolean
  private boolean isVaccinated;

  private String name;

  // + Cat()
  public Cat() {
    numWhiskers = 0;
    whiskerLength = 0.0;
    age = 0;
    isVaccinated = false;
    name = "Unknown";
  }

  // + Cat(int, double, int, boolean, String)
  public Cat(int numWhiskers, double whiskerLength, int age, boolean isVaccinated, String name) {
    this.numWhiskers = numWhiskers;
    this.whiskerLength = whiskerLength;
    this.age = age;
    this.isVaccinated = isVaccinated;
    this.name = name;
  }

  // + getNumWhiskers() : int
  public int getNumWhiskers() {
    return numWhiskers;
  }

  // + getWhiskerLength() : double
  public double getWhiskerLength() {
    return whiskerLength;
  }

  // + getAge() : int
  public int getAge() {
    return age;
  }

  // + getIsVaccinated() : boolean
  public boolean getIsVaccinated() {
    return isVaccinated;
  }

  // + getName() : String
  public String getName() {
    return name;
  }

  // + setNumWhiskers(int) : void
  public void setNumWhiskers(int numWhiskers) {
    this.numWhiskers = numWhiskers;
  }

  // + setWhiskerLength(double) : void
  public void setWhiskerLength(double whiskerLength) {
    this.whiskerLength = whiskerLength;
  }

  // + setAge(int) : void
  public void setAge(int age) {
    this.age = age;
  }

  // + setIsVaccinated(boolean) : void
  public void setIsVaccinated(boolean isVaccinated) {
    this.isVaccinated = isVaccinated;
  }

  // + setName(String) : void
  public void setName(String name) {
    this.name = name;
  }

  // + toString() : String
  public String toString() {
    return String.format("Name: %s, Age: %d, Whiskers: %d, Whisker Length: %.2f, Vaccinated: %b",
        name, age, numWhiskers, whiskerLength, isVaccinated);
  }

  // + equals(Object) : boolean
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (obj == this) {
      return true;
    }
    if (obj instanceof Cat) {
      Cat objOther = (Cat) obj;
      return this.age == objOther.age && this.name.equals(objOther.name);
    }
    return false;
  }

}
