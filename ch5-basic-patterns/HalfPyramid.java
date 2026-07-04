public class HalfPyramid {
    
    public void halfPyr(int lines)
    {
        for(int i=1; i<=lines; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        HalfPyramid obj=new HalfPyramid();
        obj.halfPyr(4);
    }
}
