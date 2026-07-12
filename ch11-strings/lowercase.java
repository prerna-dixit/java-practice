import java.util.Scanner;

public class lowercase {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string: ");
        String str=new String();
        str=sc.nextLine();

        int count=0;
        for (int i = 0; i <str.length(); i++) 
        {
                if(str.charAt(i)>='a' && str.charAt(i)<='z')
                {
                    count++;
                }
            

        }
        System.out.println(count);
    }
    
}
