package Lesson45;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        Person[] peopleList = {new Person(1, "Bob"),
                new Person(2, "Mike"), new Person(3, "Helen")};

        try {
            FileOutputStream fos = new FileOutputStream("C:\\Users\\Nord\\IdeaProjects\\JavaBiginner\\src\\Lesson45\\people.bin"); //нужен для преобразования объекта в байт-код
            ObjectOutputStream oos = new ObjectOutputStream(fos); //нужен для записи объекта

            oos.writeInt(peopleList.length); //записываем число объекто в массиве

            for (Person person:peopleList){
                oos.writeObject(person);
            }

            //oos.writeObject(peopleList);//альтернативный способ


            oos.close(); //чтобы постоянно не писать закрытие потока можно написать так try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("people.bin")))) { }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
