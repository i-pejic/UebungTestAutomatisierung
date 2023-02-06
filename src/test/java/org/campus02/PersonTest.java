package org.campus02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonTest {

    Person person;

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
    }

    @Test
    void testConstructor() {
        Assertions.assertEquals("max", person.getFirstname());
        Assertions.assertEquals("mustermann", person.getLastname());
        Assertions.assertEquals("blau", person.getEyeColor());
    }
    @Test
    void setEyeColor() {
        String newEyeColor = "green";
        person.setEyeColor("green");

        if(newEyeColor.equals("braun") || newEyeColor.equals("grün") || newEyeColor.equals("blau")) {
            Assertions.assertEquals(newEyeColor, person.getEyeColor());
        }
        else {
            Assertions.assertEquals("undefined", person.getEyeColor());
        }
    }
}