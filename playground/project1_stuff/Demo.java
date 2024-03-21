class Demo {

  public static void main(String[] args) {

    // create stuffs id 1, 2, 3
    Stuff[] stuffs1 = new Stuff[] { new Stuff(1, "name1"), new Stuff(2, "name2"), new Stuff(3, "name3") };
    Widget widget = new Widget(stuffs1);

    // create stuffs id 0, 2, 3
    Stuff[] stuffs2 = new Stuff[] { new Stuff(0, "name1"), new Stuff(2, "name2"), new Stuff(3, "name3") };
    Widget widget2 = new Widget(stuffs2);
    CompareToWidget compareToWidget = new CompareToWidget(widget2);
    int result = compareToWidget.compareTo(widget);
    System.out.printf("CompareToWidget.compareTo(widget) = %d%n", result);

  }
}
