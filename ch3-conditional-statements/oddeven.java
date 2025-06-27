
import java.util.Scanner;

public class oddeven 
{public static void main(String[] args) 
    {Scanner sc=new Scanner(System.in);
        System.out.println("Check if the number is even or odd-");
        System.out.println("Enter any number-");
        int num=sc.nextInt();
        if (num%2==0) 
        {System.out.println("The number is even.");} 
        else 
        {System.out.println("The number is odd.");}
    }   
}
