public class sum {
    public static int sumOfNNaturalNum(int n)
    {
        if(n==1)
        {
            return 1;
        }
        return n+sumOfNNaturalNum(n-1);
    }    

    public static void main(String[] args) {
        int n=5;
        System.out.println(sumOfNNaturalNum(n));
    }
}
