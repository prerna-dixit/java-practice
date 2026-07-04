
import java.util.Scanner;

public class reverse 
{ public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter any num");
    int n=sc.nextInt();
    int rev=0;
    while (n>0) 
    { int last=n%10;
      rev=(rev*10)+last;
      n/=10;        
    }
    System.out.println("reversed num= " + rev);
}
    
}
