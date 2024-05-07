package com.santander.streamAPI.People;

public class Person {

    private final String name;
    private final double heigth;

    public Person(String name, double heigth) {
        this.name = name;
        this.heigth = heigth;
    }

    @Override
    public String toString() {
        return(
            "Person{" + "name='" + name + '\'' +
            ", heigth=" + heigth + '}'
        );
    }

    public String getName() {
        return name;
    }

    public double getHeigth() {
        return heigth;
    }
}


