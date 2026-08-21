public class inc {
    public static void incprint(int n)
    {
        //print increasing order numbers, 1 to n
        if(n==1)
        {System.out.println(n + " ");
            return;
        }
        incprint(n-1);
        System.out.println(n + " ");
    }

    public static void main(String[] args) {
        int n=5;
        incprint(n);
    }
}
