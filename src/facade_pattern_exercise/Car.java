package facade_pattern_exercise;

public class Car {


  public static void main(String[] args) {
    CarFacade facade = new CarFacade();
    facade.drive();
  }
}
