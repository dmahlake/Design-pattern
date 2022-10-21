package com.design.pattern.factory;

public class Americano extends CoffeeType implements CoffeeMaker{

    CoffeeType coffeeType = new CoffeeType();

    @Override
    public void coffee() {

        System.out.println("Americano with : ");
        System.out.println(coffeeType.getWholeCoffeeBean() + "\n" + coffeeType.getWhiteSugar() + "\n" +
                coffeeType.getCinnamonSyrup() + "\n" + coffeeType.getHotMilk() + "\n" + coffeeType.getCream());
    }
}
