
import java.util.Scanner;

public class Area 
{
    public static void areacircle(float r) 
    { double pi=3.14;
      double area = pi*r*r;
      System.out.println("area of the circle is " + area);
    }

    public static void areasquare(float side) 
    { double area = side*side;
      System.out.println("area of square is " + area);
    }

    public static void arearec(float l, float b) 
    { double area = l*b;
      System.out.println("area of rectangle is " + area);
    }

    public static void main(String[] args) 
    {Scanner sc=new Scanner(System.in);
     System.out.println("enter radius of the circle");
     float r=sc.nextFloat();
     areacircle(r);
     System.out.println("enter side of the square");
     float side=sc.nextFloat();
     areasquare(side);
     System.out.println("enter l and b for rectangle");
     float l=sc.nextFloat();
     float b=sc.nextFloat();
     arearec(l, b);

     sc.close();
     
        
    }
    
}
