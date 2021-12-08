import java.security.spec.RSAOtherPrimeInfo;

public class Lesson23 {
    public static void main(String[] args) {
//        String hello = "Hello";
//        String my = "my";
//        String friend = "friend";
//
//        String allStrings = hello + my +friend;
//        System.out.println(allStrings);

        StringBuilder sb = new StringBuilder("Hello");

        System.out.println(sb.toString());
        sb.append("my");
        sb.append("friend");

        System.out.println(sb.toString());


        System.out.print("Hello");
        System.out.println("Friend");



        System.out.printf("Simple %s Simple %d Simple %-8.2f ENDNEW %8.2f", "STRING", 25, 8.28, 8.28);
        //-[8][.f][2] Минус - это разворот, 8 - это ширина, f - тип, 2 округление



    }
}
