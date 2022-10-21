package com.design.pattern.factory;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CoffeeFactory {

   public CoffeeMaker getCoffee(String coffeeChoice)
   {
       if (coffeeChoice == null)
           return null;
       if(coffeeChoice.equalsIgnoreCase("Americano"))
       {
           return new Americano();
       }
       else if (coffeeChoice.equalsIgnoreCase("Espresso"))
       {
           return new Espresso();
       }
       return null;
   }
}
