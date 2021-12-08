package Lesson29;

public class Test {
    public static void main(String[] args) {
//        Animal animal1 = new Animal();
//        Dog dog1 = new Dog();
//
//        animal1.eat();
//        dog1.eat();

//        Animal animal1 = new Dog();
//        animal1.eat();
////        animal1.bark();
//        Dog dog1 = new Dog();
//        dog1.eat();
//        dog1.bark();

        Animal animal1 = new Animal();
        Dog dog1 = new Dog();
        Cat cat1 = new Cat();
        
        testAnimal(animal1);
        testAnimal(dog1);
        testAnimal(cat1);


    }
    public static void testAnimal(Animal animal) {
        animal.eat();

    }

}
