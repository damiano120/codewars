package kyu7;

import static org.junit.Assert.*;
        import org.junit.Test;


public class GoingToTheCinemaTest {
    private static void testing(long actual, long expected) {
        assertEquals(expected, actual);
    }
    @Test
    public void test1() {
        System.out.println("Fixed Tests: movie");
        testing(GoingToTheCinema.movie(500, 15, 0.9), 43);
        testing(GoingToTheCinema.movie(100, 10, 0.95), 24);
    }
}
