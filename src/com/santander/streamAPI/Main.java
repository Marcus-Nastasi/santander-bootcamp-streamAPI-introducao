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
        Person p3 = new Person("Allan", 1.88);
        Person p4 = new Person("Maine", 1.60);
        Person p5 = new Person("Jack", 1.67);

        PersonOrdenation personOrdenation = new PersonOrdenation();
        personOrdenation.addPerson(p1);
        personOrdenation.addPerson(p2);
        personOrdenation.addPerson(p3);
        personOrdenation.addPerson(p4);
        personOrdenation.addPerson(p5);
        System.out.println(personOrdenation.ordenateByHeigth());
    }
}

