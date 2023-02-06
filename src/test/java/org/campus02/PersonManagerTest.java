package org.campus02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonManagerTest {

    Person person;
    PersonManager pm;

    @BeforeEach
    void setUp() {
        person = new Person(
                "max",
                "mustermann",
                'M',
                22,
                "AUT",
                2000,
                "blau",
                80,
                180);

        pm = new PersonManager();
    }

    @Test
    void addPerson() {
        int personCount = pm.getPersons().size();
        pm.addPerson(person);

        Assertions.assertTrue(pm.getPersons().contains(person));
        Assertions.assertTrue(personCount < pm.getPersons().size());
    }
}