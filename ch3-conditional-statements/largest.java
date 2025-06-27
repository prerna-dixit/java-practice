import java.util.Scanner;

public class largest 
{public static void main(String[] args) 
    {Scanner sc=new Scanner(System.in);
    System.out.println("Let's find out which number is larger-");
    System.out.println("Enter two numbers");
    int a=sc.nextInt();
    int b=sc.nextInt();
    if (a>b) 
    {System.out.println(a + " is larger than " + b);} 
    else 
    {System.out.println(b + " is larger than " + a);}
    }   
}
