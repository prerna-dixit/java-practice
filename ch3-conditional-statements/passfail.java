import java.util.Scanner;

public class passfail 
{public static void main(String[] args) 
    {Scanner sc=new Scanner(System.in);
     System.out.println("Check if you passed or failed your test-");
     System.out.println("Enter your marks-");
     float marks=sc.nextFloat();
     if (marks>=33.3) 
     {System.out.println("YAY, you've passed your test.");} 
     else 
     {System.out.println("Oops, seems like you've failed the test. Good luck next time.");}   
}   
}
