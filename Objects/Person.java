class Person {
  // scope of the class - is anything within the class declaration {}

  // ATTRIBUTES
  // allows you to hide information
  private String name;
  private boolean hasShoes = false;
  public final int MAX_AGE = 100;

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

  // methods and constructors are NOT the same thing
  // constructors are used to create an instance of a class
  // methods are used to describe the behavior of the object
  // 1. constructors have the same name as the class
  // 2. constructors do not have a return type

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
      System.out.println(name + " is walking with shoes on");
    } else {
      System.out.println(name + " is walking barefoot");
    }
  }

  // OVERRIDING METHODS
  // toString is a method that is inherited from the Object class
  // we can override it to provide a more meaningful representation of the object
  @Override
  public String toString() {
    return getClass().getName() + ": " + name;
  }

  // equals is a method that is inherited from the Object class
  // we can override it to provide a more meaningful comparison of the object
  @Override
  public boolean equals(Object abc) {
    if (abc == null)
      return false;
    if (abc instanceof Person) {
      Person p = (Person) abc;
      return this.name.equals(p.name);
    }
    return false;
  }
}
