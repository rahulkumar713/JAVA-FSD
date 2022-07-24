package practice;
import java.util.Scanner;
// Writing a program in Java to implement access modifiers

public class practice2 {
    static class default1{
        void message()
        {
            System.out.println("This is a message from Default access modifier");
        }
    }
    static class private1
    {
        private String Name;
        public String get_name(){
            System.out.println("this is public Function to get name");
            return this.Name;
        }
        protected void Set_name(String Name)
        {
            System.out.println("this is protected function to set name ");
            this.Name = Name;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your name :-> ");
        String n = sc.nextLine();
        private1 d = new private1();
        System.out.println("the name is private ");
        d.Set_name(n);
        System.out.println("the name is "+d.get_name());
        default1 e = new default1();
        e.message();
    }
}