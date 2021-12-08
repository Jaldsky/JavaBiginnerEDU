public class Lesson31 {
    public static void main(String[] args) {
        Integer ex1 = new Integer(231341); //упаковка примитива в класс
        Integer ex2 = 231341; //упаковка примитива в класс

        int ex3 = ex2; //распаковка примитива из класса

        System.out.println(ex1.byteValue());


        System.out.println(Integer.parseInt("423423"));
    }
}
