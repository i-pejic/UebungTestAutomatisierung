package org.campus02;

import java.util.ArrayList;

public class PersonManager {
    private ArrayList<Person> persons;

    public PersonManager() {
        persons = new ArrayList<>();
    }

    public void addPerson(Person p) {
        //this.persons.add(p);
        persons.add(p);
    }

    public ArrayList<Person> getPersons() {
        return persons;
    }

    public void doAnalysis(PersonAnalyzer a) {
        //a.setPersons(this.persons);
        a.setPersons(persons);
        a.analyze();
    }


}
