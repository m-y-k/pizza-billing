package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        // type veg or non-veg
        super(isVeg);

        // your code goes here

//        // add cheese
        addExtraCheese();
//
//        // add toppings
        addExtraToppings();

    }
}
