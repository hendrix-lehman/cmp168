class App {

  public static void main(String[] args) {

    Person person = new Person("John");
    System.out.println("This person's name is " + person.getName());
    person.walk();

    person.setName("Jane");
    System.out.println("This person's name is " + person.getName());
    person.setShoes(true);
    person.walk();

    Person person2 = new Person();
    System.out.println("This person's name is " + person2.getName());
    person2.walk();

    Person person3 = new Person("Bob", true);
    System.out.println("This person's name is " + person3.getName());

  }

}
