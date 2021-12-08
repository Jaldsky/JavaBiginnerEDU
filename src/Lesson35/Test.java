package Lesson35;

public class Test {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.eat();

        Animal animal2 = new Animal(){
            public void eat(){
                System.out.println("Other animal is eating...");
            }
        };
        animal2.eat();

//        OtherAnimal animal2 = new OtherAnimal();
//        animal2.eat();


//        AnimalInterface animal3 = new Animal2();
//        animal3.eat();

        AnimalInterface animalInterface = new AnimalInterface() {
            @Override
            public void eat() {
                System.out.println("Some one is eating...");
            }
        };
        animalInterface.eat();
    }
}
class Animal {
    public void eat(){
        System.out.println("Animal is eating...");
    }
}

//class OtherAnimal extends Animal{
//    public void eat(){
//        System.out.println("Other animal is eating...");
//    }
//
//}

interface AnimalInterface{
    public void eat();

}
//class Animal2 implements AnimalInterface{
//    @Override
//    public void eat(){
//        System.out.println("Able to eat");
//    }
//}

