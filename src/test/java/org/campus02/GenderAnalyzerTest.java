package org.campus02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GenderAnalyzerTest {

    Person maleOne;
    Person maleTwo;
    Person femaleOne;
    Person femaleTwo;
    PersonManager pm;
    GenderAnalyzer ga;

    @BeforeEach
    void setUp() {
        maleOne = new Person(
                "max",
                "mustermann",
                'M',
                22,
                "AUT",
                2000,
                "blau",
                80,
                180);

        maleTwo = new Person(
                "max",
                "mustermann",
                'M',
                22,
                "AUT",
                2000,
                "blau",
                80,
                190);

        femaleOne = new Person(
                "max",
                "mustermann",
                'F',
                22,
                "AUT",
                2000,
                "blau",
                80,
                180);

        femaleTwo = new Person(
                "max",
                "mustermann",
                'F',
                22,
                "AUT",
                2000,
                "blau",
                80,
                190);

        pm = new PersonManager();
        pm.addPerson(maleOne);
        pm.addPerson(maleTwo);
        pm.addPerson(femaleOne);
        pm.addPerson(femaleTwo);

        ga = new GenderAnalyzer();
        pm.doAnalysis(ga);
    }

    /**
     * Test the result of avgM and avgW
     */
    @Test
    void analyze() {
        int avgM = ga.getAvgM();
        int avgW = ga.getAvgW();

        Assertions.assertEquals(185, avgM);
        Assertions.assertEquals(185, avgW);
    }
}