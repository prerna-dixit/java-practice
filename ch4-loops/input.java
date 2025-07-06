
import java.util.Scanner;

public class input 
{ public static void main(String[] args) {
    //takes input until user enters a multiple of 10
    Scanner sc=new Scanner(System.in);
   do { 
     int n=sc.nextInt();
    if (n%10==0) 
    { 
        break;       
    }
       
   } while (true);
}
    
}
