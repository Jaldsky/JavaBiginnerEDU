public class Lesson21 {
    public static void main(String[] args) {
        HumanNew human1 = new HumanNew("Alex", 20);
        HumanNew human2 = new HumanNew("Adlex", 202);
        human1.numberOfPeople();
        HumanNew human3 = new HumanNew("Alex", 20);
        HumanNew human4 = new HumanNew("Adlex", 202);
        HumanNew human5 = new HumanNew("Adlex", 202);
        human1.numberOfPeople();
    }
}
class HumanNew {
    private String name;
    private int age;

    private static int countPeople;






    public HumanNew(){
        System.out.println("Void constructor, please enter person's name and age");
        this.name = "Default name";
        this.age = 0;
        countPeople++;
    }

    public HumanNew(String name, int age){
        this.age = age;
        this.name = name;
        countPeople++;
    }
    //Конструктор со всеми возможными параметрами


    public void getInfo() {
        System.out.println("Name is " + name + " age is " + age);
    }


    public void numberOfPeople(){
        System.out.println("Number of people is " + countPeople);
    }
}