package Lesson44;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\Nord\\IdeaProjects\\JavaBiginner\\src\\Lesson44\\testfile");
        PrintWriter printWriter = new PrintWriter(file);

        printWriter.println("Row 1");
        printWriter.println("Row 2");
        printWriter.println("Row 3");

        printWriter.close();
        System.out.println(1);

    }
}
