/*
Q1.17 Write a method to test if an integer of type long is a prime number. The method should
return a boolean value. Test your method by writing a test one-class program that reads an integer
typed at the keyboard and states whether the integer was prime.

Next, using your prime method, write a program that finds all the prime numbers that can be
represented by an integer of type long.

Notes: This is not quite as easy as it might appear, especially if you want the program to produce
results quickly. Search the web for information about prime numbers and algorithms for finding
them - there are some excellent websites
*/
import java.io.File;
import java.util.Scanner;

public class Question17 {

    private boolean isprime(long num) {
        if (num <= 1) return false;
        if (num <= 3) return true;
        if (num % 2 == 0 || num % 3 == 0) return false;

        for (long i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        Question17 q17 = new Question17();
        Scanner sc = new Scanner(System.in);

        File directory = new File("/Users/matejpechoucek/IdeaProjects/objectOrientedProgramming/src");
        File file = new File(directory, "q17copy.txt");

        FileOutput output = new FileOutput(file);
        long i = 1;
        do {
            //System.out.println(q17.isprime(i));
            if (i == Math.pow(2,27)) break;
            if (q17.isprime(i)) {

                output.writeLong(i);
                output.writeEndOfLine();
            }
            i++;

        } while (true);
        output.close();
        /*
        while (true) {
            System.out.print("Enter a number: ");
            long num = sc.nextLong();
            if (q17.isprime(num)) {
                System.out.println("Number is prime!");
            } else {
                System.out.println("Number is NOT prime!!");
            }
        }
        */

    }

}
