package com.design.pattern.singleton;

import org.apache.log4j.Logger;

public class SingletonFirst {

    private static final Logger LOGGER = Logger.getLogger(SingletonFirst.class.getName());

    private static SingletonFirst instance;

    public SingletonFirst(){}

    public static SingletonFirst getInstance() {
        if (instance == null){
            instance = new SingletonFirst();
        }
        return instance;
    }

    public static void main(String[] args) {

        SingletonFirst first = new SingletonFirst();


        System.out.println();
        LOGGER.info("Class name is :" + first);
    }
}
