package com.design.pattern.factory;

public class implementFactory {

    public static void main(String[] args) {

        CoffeeFactory factory = new CoffeeFactory();

        CoffeeMaker maker = factory.getCoffee("Americano");
        maker.coffee();

        CoffeeMaker maker1 = factory.getCoffee("Espresso");
        maker1.coffee();
    }
}
