package Lesson32;

import Lesson32.Animal;

public class Dog extends Animal {
    @Override
    public void eat(){
        System.out.println("Dog's eating");
    }
    public void bark(){
        System.out.println("Dog's barking");
    }
}

