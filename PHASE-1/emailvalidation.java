package practice;
import java.util.regex.*;
import java.util.*;


public class emailvalidation {
        static boolean checkEmail(ArrayList<String> emails , String temp)
        {
            if(emails.isEmpty())
            {
                return true;
            }
            for(String S : emails)
            {
                if(temp.equals(S))
                {
                    return false;
                }
            }
            return true;
        }
        static boolean checkSyntax(String temp)
        {
            String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(temp);
            return matcher.matches();

        }
        public static void main(String[] args) {

            ArrayList<String> emails = new ArrayList<String>();
            Scanner sp = new Scanner(System.in);
            int n ;
            System.out.print("Enter the number of emails you want to enter :-> ");
            n = sp.nextInt();
            String temp;
            for(int i=1 ; i<=n ;i++)
            {
                System.out.println("*******************************");
                System.out.print(" Enter your " + i + " email :- > ");

                temp = sp.next();

                if(checkEmail(emails , temp))
                {
                    if(checkSyntax(temp))
                    {
                        System.out.println("==> correct syntax");
                        System.out.println("==> adding email into the list");
                        emails.add(temp);
                    }
                    else
                    {
                        System.out.println("==> wrong email syntax");
                    }
                }
                else
                {
                    System.out.println("==> email is already present in list");
                }
            }
            System.out.println("****************************");
            System.out.println("To see the list press 1");
            int listNum = sp.nextInt();
            System.out.println("****************************");
            if(listNum == 1)
            {
                for (String em : emails)
                {
                    System.out.println("--> "+em);
                }
            }
        }
    }
