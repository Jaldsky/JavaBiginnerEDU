package Lesson37;

import java.io.IOException;
import java.text.ParseException;

public class Exception4 {
    public static void main(String[] args) {
//        try {
//            run();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
        try {
            run();
        } catch (IOException | ParseException e) {

        }


    }
    public static void run() throws IOException, ParseException, IllegalArgumentException {

    }
}
