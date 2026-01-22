/*
Q1.20 Write a program that reads a text file containing Java source code and checks that there is
a matching number of opening and closing braces (curly brackets). Beware of braces appearing in
comments, or in character literals (strings) and constants.
*/

import java.util.ArrayList;
import java.lang.*;

public class Question20 {
    public static void main(String[] args) {
        String filePath = "/Users/matejpechoucek/IdeaProjects/objectOrientedProgramming/src/q20.txt";

        if (!FileInput.exists(filePath)) {
            System.err.println("File does not exist");
            System.exit(1);
        }
        Question20 ex20 = new Question20();
        FileInput input = new FileInput(filePath);

        ArrayList<Character> chars = new ArrayList<>();
        ArrayList<Character> quotes = new ArrayList<>();

        String text;
        boolean start_count = true;
        while (input.hasNext()) {
            text = input.nextLine();
            for (int i = 0; i < text.length(); i++) {
                if (start_count) {
                    if (text.charAt(i) == '{' || text.charAt(i) == '(' || text.charAt(i) == ')' || text.charAt(i) == '}'
                            || text.charAt(i) == '[' || text.charAt(i) == ']') {
                        chars.add(text.charAt(i));
                    }
                } else {
                    if (text.charAt(i) == '"' || text.charAt(i) == '\'') {
                        quotes.add(text.charAt(i));
                        if (quotes.size() % 2 == 0) {
                            start_count = true;
                        } else {
                            start_count = false;
                        }
                    } else if (text.charAt(i) == '/' && i != (text.length() - 1) && text.charAt(i+1) == '*' ) {
                        start_count = false;
                    } else if (text.charAt(i) == '/' && i != 0 && text.charAt(i-1) == '*' ) {
                        System.out.println("not test");
                    }
                }
            }
        }
        int rounded = 0;
        int squiggly = 0;
        int square = 0;
        for (int i = 0; i < chars.size(); i++ ) {
            if (chars.get(i) == '(') {
                rounded++;
            } else if (chars.get(i) == ')') {
                rounded--;
            } else if (chars.get(i) == '{') {
                squiggly++;
            } else if (chars.get(i) == '}') {
                squiggly--;
            } else if (chars.get(i) == '[') {
                square++;
            } else if (chars.get(i) == ']') {
                square--;
            }
        }
        if ((Math.abs(rounded) + Math.abs(squiggly) + Math.abs(square)) == 0) {
            System.out.println("BALANCED");
        } else {
            System.out.println("NOT BALANCED");
        }
        input.close();
    }
}