import java.io.File;
import java.util.ArrayList;

public class Question12 {

    public static void main(String[] args) {

        String filePath = "/Users/matejpechoucek/IdeaProjects/objectOrientedProgramming/src/q12.txt";

        if (!FileInput.exists(filePath)) {
            System.err.println("File does not exist");
            System.exit(1);
        }

        FileInput input = new FileInput(filePath);
        ArrayList<Character> text = new ArrayList<>();

        while (input.hasNext()) {
            text.addFirst(input.nextChar());

        }

        File directory = new File("/Users/matejpechoucek/IdeaProjects/objectOrientedProgramming/src");
        File file = new File(directory, "q12copy.txt");

        FileOutput output = new FileOutput(file);


        for (Character character : text) {
            //System.out.println(character);
            output.writeChar(character);
        }
        output.close();

    }

}
