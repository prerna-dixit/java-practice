
import java.util.Scanner;
public class SumProd 
{public static void sum(int a, int b) 
    {int sum=a+b;
        System.out.println("sum of " + a + " and " + b + " is " + sum );
    }
 public static void prod(int a, int b) 
    {int prod=a*b;
        System.out.println("product of " + a + " and " + b + " is " + prod);
    }
    public static void main(String[] args) 
    { Scanner sc=new Scanner(System.in);
    System.out.println("Enter two numbers-");
    int a=sc.nextInt();
    int b=sc.nextInt();
    sum(a, b);
    prod(a, b);
    sc.close();
    }
    
}
