package kyu7;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class CountAllTheSheepOnFarmInTheHeightsOfNewZealandTest {

    @Test
    public void basicTests() {
        assertEquals(5, CountAllTheSheepOnFarmInTheHeightsOfNewZealand.lostSheeps(new int[] {1,2}, new int[] {3,4}, 15));
        assertEquals(6, CountAllTheSheepOnFarmInTheHeightsOfNewZealand.lostSheeps(new int[] {3,1,2}, new int[] {4,5}, 21));
    }
}