import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Assigment5 {

    public static double total(File file) {

        double total = 0;

        try {
            Scanner input = new Scanner(file);
            while (input.hasNextDouble()) {
                double data = input.nextDouble();
                total += data;
            }
            input.close();
        }

        catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        return total;
    }

    public static double average(File file) {

        ArrayList<Double> result = new ArrayList<Double>();
        try {
            Scanner input = new Scanner(file);
            while (input.hasNextDouble()) {
                double data = input.nextDouble();
                result.add(data);
                
            }
            input.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        return total(file) / result.size();
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###.###");

        System.out.println("Enter the file name");
        System.out.println("(make sure the file is in the same folder and your input ends with .txt): ");
        String filename = input.next();

        File file = new File("src/assignments/" + filename);

        System.out.println("The total of scores is: " + total(file));
        System.out.println("The average of scores is: " + df.format(average(file)));

        input.close();

    }
}