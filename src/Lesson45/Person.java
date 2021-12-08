package Lesson45;

import java.io.Serializable;

public class Person implements Serializable {
    private static final long serialVersionUID = 4166557366696235476L;
    private int id;
    private String name;

    public Person(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId45() {
        return id;
    }

    public String getName45() {
        return name;
    }

    public String toString(){
        return id + " : " + name;
    }
}
