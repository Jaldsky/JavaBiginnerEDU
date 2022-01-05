public class Arrays {
    public static void main(String[] args) {
        int num[] = new int[5]; //массив длиной 5 int

        for (int i = 0; i<num.length; i++){
            num[i] = i * 10;

        }
        for (int i = 0; i<num.length; i++){
            System.out.println(num[i]);

        }

        int[] num2 = {1, 2, 3, 4, 5};
        for (int i = 0; i<num2.length; i++){
            System.out.println(num2[i]);
        }
    }
}
