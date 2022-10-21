package com.design.pattern.factory;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CoffeeType {

    CoffeeType()
    {


    }

    private  String coldMilk = "cold milk";
    private  String hotMilk = "hot milk";
    private  String whiteSugar = "white sugar";
    private  String brownSugar = "brown sugar";
    private  String cream = "cream";
    private  String wholeCoffeeBean = "whole coffee bean";
    private  String honey = "honey";
    private  String vanillaSyrup = "vanilla syrup";
    private  String cinnamonSyrup = "cinnamon syrup";
}
