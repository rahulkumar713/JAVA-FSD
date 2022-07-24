package practice;
import java.util.Scanner;

//   Writing a program in Java to implement implicit and explicit type casting

public class practice1 {
    public static void main(String[] args) {
        System.out.println("Implicit type casting :-> ");
        System.out.println("**********************************************");
        byte a = 98;
        System.out.println("this number in byte data type now :-> " + a);
        short b =a;
        System.out.println("this number in short data type now :-> "+ b);
        int c = b;
        System.out.println("this number in int data type now :-> "+ c);
        long d = c;
        System.out.println("this number in long data type now :-> "+ d);
        float e = d;
        System.out.println("this number in float data type now :-> "+ e);
        double f = e;
        System.out.println("this number in double data type now :-> "+ f);
        System.out.println("\n**********************************************");
        System.out.println("Explicit type casting :-> ");
        System.out.println("**********************************************\n");

        System.out.println("as we know now f is in double . so now we are doing reverse");
        double f1 = 63.89765;
        System.out.println("this number in double data type now :-> "+ f1);
        float e1 = (float) f1;
        System.out.println("this number in float data type now :-> "+ e1);
        long d1 = (long) e1;
        System.out.println("this number in long data type now :-> "+ d1);
        int c1 = (int) d1;
        System.out.println("this number in int data type now :-> "+ c1);
        short b1 = (short) c1;
        System.out.println("this number in short data type now :-> "+ b1);
        byte a1 = (byte) b1;
        System.out.println("this number in byte data type now :-> "+ a1);
    }
}
