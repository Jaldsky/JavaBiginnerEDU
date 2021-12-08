package Lesson43;

import java.security.spec.RSAOtherPrimeInfo;

public class Electrocar {
    int id;

    private class ElectroMotor{
        public void startMotor(){
            System.out.println("Motor " + id + " is starting...");
        }

    }

    public static class Battery{
        public void chargeBattery(){
            System.out.println("Battery is charging...");
        }
    }

    public Electrocar(int id) {
        this.id = id;
    }
    public void start(){
        ElectroMotor electroMotor = new ElectroMotor();
        electroMotor.startMotor();

        System.out.println("Electrocar " + id + " is starting...");

        final int x = 5;
        class SomeClass{
            public void someMethod(){
                System.out.println(x);
                System.out.println(id);
            }
        }
    }
}
