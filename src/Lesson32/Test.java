package Lesson32;

public class Test {
    public static void main(String[] args) {
        //Upcasting - восходящее преобразование
        //От наследника Dog к родителю Animal
        Animal animal1 = new Dog();

        //Downcasting (низходящее преобразование)
        Dog dog2 = (Dog)animal1;


        Animal ex2 = new Animal();
        Dog ex3 = (Dog)ex2;

        System.out.println(ex3);


    }
}
