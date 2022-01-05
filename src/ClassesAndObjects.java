public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Roma");
        person1.setAge(23);

        person1.sayHello();
        person1.speak();
        int year1 = person1.calculateYearsToRetirement();

        System.out.println(person1.getName() + person1.getAge());


        Person person2 = new Person();
        person2.setName("Alex");
        person2.setAge(20);

        person2.sayHello();
        person2.speak();
        int year2 = person2.calculateYearsToRetirement();

        System.out.println(year1+" " + year2);

    }
}

class Person{
    private String name;
    private int age;

    void speak(){
        System.out.println("My name is " + name + " " + age + " years");
    }
    void sayHello() {
        System.out.println("Hi");
    }
    int calculateYearsToRetirement(){
        int years = 65 - age;
        return years;
    }



    public void setName(String name) {
       if (name.isEmpty()) {
            System.out.println("Void name");
        } else{
            this.name = name;
        }
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Age < 0");
        } else {
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

