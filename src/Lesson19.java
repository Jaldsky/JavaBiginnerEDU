public class Lesson19 {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.setName("Alex");
        human1.setAge(25);

        human1.getInfo();
    }
}
class Human {
    private String name;
    private int age;

    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public void getInfo() {
        System.out.println("Name is " + name + " age is " + age);
    }
}