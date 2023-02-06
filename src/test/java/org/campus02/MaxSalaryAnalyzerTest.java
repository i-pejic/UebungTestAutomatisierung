package org.campus02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;

class MaxSalaryAnalyzerTest {

    Person person1;
    Person person2;
    Person person3;
    ArrayList<Person> persons = new ArrayList<>();

    @BeforeEach
    void setUp() {
        person1 = new Person(
                "max",
                "mustermann",
                'M',
                22,
                "AUT",
                2000,
                "blau",
                80,
                180);

        person2 = new Person(
                "susi",
                "sorglos",
                'W',
                22,
                "AUT",
                4000,
                "gelb",
                60,
                160);

        person3 = new Person(
                "marie",
                "sorglos",
                'W',
                22,
                "AUT",
                3000,
                "gelb",
                60,
                160);

        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
    }

    /**
     * check personsWithHighestSalary
     */
    @Test
    void analyze() {
        MaxSalaryAnalyzer maxSalaryAnalyzer = new MaxSalaryAnalyzer();
        maxSalaryAnalyzer.setPersons(persons);
        maxSalaryAnalyzer.analyze();

        HashSet<Person> personsWithHighestSalary = maxSalaryAnalyzer.getPersonsWithHighestSalary();
        Person personWithHighestSalary = new ArrayList<>(personsWithHighestSalary).get(0);

        Assertions.assertEquals(1, personsWithHighestSalary.size());
        Assertions.assertEquals(person2, personWithHighestSalary);
    }
}