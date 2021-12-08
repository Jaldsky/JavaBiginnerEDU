import java.util.ArrayList;
import java.util.List;

public class Listing33 {
    public static void main(String[] args) {
        /////////Without Generic /////////
        List animals = new ArrayList();
        animals.add("dog");
        animals.add("cat");
        animals.add("frog");

        String animal = (String) animals.get(1);
        System.out.println(animal);
        ///////////////////////////////

    //        List<String> animals2 = new ArrayList<String>();
        List<String> animals2 = new ArrayList<>(); //или так
        animals2.add("dog");
        animals2.add("cat");
        animals2.add("frog");

        System.out.println(animals2);
    }
}
