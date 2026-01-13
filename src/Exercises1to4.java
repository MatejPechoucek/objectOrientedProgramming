import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Exercises1to4 {

    public void inputString() {
        Scanner sc1 = new Scanner(System.in);

        while (true) {
            System.out.println("Enter string: ");

            String input = sc1.nextLine();
            String stopword = "stop";
            if (input.compareTo(stopword) == 0) {
                break;
            }
        }
    }
    public void q1point2() {
        computeAverage(inputDoubles());
    }
    public double[] inputDoubles() {
        Scanner sc2 = new Scanner(System.in);
        double[] dblarray = new double[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter a double: ");
            double input = Double.parseDouble(sc2.nextLine());
            dblarray[i] = input;
        }
        return dblarray;
    }
    public void computeAverage(double[] dblarray) {
        double total = 0.0;
        for (int i = 0; i < 10; i++) {
            total += dblarray[i];
        }
        System.out.println("Average of array: " + total/10);
    }
    public void q1point3() {
        Scanner sc3 = new Scanner(System.in);
        ArrayList<String> myarray = new ArrayList<String>();

        for (int i = 0; i < 2; i++) {
            System.out.println("Enter a string: ");
            String input = sc3.nextLine();
            myarray.add(input);
        }
        System.out.println(myarray.reversed());
    }
    public void q1point4() {
        double num;
        double max = 0.0;
        double min = 0.0;
        double tot = 0.0;
        Random random = new Random();
        for (int i = 0; i < 10000; i++) {
            num = random.nextDouble();
            if (random.nextBoolean()) {
                num = -num;
            }
            if (num > 0.9999999) {
                num -= 0.0000001;
            }
            if (num > max) {
                max = num;
            }
            else if (num < min) {
                min = num;
            }
            tot += num;

        }
        double avg = tot/10000;
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Avg: " + avg);

    }

    public static void main(String[] args) {
        Exercises1to4 ex1 = new Exercises1to4();
        //ex1.inputString(); //Q1.1
        //ex1.q1point2(); //Q1.2
        //ex1.q1point3(); //Q1.3
        ex1.q1point4(); //Q1.4
    }


}
