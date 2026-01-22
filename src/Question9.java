import java.util.ArrayList;

public class Question9 {

    private ArrayList<Long> convertList(long number) {
        ArrayList<Long> myarray = new ArrayList<>();
        while (number > 0) {
            myarray.add(number % 10);
            number /= 10;
        }
        return myarray;
    }
    public static void main(String[] args) {

        Question9 ex9 = new Question9();
        ArrayList<Long> array = ex9.convertList(1221);
        if (array.equals(array.reversed())) {
            System.out.println("Number is a palindrome");
        } else {
            System.out.println("Number is NOT a palindrome");
        }
        //System.out.println("My array" + array);
    }
}