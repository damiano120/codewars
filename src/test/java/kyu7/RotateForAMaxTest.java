package kyu7;

import static org.junit.Assert.*;
import org.junit.Test;

public class RotateForAMaxTest {

    private static void testing(long actual, long expected) {
        assertEquals(expected, actual);
    }
    @Test
    public void test() {
        System.out.println("Fixed Tests maxRot");
        testing(RotateForAMax.maxRot(38458215), 85821534);
        testing(RotateForAMax.maxRot(195881031), 988103115);
        testing(RotateForAMax.maxRot(896219342), 962193428);
        testing(RotateForAMax.maxRot(69418307), 94183076);
    }
}