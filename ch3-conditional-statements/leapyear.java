
import java.util.Scanner;

public class leapyear 
{public static void main(String[] args) 
    {Scanner sc=new Scanner(System.in);
     System.out.println("Check if the year is leap year or no");
     int year=sc.nextInt();
     if (year%4==0) 
     {if (year%100==0) 
        {if (year%400==0) 
            {System.out.println("Its a leap year, woohoo.");} 
        else 
            {System.out.println("Woopsie, not a leap year.");}
        } 
        else 
        {System.out.println("Yay, you got yourself a leap year.");}
        } 
        else 
        {System.out.println("Urgh, not a leap year.");
     }

    
}
    
}
