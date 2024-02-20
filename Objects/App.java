class App {

  public static void main(String[] args) {

    // the way we create an instance of a class
    // is by using the *new* keyword and calling its constructor
    Person person = new Person("John");
    System.out.println(person);

    // System.out.println("This person's name is " + person.getName());
    // person.walk();
    //
    // person.setName("Jane");
    // System.out.println("This person's name is " + person.getName());
    // person.setShoes(true);
    // person.walk();
    //
    // Person person2 = new Person();
    // System.out.println("This person's name is " + person2.getName());
    // person2.walk();
    //
    // Person person3 = new Person("Bobby", true);
    // System.out.println("This person's name is " + person3.getName());
    //
    // // accessing a constant
    // System.out.println("The maximum age is " + person3.MAX_AGE);
    //
    // // accessing a constant Math.PI
    // System.out.println("The value of PI is " + Math.PI);
    //
    // // Object is the root of the class hierarchy
    // // Every class has Object as a superclass
    // Object obj = new Object();
    // // I can call the toString method on any object
    // System.out.println(obj.toString());
    // System.out.println("is obj equal to person? " + obj.equals(person));
    //
    // // I can call the toString method on any object
    // System.out.println(person.toString());
    // System.out.println(person2.toString());
    // System.out.println(person3.toString());
    // person.setName(person2.getName());
    // System.out.println("is person equal to person2? " + person.equals(person2));

  }

}
