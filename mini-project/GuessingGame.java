import java.util.*;

public class GuessingGame {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        int num=0;

        int n=(int)(Math.random()*100)+1;

        while(num!=n)
        {
        System.out.println("Enter -1 to exit the game");
        System.out.println("Guess the random number between 1-100:");
        num=sc.nextInt();

        if (num==-1) 
        {
            System.out.println("Guessing Game Over!");
            break;
        }
            
        else if(num<n)
        {
            System.out.println("Guess a larger number");
        }
        else if(num>n)
        {
            System.out.println("Guess a smaller number");
        }
        else if(num==n)
        {
            System.out.println("Yay! You guessed the number correctly! Its: " + n);
        }
        else 
        {
            System.out.println("Try Again. You can do it!");
        }
    }
    }
    
}
