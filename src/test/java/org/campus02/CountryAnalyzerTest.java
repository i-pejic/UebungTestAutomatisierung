package org.campus02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CountryAnalyzerTest {

    Person maleOne;
    Person maleTwo;
    Person maleThree;
    PersonManager pm;
    CountryAnalyzer ca;

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
                70,
                180);

        maleTwo = new Person(
                "max",
                "mustermann",
                'M',
                22,
                "AUT",
                2000,
                "blau",
                90,
                180);

        maleThree = new Person(
                "max",
                "mustermann",
                'M',
                22,
                "DE",
                2000,
                "blau",
                90,
                180);

        pm = new PersonManager();
        pm.addPerson(maleOne);
        pm.addPerson(maleTwo);
        pm.addPerson(maleThree);

        ca = new CountryAnalyzer();
        pm.doAnalysis(ca);
    }

    /**
     * check result
     */
    @Test
    void analyze() {

        Assertions.assertEquals(2, ca.getResult().get("AUT"));
        Assertions.assertEquals(1, ca.getResult().get("DE"));
    }
}