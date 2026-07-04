import java.util.Scanner;

public class stocks {
//this prgoram calculates the max profit one can achieve while buyimng n selling stocks
public static void stocks(int p[]) 
{
    int cp = Integer.MAX_VALUE; //cost price of the stock
    int maxProfit = 0; //current price at which u can sell
    for (int i = 0; i < p.length; i++) 
    { if(cp < p[i]) //profit   
      { int profit = p[i]-cp;
        maxProfit = Math.max(maxProfit, profit); //today's profit
      }
      else
      { cp = p[i];  } //we need to buy at the lowest price
       
    }
    System.out.println("Max Profit = " + maxProfit);
    
}

    public static void main(String[] args) 
    {   Scanner sc=new Scanner(System.in);   
           //prices array
        int prices[]={7,1,5,3,6,4};
        System.out.println("for the prices= 7,1,5,3,6,4");
        stocks(prices);
        System.out.println("enter the number of days that you wanna buy and sell the stocks for:");
        int n=sc.nextInt();
        System.out.println("enter the prices of the stocks:");
        int p[]=new int[n];
        for (int i = 0; i < n; i++) 
        { p[i]=sc.nextInt();   }
        System.out.println("for the prices you entered:");
        stocks(p);

    }
    
}
