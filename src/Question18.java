/*
Q1.18 Write a program that reads an integer between 0 and 999 and "verbalises it". For example,
if the program is given 123 it would display "one hundred and twenty three".
Hint: Write methods to deal with ranges of numbers, such as single digits between "zero" and
"nine", numbers between 10 and 19 and so on.
*/

public class Question18 {
    String[] ones = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    String[] tens = {"ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
    String[] inbetween = {"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty"};
    
    private String hundreds(int num) {
        return ones[num/100 - 1] + " hundred and " + tens(num);
    }

    private String ones(int num) {
        return ones[num];
    }

    private String tens(int num) {
        num = num % 100;
        if (num < 10) {
            return ones(num);
        } else if (num % 10 == 0) {
            return tens[num/10 - 1];
        } else if (num < 20) {
            return inbetween[num - 11];
        } else {
            return tens[num/10 - 1] + " " + ones(num%10);
        }
    }


    private String verbalize(int num) {
        if (num > 99) {
            return hundreds(num);
        } else {
            return tens(num);
        }
    }



    public static void main(String[] args) {
        Question18 q18 = new Question18();
        System.out.println(q18.verbalize(72));
    }

}
