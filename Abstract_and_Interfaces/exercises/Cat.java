class Cat {
  private int numWhiskers;
  private double whiskerLength;
  private int age;
  private boolean isVaccinated;
  private String name;

  public Cat() {
    numWhiskers = 0;
    whiskerLength = 0.0;
    age = 0;
    isVaccinated = false;
    name = "unknown";
  }

  public int getNumWhiskers() {
    return numWhiskers;
  }

  public double getWhiskerLength() {
    return whiskerLength;
  }

  public int getAge() {
    return age;
  }

  public boolean getIsVaccinated() {
    return isVaccinated;
  }

  public String getName() {
    return name;
  }

  public void setNumWhiskers(int whiskers) {
    numWhiskers = whiskers;
  }

  public void setWhiskerLength(double length) {
    whiskerLength = length;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setIsVaccinated(boolean isVaccinated) {
    this.isVaccinated = isVaccinated;
  }

  public void setName(String name) {
    this.name = name;
  }
}
