import java.util.Scanner;

public class basic {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        //input
        String s1="Prerna Dixit";
        String s2=new String("CSE");
        System.out.println("enter the year:");
        String s3=sc.nextLine();

        //length, includes spaces
        System.out.println(s1.length());

        //concatenation
        String s4=s1+ ": " + s2;

        //charAt
        System.out.println(s1.charAt(4));

        //equality
        if(s1.equals(s2))
        {
            System.out.println("equal strings");
        }
        else
        {
            System.out.println("Not equal");
        }

        //substring


    }
}
