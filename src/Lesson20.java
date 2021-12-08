public class Lesson20 {
    public static void main(String[] args) {
        HumanConstructor human1 = new HumanConstructor("Alex", 23); // Вводить данные нужно попорядку, как в конструкторе
        human1.getInfo();

        HumanConstructor human2 = new HumanConstructor(); // Вводить данные нужно попорядку, как в конструкторе
        human2.getInfo();
    }
}
class HumanConstructor {
    private String name;
    private int age;

    public HumanConstructor(){
        System.out.println("Void constructor, please enter person's name and age");
        this.name = "Default name";
        this.age = 0;
    }

    public HumanConstructor(String name){
        this.name = name;
        System.out.println("Name constructor, please enter person's age");
    }

    public HumanConstructor(int age){
        this.age = age;
        System.out.println("Age constructor, please enter person's name");
    }

    public HumanConstructor(String name, int age){
        this.age = age;
        this.name = name;
        System.out.println("Your name is "+ name + " your age is " + age);
    }
    //Конструктор со всеми возможными параметрами


    public void getInfo() {
        System.out.println("Name is " + name + " age is " + age);
    }
}