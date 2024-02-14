class Person {
  // scope of the class - is anything within the class declaration {}

  // ATTRIBUTES
  // allows you to hide information
  private String name;;
  private boolean hasShoes = false;

  // CONSTRUCTORS
  // creating an instance via a constructor
  // this is the default constructor
  public Person() {
    // scope of the constructor - is anything within the constructor declaration {}
    this.name = "UNKNOWN"; // default name
  }

  // this is an overloaded constructor
  public Person(String name) {
    this.name = name;
  }

  // another overloaded constructor
  public Person(String name, boolean hasShoes) {
    this.name = name;
    this.hasShoes = hasShoes;
  }

  // GETTERS AND SETTERS
  // getter method (accessor)
  public String getName() {
    return name;
  }

  public boolean hasShoes() {
    return hasShoes;
  }

  // setter method (mutator)
  public void setName(String name) {
    this.name = name;
  }

  public void setShoes(boolean hasShoes) {
    this.hasShoes = hasShoes;
  }

  // METHODS
  // that describe the behavior of the object
  public void walk() {
    if (this.hasShoes) {
      System.out.println(name + " is walking");
    } else {
      System.out.println(name + " is barefoot");
    }
  }
}
