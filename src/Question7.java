public class Question7 {

    public String toBase(int n, int b) {
        StringBuilder num = new StringBuilder();
        while (n > 0) {
            num.insert(0, (n % b));
            n /= b;
        }
        return num.toString();
    }


    public static void main(String[] args) {
        Question7 ex7 = new Question7();
        System.out.println(ex7.toBase(612,6));
    }


}
