package org.campus02;

//import org.campus02.BMIAnalyzer;
//import org.campus02.GenderAnalyzer;
//import org.campus02.Person;
//import org.campus02.PersonManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BMIAnalyzerTest {

    Person maleOne;
    Person maleTwo;
    PersonManager pm;
    BMIAnalyzer ba;

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

        pm = new PersonManager();
        pm.addPerson(maleOne);
        pm.addPerson(maleTwo);

        ba = new BMIAnalyzer();
        pm.doAnalysis(ba);
    }


    @Test
    void calcBmi() {
        double maleOneBMI = maleOne.getWeight() / ((maleOne.getSize() / 100.0) * (maleOne.getSize() / 100.0));

        Assertions.assertEquals(maleOneBMI, ba.calcBmi(maleOne));
    }

    /**
     * check result
     */
    @Test
    void analyze() {
        Assertions.assertEquals(2, ba.getResult().size());
        Assertions.assertEquals(maleOne, ba.getResult().get(0).getKey());
        Assertions.assertEquals(maleTwo, ba.getResult().get(1).getKey());
    }
}