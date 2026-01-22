import java.util.ArrayList;

public class Question10 {

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
        Question10 ex10 = new Question10();
        String text = "Neil, a trap! Sid is part alien!";
        if (ex10.tidyString(text).equals(ex10.tidyString(text).reversed())) {
            System.out.println("Sentence is a palindrome!");
        } else {
            System.out.println("Sentence is NOT a palindrome!");
        }
    }

}
