
import java.util.Scanner;

public class GstCalculator 
{ public static void GstCalculator(float a, float b, float c) 
    { float total=a+b+c;
      double gst=total*0.18;
      double cost=total+gst;
      System.out.println("total bill with gst- " + cost);
    }

    public static void main(String[] args) 
    { Scanner sc=new Scanner(System.in);
      System.out.println("enter the price of three items-");
      float a=sc.nextFloat();
      float b=sc.nextFloat();
      float c=sc.nextFloat();
      float total=a+b+c;
      System.out.println("the total bill without tax- " + total);
      GstCalculator(a, b, c);
        
    }
}
