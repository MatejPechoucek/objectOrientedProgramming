/*
Q1.16 Write a method that takes two character array parameters and returns true if both arrays
contain the same characters but not necessarily in the same order. Note, character arrays are of
type char[].
*/

import java.util.ArrayList;

public class Question16 {

    private boolean same_chars(char[] arr1, char[] arr2) {
        ArrayList<Character> arrlist1 = new ArrayList<>();
        ArrayList<Character> arrlist2 = new ArrayList<>();
        for (Character character : arr1) {
            arrlist1.add(character);
        }
        for (Character character : arr2) {
            arrlist2.add(character);
        }
        arrlist1.sort(null);
        arrlist2.sort(null);
        if (arrlist1.equals(arrlist2)) {
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        Question16 q16 = new Question16();

        char[] chars1 = {'s', 'i', 'l', 'e', 'n', 't'};
        char[] chars2 = {'l', 'i', 's', 't', 'e', 'n'};

        System.out.println(q16.same_chars(chars1, chars2));
    }

}
