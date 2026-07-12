
import java.util.*;

public class anagrams {
    public static void anagram(String str1, String str2)
    {
        if(str1.length()==str2.length())
        {
            str1=str1.toLowerCase();
            str2=str2.toLowerCase();

            char[] strArray1=str1.toCharArray();
            char[] strArray2=str2.toCharArray();

            Arrays.sort(strArray1);
            Arrays.sort(strArray2);

            boolean result=Arrays.equals(strArray1, strArray2);
            if(result==true)
            {
                System.out.println("Anagrams");
            }
            else{
                System.out.println("Not Anagrams");
            }
        }
        else{
            System.out.println("Not Anagrams");
        }
            
    }

    public static void main(String[] args) {
        String str1="race";
        String str2="care";

        anagram(str1, str2);
    }
    
}
