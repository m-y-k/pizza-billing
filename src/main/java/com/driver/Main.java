package com.driver;

public class Main {
  public static void main(String[] args) {

    DeluxePizza dp = new DeluxePizza(false);
    System.out.println(dp.getPrice());
    /* Example 2:
        Base Price Of The Pizza: 400
        Extra Cheese Added: 80
        Extra Toppings Added: 120
        Total Price: 600 */
//    dp.addTakeaway();
    dp.addExtraCheese();
    dp.addExtraToppings();
//    dp.addTakeaway();
    System.out.println(dp.getBill());

    Pizza p = new Pizza(true);
    p.addExtraCheese();
    p.addExtraToppings();
    p.addTakeaway();
    System.out.println(p.getBill());
  }
}