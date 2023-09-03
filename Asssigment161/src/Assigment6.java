import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Assigment6 {
	
	public static void main(String[] args) {
        String target = args[0];
        String replacement = args[1];
        String filename = args[2];

        File file = new File("src/assignments/" + filename + ".txt");
        replaceEntry(file, target, replacement);

    }

    // #region Replacement method

    public static void replaceEntry(File file, String target, String replacement) {
        ArrayList<String> contents = readFile(file);
        for (int i = 0; i < contents.size(); i++) {
            contents.set(i, contents.get(i).replaceAll(target, replacement));
        }
        // We use arraylist .set() functionality to replace a each line,
        // with a regex filtered version of the same line via replaceAll!

        // File result = new File(
        // "src/basics/" + file.getName().substring(0, file.getName().length() - 4) +
        // "Replaced.txt");
        // If filename is test.txt, this code makes a new file labeled testReplaced.txt

        // If you wanted to make a new file to copy the changed contents to,
        // you would uncomment lines 32, 33, and 34! and change line 40 to
        // writeFile(result, contents)
        // I would also need to change the writeFile method to accomodate for
        // creating a new file, by checking is the file exists.
        // I would do this but I do not know if I should use java.nio.files
        // :)

        writeFile(file, contents);
        // This method is custom-made and available above,
        // the overloaded one with an ArrayList parameter is used!
    }

    // #endregion

    // #region Assistant methods

    public static ArrayList<String> readFile(File file) {
        ArrayList<String> result = new ArrayList<String>();
        try {
            Scanner myReader = new Scanner(file);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                result.add(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return result;
    }

    public static void writeFile(File file, ArrayList<String> contents) {

        // File writer writes to a file, (effectively overwritting all
        // content in the pre-existing file)
        try (FileWriter writer = new FileWriter(file)) {
            for (int i = 0; i < contents.size(); i++) {
                writer.write(contents.get(i) + "\n");
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    // #endregion

}
