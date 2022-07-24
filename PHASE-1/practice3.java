package practice;
import java.util.Scanner;

// Writing a program in Java to verify implementations of methods and ways of calling a method

public class practice3 {
    static void hello(){
        System.out.println("hello friends i'm in method 'hello'");
    }
    static int add(int a , int b)
    {
        System.out.println("this method add two numbers");
        return a+b;
    }
    static void name(String  Fname , String Lname)
    {
        System.out.println("this method combine first and last name");
        System.out.println("your name is "+Fname.toUpperCase()+ " " + Lname.toUpperCase());
    }
    public static void main(String[] args) {
        System.out.println("Implementation of methods");
        hello();
        System.out.println(add(25 , 65));
        name("rahul" , "kumar");
    }
}
