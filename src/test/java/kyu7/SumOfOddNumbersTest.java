package kyu7;

import static org.junit.Assert.*;
import org.junit.Test;

public class SumOfOddNumbersTest {

    @Test
    public void test1() {
        assertEquals(1, SumOfOddNumbers.rowSumOddNumbers(1));
        assertEquals(74088, SumOfOddNumbers.rowSumOddNumbers(42));
    }
}