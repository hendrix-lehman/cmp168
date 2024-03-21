class Stuff {

  int id;
  String name;

  public Stuff() {
    this.id = 0;
    this.name = "Jane Doe";
  }

  public Stuff(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public String toString() {
    return "Stuff: " + id + " " + name;
  }

}
