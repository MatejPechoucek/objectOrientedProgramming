/*
Q1.13 Further modify the palindrome program to read a file containing strings (one per line) and
checking whether each string is a palindrome. The palindromes found should be written to a
separate output file. Note, do a Google search to find examples.
*/

import java.io.File;
import java.util.ArrayList;

public class Question13 {




    private ArrayList<String> tidyString(String words) {
        ArrayList<String> myarray = new ArrayList<String>();
        for (int i = 0; i < words.length(); i++) {
            char x = words.charAt(i);
            if (((int)x >= 65 && (int)x <= 90) || ((int)x >= 97 && (int)x <= 122)) {
                String temp = Character.toString(x);
                myarray.add(temp.toLowerCase());
            }
        }
        return myarray;
    }

    public static void main(String[] args) {
        String filePath = "/Users/matejpechoucek/IdeaProjects/objectOrientedProgramming/src/q13.txt";

        if (!FileInput.exists(filePath)) {
            System.err.println("File does not exist");
            System.exit(1);
        }
        Question13 ex13 = new Question13();
        FileInput input = new FileInput(filePath);

        File directory = new File("/Users/matejpechoucek/IdeaProjects/objectOrientedProgramming/src");
        File file = new File(directory, "q13copy.txt");

        FileOutput output = new FileOutput(file);

        String text;
        while (input.hasNext()) {
            text = input.nextLine();
            if (ex13.tidyString(text).equals(ex13.tidyString(text).reversed())) {
                output.writeString(text);
                output.writeEndOfLine();
            } else {
                System.out.println("Found a non-palindrome.");
            }
        }
        output.close();
    }
}
