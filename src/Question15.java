/*
Q1.15 Write a program that uses a recursive method to calculate the product of a sequence of
numbers specified by the user. For example, if the user specifies 4 to 8, the method calculates
4*5*6*7*8. Any range can be used, including the use of negative numbers, and the program must
correctly determine the values in the range. Note that Java does not support ranges directly like
Groovy does.
*/
import java.util.Scanner;

public class Question15 {

    public int multiply_next(int start_num, int end_num) {
        if (start_num == 0) {
            start_num++;
        }
        if (end_num == 0) {
            end_num--;
        }
        if (end_num <= start_num) {
            return end_num;
        }
        return (end_num * multiply_next(start_num, end_num - 1));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Question15 q15 = new Question15();
        int first = 0;
        int last = 0;
        while (first == 0) {
            System.out.print("Enter starting number: ");
            first = sc.nextInt();
        }
        while (last == 0) {
            System.out.print("Enter end number: ");
            last = sc.nextInt();
        }

        System.out.println("The answer is: " + q15.multiply_next(first,last));
    }

}
