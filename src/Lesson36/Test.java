package Lesson36;


import javax.swing.plaf.IconUIResource;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;
        String path = separator + "C:" +separator+ "Users" +separator+ "Nord" + separator + "IdeaProjects"+separator+"JavaBiginner"+separator+"src"+separator+"Lesson36"+separator+"File.txt";

        String path2 ="C:\\Users\\Nord\\IdeaProjects\\JavaBiginner\\src\\Lesson36\\File.txt";

        File file = new File(path);

        Scanner scanner = new Scanner(file);

        String line = scanner.nextLine();
        String[] num = line.split(" ");

        int[] numbers = new int[5];
        int counter = 0;

        for (String number: num ){
            numbers[counter++] = Integer.parseInt(number);
        }



        System.out.println(Arrays.toString(numbers));

        scanner.close();
    }
}
