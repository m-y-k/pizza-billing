package com.driver;

public class Pizza {

    private int price;
    private String bill;
    private int cheese;
    private int toppings;
    private int paperBag;

    private boolean isCheeseAdded;

    private boolean isToppingsAdded;

    private boolean isPaperBagAdded;

    public Pizza(Boolean isVeg){

        // your code goes here
        if (isVeg) {
            price = 300;
            toppings = 70;
        }
        else {
            price = 400;
            toppings = 120;
        }

        cheese = 80;

        paperBag = 20;

        bill = "Base Price Of The Pizza: " + price + "\n";

    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if (isCheeseAdded == false) {
            price += cheese;
            isCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if (isToppingsAdded == false) {
            price += toppings;
            isToppingsAdded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if (isPaperBagAdded == false) {
            price += paperBag;
            isPaperBagAdded = true;
        }
    }

    public String getBill(){
        // your code goes here

        /* Base Price Of The Pizza: 300
            Extra Cheese Added: 80
            Extra Toppings Added: 70
            Paperbag Added: 20
            Total Price: 470 */
        // price cheese toppings paperbag

        if (isCheeseAdded) {
            bill += "Extra Cheese Added: " + cheese + "\n";
        }
        if (isToppingsAdded) {
            bill += "Extra Toppings Added: " + toppings + "\n";
        }
        if (isPaperBagAdded) {
            bill += "Paperbag Added: " + paperBag + "\n";
        }

        bill += "Total Price: " + price + "\n";

        return this.bill;
    }
}
