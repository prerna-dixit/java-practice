public class dec {
  public static void decprint(int n)
  {
    //print numbers in decreasing order n to 1 using recursion
    //base case
    if(n==1)
    {
        System.out.println(n);
        return;
    }
    System.out.println(n + " ");
    decprint(n-1);
  }  

  public static void main(String[] args) {
      int n=5;
      decprint(n);
  }
}
