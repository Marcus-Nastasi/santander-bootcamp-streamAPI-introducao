package com.santander.streamAPI;

import com.santander.streamAPI.People.Person;
import com.santander.streamAPI.People.PersonOrdenation;

public class Main {
    public static void main(String[] args) {
        try {
            testPerson();
        } catch(Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public static void testPerson() {
        Person p1 = new Person("Ally", 1.56);
        Person p2 = new Person("Josh", 1.76);

        PersonOrdenation personOrdenation = new PersonOrdenation();
        personOrdenation.addPerson(p1);
        personOrdenation.addPerson(p2);

        System.out.println(personOrdenation.ordenateByHeigth());
    }
}

