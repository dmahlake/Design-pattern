package com.design.pattern.factory;

public class Espresso extends CoffeeType implements CoffeeMaker{

    CoffeeType coffeeType = new CoffeeType();

    @Override
    public void coffee() {
        System.out.println("Espresso with : ");
        System.out.println(coffeeType.getWholeCoffeeBean() + "\n" + coffeeType.getHotMilk()
        + "\n" + coffeeType.getWhiteSugar());
    }
}
