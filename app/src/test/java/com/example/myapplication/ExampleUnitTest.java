package com.example.myapplication;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void additionCount() {
        final String inputString = "9+60";
        final String expectedOutcome = "69.0";

        assertEquals(expectedOutcome, equalsLogic.calculate(inputString));
    }

    @Test
    public void divideCount() {
        final String inputString = "63/9";
        final String expectedOutcome = "7.0";

        assertEquals(expectedOutcome, equalsLogic.calculate(inputString));
    }

    @Test
    public void subtractionCount() {
        final String inputString = "500-80";
        final String expectedOutcome = "420.0";

        assertEquals(expectedOutcome, equalsLogic.calculate(inputString));
    }

    @Test
    public void multiplyCount() {
        final String inputString = "1000*24";
        final String expectedOutcome = "24000.0";

        assertEquals(expectedOutcome, equalsLogic.calculate(inputString));
    }

    @Test
    public void multipleexpressionsCount() {
        final String inputString = "8*2-10/2";
        final String expectedOutcome = "11.0";

        assertEquals(expectedOutcome, equalsLogic.calculate(inputString));
    }

}