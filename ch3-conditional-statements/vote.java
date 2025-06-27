import java.util.Scanner;

public class vote 
{ public static void main(String[] args) 
    {Scanner sc=new Scanner(System.in);
    System.out.println("Check if you're eligible to vote-");
    System.out.println("Enter your age-");
    int age=sc.nextInt();
    if (age>=18) 
    {System.out.println("Yay, you can vote now.");} 
    else 
    {System.out.println("Sorry, you cannot vote yet.");}
}
}
