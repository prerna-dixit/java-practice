import java.util.Scanner;

public class arrayupdate {

        //updating the marks by 1
    public static void update(int marks[]) 
    {for (int i = 0; i <marks.length; i++) 
    {marks[i]=marks[i]+1;}
    System.out.println("updated marks-");
    System.out.println("chem= " + marks[0]);
    System.out.println("apc= " + marks[1]);
    System.out.println("civil= " + marks[2]);
    System.out.println("graphics= " + marks[3]);}

    public static void main(String[] args) 
    {Scanner sc=new Scanner(System.in);
    int marks[]=new int[4];
    System.out.println("enter marks of following subjects- chemistry, adv progg with c, civil engg, engg graphics");
    for (int i = 0; i <4; i++) 
    {marks[i]=sc.nextInt();}
    System.out.println("we're updating marks of all the subjects by 1");
    update(marks);}
    
}
