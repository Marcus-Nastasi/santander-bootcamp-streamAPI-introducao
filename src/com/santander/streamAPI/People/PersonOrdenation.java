package com.santander.streamAPI.People;

import java.util.ArrayList;

public class PersonOrdenation {

    private final ArrayList<Person> personArrayList = new ArrayList<>();

    public PersonOrdenation() {}

    public void addPerson(Person person) {
        this.personArrayList.add(person);
    }

    public ArrayList<Person> ordenateByHeigth() throws RuntimeException {
        if(this.personArrayList.isEmpty()) throw new RuntimeException("Empty list");
        ArrayList<Person> ordenated = new ArrayList<>(this.personArrayList);
        ordenated.sort((p1, p2) -> Double.compare(p1.getHeigth(), p2.getHeigth()));
        return ordenated;
    }
}


