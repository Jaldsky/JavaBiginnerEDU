package Lesson37;

import java.io.IOException;
import java.util.Scanner;

public class Exception2 {
    public static void main(String[] args) throws ScannerException {
        Scanner scanner = new Scanner(System.in);
        while (true){
            int exception = Integer.parseInt(scanner.nextLine());
            if (exception !=0){
//                try {
//                    throw new ScannerException("User entered not zero");
//                } catch (ScannerException e) {
//                    System.out.println("User entered not zedsafsdfro");
//                }

                throw new ScannerException("User entered not zero");

            }

        }
    }
}
