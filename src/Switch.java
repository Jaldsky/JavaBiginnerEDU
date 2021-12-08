import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age");
//        int age = scanner.nextInt();
//
//        switch (age) {
//            case 0 :
//                System.out.println("You're born");
//                break;
//            case 7 :
//                System.out.println("You're school man");
//                break;
//            case 18 :
//                System.out.println("Go to army");
//                break;
//            default:
//                System.out.println("Default case");
//        }
        String age = scanner.nextLine();
        switch (age) {
            case "один":
                System.out.println("You're born");
                break;
            case "семь" :
                System.out.println("You're school man");
                break;
            case "восемнадцать" :
                System.out.println("Go to army");
                break;
            default:
                System.out.println("Default case");
        }



    }
}
