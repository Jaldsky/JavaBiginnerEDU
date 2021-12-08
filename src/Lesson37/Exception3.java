package Lesson37;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exception3 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("fds");
        Scanner scanner = new Scanner(file);
    }

//    int x = 1 / 0;
//    String string1 = null;
//    string1.lenght();
//
//    int[] array1 = new int[2];
//    array1[10];

}
