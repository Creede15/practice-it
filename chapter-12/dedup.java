/* Write a recursive method called dedup that takes a string as a parameter and that returns a new string
obtained by replacing every sequence of repeated adjacent letters with just one of that letter. For example,
the string "bookkkkkeeper" has three repeated adjacent letters ("oo", "kkkkk", and "ee"), so the call of dedup("bookkkkkeeper")
should return "bokeper". Do not call the string replace or split methods in your solution.*/

public static String dedup(String s) {
        if (s.length() == 1) {
            return s;
        }
        if (s.charAt(0) != s.charAt(1)) {
            String newS = Character.toString(s.charAt(0));
            return newS + dedup(s.substring(1));
        }
        return dedup(s.substring(1));
    }
