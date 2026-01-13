import java.util.Scanner;

public class Exercises5to6 {

    double num1;
    double num2;

    public double inputDouble() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a double: ");
        return Double.parseDouble(sc.nextLine());
    }
    public double squareDouble(double d1, double d2) {
        return Math.sqrt(d1 + d2);
    }

    private void setnums(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    private double getnums() {
        return Math.sqrt(this.num1 + this.num2);
    }


    public static void main(String[] args) {
        Exercises5to6 ex5 = new Exercises5to6();
        //System.out.println(ex5.squareDouble(ex5.inputDouble(), ex5.inputDouble())); //Q1.5
        //ex5.setnums(ex5.inputDouble(), ex5.inputDouble()); //Q1.6
        //System.out.println(ex5.getnums()); //Q1.6


    }




}
