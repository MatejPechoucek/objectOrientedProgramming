/*
Q1.14 Write a program using methods to display your name, or any other message, in the middle
of a line 80 characters wide.
*/
import java.util.Scanner;

public class Question14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name/word: ");
        String input = sc.nextLine();
        int rand_num;

        int input_length = 80 - input.length();
        if (input_length % 2 == 0) {
            for (int i = 0; i < input_length/2; i++) {
                rand_num = (int)(Math.random() * 26) + 97;
                System.out.print((char)rand_num);
            }
            System.out.print(input);
            for (int j = 0; j < input_length/2; j++) {
                rand_num = (int)(Math.random() * 26) + 97;
                System.out.print((char)rand_num);
            }
        } else {
            for (int i = 0; i < input_length/2; i++) {
                rand_num = (int)(Math.random() * 26) + 97;
                System.out.print((char)rand_num);
            }
            System.out.print(input);
            for (int j = 0; j < input_length/2 + 1; j++) {
                rand_num = (int)(Math.random() * 26) + 97;
                System.out.print((char)rand_num);
            }
        }



    }

}
