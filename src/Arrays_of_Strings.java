public class Arrays_of_Strings {
    public static void main(String[] args) {
        String[] arrayString = new String[3];

        arrayString[0] = "Hi";
        arrayString[1] = "Bye";
        arrayString[2] = "Java";

        for (int i = 0; i<arrayString.length; i++){
            System.out.println(i);
        }

        for (String string:arrayString){ //цикл for each (для каждого)
            System.out.println(string);
        }

        int[] num = new int[]{1, 2, 3, 4, 5};
        int sum = 0;
        for (int i:num){
            sum = i + sum;
        }
        System.out.println(sum);

    }
}
