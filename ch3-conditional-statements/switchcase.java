
import java.util.Scanner;

public class switchcase 
{public static void main(String[] args) 
    {Scanner sc=new Scanner(System.in);
     System.out.println("Demonstration of switch case. \n Enter value 1-3");
                 int value=sc.nextInt();
           switch (value) {
               case 1:
                    {System.out.println("u entered 1");}
                    break;
                case 2:
                    {System.out.println("u entered 2");}
                       break;
                   case 3:
                    {System.out.println("u entered 3");}
                    break;
                default:
                    {System.out.println("not valid");}
}}    
}
