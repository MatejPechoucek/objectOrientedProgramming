import java.util.HashMap;

public class Question11 {

    public static void main(String[] args) throws InterruptedException {

        String filePath = "/Users/matejpechoucek/IdeaProjects/objectOrientedProgramming/src/q11.txt";

        if (!FileInput.exists(filePath)) {
            System.err.println("File does not exist");
            System.exit(1);
        }

        FileInput input = new FileInput(filePath);

        HashMap<String, Integer> characters = new HashMap<>();

        for (int i = 97; i <= 122; i++) {
            characters.put(Character.toString((char)i), 0);
        }



        while (input.hasNext()) {
            char c = input.nextChar();
            if (((int)c >= 65 && (int)c <= 90) || ((int)c >= 97 && (int)c <= 122)) {
                int num = characters.get(Character.toString(c).toLowerCase());
                characters.replace(Character.toString(c).toLowerCase(),num+1);
            }
        }
        System.out.println(characters);


    }

}
