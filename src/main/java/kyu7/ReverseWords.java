package kyu7;

/*
Complete the function that accepts a string parameter, and reverses each word in the string. All spaces in the string should be retained.

Examples
"This is an example!" ==> "sihT si na !elpmaxe"
"double  spaces"      ==> "elbuod  secaps"
 */

public class ReverseWords {
    public static String reverseWords(final String original) {
        String[] tab = original.split("[\\s]");
        StringBuilder sb = new StringBuilder();

        for (String s : tab) {
            StringBuilder word = new StringBuilder();
            sb.append(word.append(s).reverse() + " ");
        }
        if (sb.length() > 1) {
            sb.deleteCharAt(sb.length() - 1);
        }
        System.out.println(original);
        System.out.println(sb);

        return sb.toString();
    }
}
