package decorator_pattern_exercise;

import java.util.ArrayList;

public class PizzaExtraCheese implements Pizza {

  ArrayList toppings;
  Pizza decoratedPizza;

  public PizzaExtraCheese(Pizza pizza) {
    this.decoratedPizza = pizza;
    toppings = pizza.getToppings();
    toppings.add("extra cheese");

  }

  @Override
  public ArrayList getToppings() {
    return toppings;
  }

  @Override
  public String getName() {
    return decoratedPizza.getName();
  }
}
