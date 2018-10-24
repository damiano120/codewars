package kyu7;

/*
An isogram is a word that has no repeating letters, consecutive or non-consecutive. Implement a function that determines whether a string that contains only letters is an isogram. Assume the empty string is an isogram. Ignore letter case.

isIsogram "Dermatoglyphics" == true
isIsogram "moose" == false
isIsogram "aba" == false
 */

public class Isogram {
    public static boolean isIsogram(String str) {
//        char[] tab = str.toCharArray();
//        for (int i = 0; i < tab.length; i++) {
//            for (int j = i+1; j < tab.length; j++){
//                String temp1 = ""+tab[i];
//                String temp2 = ""+tab[j];
//                if (temp1.toLowerCase().equals(temp2.toLowerCase())) {
//                    return false;
//                }
//            }
//        }

        return str.toLowerCase().chars().distinct().count() == str.length();
    }
}
