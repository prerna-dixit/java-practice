public class optimizedExp {
    public static int optExp(int x, int n)
    {
        //if n==even then x^n=x^n/2*x^n/2
        //if n==odd then x^n=x*x^n/2*x^n/2

        if(n==0)
        {
            return 1;
        }
        int halfPower=optExp(x, n/2);
        int halfPowerSquare=halfPower*halfPower;
        
        if(n%2!=0)
        {
            halfPowerSquare=x*halfPowerSquare;
        }

        return halfPowerSquare;
    }

    public static void main(String[] args) {
        System.out.println(optExp(2, 5));
    }
    
}
