package Listing34;

public class Animal {
    int id;
    public Animal(){

    }
    public Animal(int id){
        this.id = id;
    }

    public String toString() {
        return String.valueOf(id);
    }

    public void eat(){
        System.out.println("Animal is eating...");
    }
}