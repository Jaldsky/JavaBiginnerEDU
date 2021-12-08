package Lesson37;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exception1 {
    public static void main(String[] args) throws FileNotFoundException {
//        File file1 = new File("sds");
//        Scanner scanner1 = new Scanner(file1);

        File file2 = new File("ds");
        try (Scanner scanner2 = new Scanner(file2)) {
        } catch (FileNotFoundException e){
            System.out.println("File not found");
        }
        System.out.println("Code is still working...");
    }
}
