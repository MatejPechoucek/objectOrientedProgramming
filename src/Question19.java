import java.util.ArrayList;

/*
Q1.19 Write a program to determine if an integer of any length is a palindrome. The Java long type
is limited to a 64-bit representation, which limits the length of integers that can be used to a
maximum of 19 digits. You may know that Python integer values can be any length by default
(arbitrary or unbounded precision). Java has a class type called BigInteger that implements the
same kind of behaviour, but is not as easy to use as BigInteger objects have to be used via
method calls, not the more familiar +,-,*,/ operators. Use the JavaDoc documentation to find out
about class BigInteger and then write a version of your palindrome program to work with it.
Note: don’t solve this by converting the BigInteger to a String and reversing the String!
*/
import java.math.BigInteger;

public class Question19 {

    private ArrayList<BigInteger> convertList(BigInteger number) {
        ArrayList<BigInteger> myarray = new ArrayList<>();
        BigInteger zero = new BigInteger("0");
        BigInteger ten = new BigInteger("10");
        while (zero.compareTo(number) == -1) {
            myarray.add(number.mod(ten));
            number = number.divide(ten);
        }
        return myarray;
    }

    public static void main(String[] args) {
        Question19 q19 = new Question19();
        BigInteger number = new BigInteger("12345678987654321");
        if (q19.convertList(number).equals(q19.convertList(number).reversed())) {
            System.out.println("Number is a palindrome");
        } else {
            System.out.println("Number is NOT a palindrome");
        }
    }

}
