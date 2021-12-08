public class Lesson24 {
    public static void main(String[] args) {


        Human2 human2 = new Human2("Bob", 54);
        System.out.println(human2);
        System.out.println(human2.toString()); //Одно и то же, что System.out.println(human2);

    }
}
class Human2 {
    private String name;
    private int age;

    public Human2(String name, int age){
        this.age = age;
        this.name = name;
    }
    public String toString() {
        return name + ", " + age;
    }
}
