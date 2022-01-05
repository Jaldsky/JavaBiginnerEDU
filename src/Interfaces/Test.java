package Interfaces;

public class Test {
    public static void main(String[] args) {
        Animal animal1 = new Animal(1);
        Person person1 = new Person("Bob");

//          Info animal1 = new Animal(1);
//          Info person1 = new Person("Bob");

//        System.out.println(animal1.id);
//        System.out.println(person1.name);

        animal1.showInfo();
        person1.showInfo();

        outputInfo(animal1);
        outputInfo(person1);



    }
    public static void outputInfo(Info info) {
        info.showInfo();
    }
}
