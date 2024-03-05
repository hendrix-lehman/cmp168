class App {

  static class AnotherApp {
    public void anotherMethod() {
      System.out.println("Another method");
    }
  }

  public static void makingACall(MobilePhone mobilePhone) {
    // look at their contact list

    mobilePhone.call();
  }

  public static void main(String[] args) {
    Apple apple = new Apple();
    Google google = new Google();

    makingACall(apple);
    makingACall(google);

    App.AnotherApp anotherApp = new App.AnotherApp();
    anotherApp.anotherMethod();

  }
}
