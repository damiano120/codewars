package kyu7;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class ReverseLetterTest {

    @Test
    public void testSomething() {
        doTest("krishan", "nahsirk");
        doTest("ultr53o?n", "nortlu");
        doTest("ab23c", "cba");
        doTest("krish21an", "nahsirk");
    }
    private void doTest(final String str, final String expected) {
        assertEquals(expected, ReverseLetter.reverseLetter(str));
    }
}