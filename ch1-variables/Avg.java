
import java.util.Scanner;

public class Avg 
{public static void avg(int a, int b, int c) 
    { double avg=((double)(a+b+c))/3;
      System.out.println("average of these numbers is " + avg);
    }
    
    public static void main(String[] args) 
    { Scanner sc=new Scanner(System.in);
        System.out.println("enter the numbers-");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        avg(a, b, c);
sc.close();
    
}
    
}
