package kyu7;

/*
Task
Given a string str, reverse it omitting all non-alphabetic characters.

Example
For str = "krishan", the output should be "nahsirk".

For str = "ultr53o?n", the output should be "nortlu".

Input/Output
[input] string str

A string consists of lowercase latin letters, digits and symbols.

[output] a string
 */

public class ReverseLetter {

    public static String reverseLetter(final String str) {
//        char[] tab = str.toCharArray();
//        String content = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
//        StringBuilder sb = new StringBuilder();
//        for (int i = str.length()-1; i >= 0; i--) {
//            if (content.contains(""+tab[i]))
//            sb.append(tab[i]);
//        }

        return new StringBuilder(str.replaceAll("[^a-zA-Z]", "")).reverse().toString();
    }
}
