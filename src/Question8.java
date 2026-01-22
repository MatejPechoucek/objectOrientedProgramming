import java.util.Scanner;

public class Question8 {

    private String decision_maker() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("""
                    -------------------------------
                    1. Convert millimetres to feet.
                    2. Convert metres to inches.
                    3. Convert kilometres to yards.
                    4. Quit""");

            String dec = sc.nextLine();

            switch (dec) {
                case "1" -> {
                    System.out.println(mtof() + " Feet");
                }
                case "2" -> {
                    System.out.println(mtoi() + " Inches");
                }
                case "3" -> {
                    System.out.println(ktoy() + " Yards");
                }
                case "4" -> {
                    return "";
                }
                default -> {
                }
            }
        }

    }

    private double mtof() {
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Millimeters: ");
        double numb = Double.parseDouble(sc2.nextLine());
        return numb * 304.8;
    }
    private double mtoi() {
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Meters: ");
        double numb = Double.parseDouble(sc2.nextLine());
        return numb * 39.37;
    }
    private double ktoy() {
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Kilometers: ");
        double numb = Double.parseDouble(sc2.nextLine());
        return numb * 1094;
    }

    public static void main(String[] args) {
        Question8 ex8 = new Question8();
        String text = ex8.decision_maker();
        if (text.isEmpty()) {
            System.out.println();
        }
    }

}
