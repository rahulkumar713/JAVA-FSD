
import java.util.Scanner;

public class calculator {
    protected static void add(float a , float b)
    {
        System.out.println("The answer is : "+ (a+b));
    }
    protected static void subtract(float a , float b)
    {
        System.out.println("The answer is : "+ (a-b));
    }
    protected static void multiply(float a , float b)
    {
        System.out.println("The answer is : "+ (a*b));
    }
    protected static void divide(float a , float b)
    {
        System.out.println("The answer is : "+ (a/b));
    }

    public static void main(String[] args) {
        float number1  , number2;
        Scanner sc = new Scanner(System.in);
        System.out.println("\t********************************");
        System.out.println("\tWelcome to Arithmetic Calculator");
        System.out.println("\t********************************");
        System.out.print("Enter the first number :-> ");
        number1  = sc.nextFloat();
        System.out.print("Enter the second number :-> ");
        number2  = sc.nextFloat();
        System.out.println("*****************************");
        System.out.println("Enter the Operation \n 1.Addition(+) \n 2.Subtraction(-) \n 3.Multiplication(*) \n 4.Division(/) ");
        System.out.println("*****************************");
        int num;
        System.out.print("you have chosen :-> ");
        num = sc.nextInt();
        switch (num)
        {
            case 1 -> add(number1 , number2);
            case 2 -> subtract(number1 , number2);
            case 3 -> multiply(number1 , number2);
            case 4 -> divide(number1 , number2);
            default -> System.out.println(" sorry wrong input ");
        }
    }
}
