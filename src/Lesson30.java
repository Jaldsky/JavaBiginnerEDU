public class Lesson30 {
    public static void main(String[] args) {
        float float1 = 2.4545F; //по умолчанию в Java все числа с плавающей точкой имеют тип double
        float float2 = (float) 2.4545; //можно приводить и так
        long long1 = 1231231231231231231L; //по умолчанию в Java все числа имеют тип int

        int example = 299399;

        long ex1 = example; //не явное приведение
        int ex2 = (int) ex1; //явное приведение


        float example2 = (float) 124.5654;
        System.out.println(Math.round(example2));

        byte ex3 = (byte) 127; //-128 127
        byte ex4 = (byte) 128;
        byte ex5 = (byte) 129;
        byte ex6 = (byte) 130;
        System.out.println("New row \n" + ex3 + "\n" + ex4 + "\n" + ex5 + "\n" + ex6);
    }
}
