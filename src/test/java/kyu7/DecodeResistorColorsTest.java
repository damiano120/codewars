package kyu7;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;


public class DecodeResistorColorsTest {
    @Test
    public void testOne() {
        System.out.println("A resistor under 1000 ohms and with only three bands");
        assertEquals("47 ohms, 20%", DecodeResistorColors.decodeResistorColors("yellow violet black"));
    }
    @Test
    public void testTwo() {
        System.out.println("A resistor between 1000 and 999999 ohms, with a gold fourth band");
        assertEquals("4.7k ohms, 5%", DecodeResistorColors.decodeResistorColors("yellow violet red gold"));
    }
    @Test
    public void testThree() {
        System.out.println("A resistor of 1000000 ohms or above, with a silver fourth band");
        assertEquals("1M ohms, 10%", DecodeResistorColors.decodeResistorColors("brown black green silver"));
    }
}