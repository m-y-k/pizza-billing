package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int cheese;
    private int toppings;
    private int paperBag;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if (isVeg) {
            price = 300;
        }
        else {
            price = 400;
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        cheese = 80;
    }

    public void addExtraToppings(){
        // your code goes here
        if (isVeg) {
            toppings = 70;
        }else {
            toppings = 120;
        }
    }

    public void addTakeaway(){
        // your code goes here
        paperBag = 20;
    }

    public String getBill(){
        // your code goes here

        /* Base Price Of The Pizza: 300
            Extra Cheese Added: 80
            Extra Toppings Added: 70
            Paperbag Added: 20
            Total Price: 470 */
        // price cheese toppings paperbag

        bill = "Base Price Of The Pizza: " + price + "\n";
        if (cheese != 0) {
            bill += "Extra Cheese Added: " + cheese + "\n";
        }
        if (toppings != 0) {
            bill += "Extra Toppings Added: " + toppings + "\n";
        }
        if (paperBag != 0) {
            bill += "Paperbag Added: " + paperBag + "\n";
        }
        int amount = price + cheese + toppings + paperBag;
        bill += "Total Price: " + amount + "\n";
        return this.bill;
    }
}
