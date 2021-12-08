package Lesson48;

public class Test {
    //Object --> Test
    public static void main(String[] args) {
        Animal animal1 = Animal.CAT;
        Animal animal2 = Animal.DOG;
        Animal animal3 = Animal.FROG;

        System.out.println(animal1.getTranslation());
        System.out.println(animal1.toString());

        Animal frog = Animal.valueOf("FROG");
        System.out.println(frog.getTranslation());


        switch (animal1){
            case CAT:
                System.out.println("It's cat");
                break;
            case DOG:
                System.out.println("It's dog");
                break;
            case FROG:
                System.out.println("It's frog");
                break;
            default:
                System.out.println("Unknown animal");

        }

        Season season = Season.SUMMER;
        //Object --> Enum --> Season

        System.out.println(season instanceof Season); //Проверка на то чnо переменная пренадлежит классу
        System.out.println(season.getClass()); //Метод говорит какого класса является объект

        System.out.println(season.getTemperature());
        System.out.println(season.name());
        System.out.println(season.ordinal());


        switch (season){
            case AUTUMN:
                System.out.println("Autumn");
                break;
            case WINTER:
                System.out.println("Winter");
                break;
            case SPRING:
                System.out.println("Spring");
                break;
            case SUMMER:
                System.out.println("Summer");
                break;
            default:
                System.out.println("Default");

        }

    }
}
