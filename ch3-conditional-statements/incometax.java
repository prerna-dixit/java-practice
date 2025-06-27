import java.util.*;

public class incometax {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        {System.out.println("Enter your income");
        float income=sc.nextFloat();
        if (income<500000) 
        {float tax=0;
            System.out.println("tax = " + tax);    
        } 
        else if(income>500000 && income<1000000)
        {float tax=income*0.2f;
        System.out.println("tax = " + tax);
        }
        else
        {float tax=income*0.3f;
            System.out.println("tax = " + tax);}
        }}}
