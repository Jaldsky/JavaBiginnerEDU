package Lesson42;


import Lesson32.Animal;

public class Test {
    public static void main(String[] args) {
        Animal5 animal1 = new Animal5(1);
        Animal5 animal2 = new Animal5(1);

        System.out.println(animal1 == animal2); //Сравнение ссылок на объекты, а не сами объекты
        System.out.println(animal1.equals(animal2)); //Сравнение объектов


        String string1 = "Hi"; // string1 --> "Hi"
        String string2 = "Hi"; // string2 --> string1 --> "Hi" указывает на один и тот объект в памяти

        System.out.println(string1.equals(string2));


        String string3 = "Hay";
        String string4 = "Hay123".substring(0, 3);

        System.out.println(string3);
        System.out.println(string4);
        System.out.println(string3.equals(string4));
    }
}
class Animal5{
    int id;
    public Animal5(int id){
        this.id = id;
    }

    public boolean equals(Object object){
        Animal5 otherAnimal = (Animal5) object;
        return this.id == otherAnimal.id;

    }
}
