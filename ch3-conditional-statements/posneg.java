import java.util.Scanner;

public class posneg 
{public static void main(String[] args) 
    {Scanner sc=new Scanner(System.in);
     System.out.println("Check if the number is positive or negative-");
     System.out.println("Enter any number-");
     int n=sc.nextInt();
     if (n>0) 
     {System.out.println("Number is positive");} 
     else if(n==0)
     {System.out.println("You've entered zero");}
     else 
     {System.out.println("Number is negative"); }
    }    
}
