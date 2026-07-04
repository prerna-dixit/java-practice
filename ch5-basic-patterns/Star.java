public class Star{

    public void starPattern(int lines)
    {
        for(int i=1; i<=lines; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    
    public static void main(String[]args)
    {
        Star obj=new Star();
        obj.starPattern(4);
    }
}
