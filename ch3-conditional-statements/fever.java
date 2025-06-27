import java.util.Scanner;

public class fever 
{ public static void main(String args[])
    { Scanner sc=new Scanner(System.in);
      System.out.println("Enter your body temperature in F-");
      float temp=sc.nextFloat();
      String fever=(temp>98.6)?"Oh no, you have fever. Take care.":"You're alright. Be that way ;)";
    }  
}
