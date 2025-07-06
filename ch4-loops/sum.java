
import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //sum of n natural numbers using while loop
        System.out.println("how many numbers-");
        int n=sc.nextInt();
        int i=1;
        int sum=0;
        while (i<=n) 
        { sum+=i;
        i++;}
        //using for loop
        int sum2=0;
        for (int j =1; j <=n; j++) 
        {sum2+=j;}
        System.out.println("sum of " + n + " natural numbers using while and for loops= " + sum + " and " + sum2);

    }
    
}
