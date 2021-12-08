package Lesson45;

import java.io.*;
import java.util.Arrays;

public class ReadObject {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\Nord\\IdeaProjects\\JavaBiginner\\src\\Lesson45\\people.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            int personCounter = ois.readInt();
            Person[] personList = new Person[personCounter];

            for (int i = 0; i < personCounter; i++){
                personList[i] = (Person) ois.readObject();
            }

            System.out.println(Arrays.toString(personList));


          // Person personList = (Person[]) ois.readObject(); //альтернативный способ


        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
