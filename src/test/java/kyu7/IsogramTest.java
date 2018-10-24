package kyu7;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class IsogramTest {

    @Test
    public void FixedTests() {
        assertEquals(Isogram.isIsogram("Dermatoglyphics"), true);
        assertEquals(Isogram.isIsogram("isogram") , true);
        assertEquals(Isogram.isIsogram("moose") , false);
        assertEquals(Isogram.isIsogram("isIsogram") , false);
        assertEquals(Isogram.isIsogram("aba") , false);
        assertEquals(Isogram.isIsogram("moOse") , false);
        assertEquals(Isogram.isIsogram("thumbscrewjapingly") , true);
        assertEquals(Isogram.isIsogram("") , true);
    }
}