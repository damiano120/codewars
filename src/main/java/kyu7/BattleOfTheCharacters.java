package kyu7;

/*
Description:
Groups of characters decided to make a battle. Help them to figure out which group is more powerful. Create a function that will accept 2 variables and return the one who's stronger.

Rules:
Each character have its own power: A = 1, B = 2, ... Y = 25, Z = 26
Only capital chatacters can and will participate a battle.
Only two groups to a fight.
Group whose total power (A + B + C + ...) is bigger wins.
If the powers are equal, it's a tie.
Examples:
  battle("ONE", "TWO"); // => "TWO"`
  battle("ONE", "NEO"); // => "Tie!"
 */

import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class BattleOfTheCharacters {
    public static String battle(final String x, final String y) {
        HashMap<Character, Integer> map = new HashMap<>();
        char key = 'A';
        int value = 1;
        for (int i = 1; i <= 26; i++) {
            map.put(key, value);
            key++;
            value++;
        }

        char[] tabX = x.toCharArray();
        char[] tabY = y.toCharArray();
        int sumX = 0, sumY = 0;
        for (char cx : tabX) {
            sumX += map.get(cx);
        }
        for (char cy : tabY){
            sumY += map.get(cy);
        }

        if (sumX < sumY){
            return y;
        } else if (sumX > sumY){
            return x;
        } else {
            return "Tie!";
        }
    }
}
