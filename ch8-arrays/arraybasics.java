import java.util.Scanner;

public class arraybasics {

    //creating array, declaration, initialisation, updating elements, size of an array

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
              //creating an array
        int marks[]=new int[50];                                                          // ARRAY DECLARATION 
        int num[]={4,2,42,24,44};                                                         //INITIALISATION                                                
         //without declaring size, java detects it as 5 
          
        //taking input in an array
        System.out.println("enter marks of subjects out of 60-");
        marks[0]=sc.nextInt(); //chem
        marks[1]=sc.nextInt(); //apc
        marks[2]=sc.nextInt(); //civil
        marks[3]=sc.nextInt(); //graphics

    System.out.println("chem= " + marks[0]);
    System.out.println("apc= " + marks[1]);
    System.out.println("civil= " + marks[2]);
    System.out.println("graphics= " + marks[3]);

       //updating elements
       marks[0]=marks[0]/2; //can also multiply
       marks[1]=56;
       marks[2]=marks[2]+2;
       marks[3]=marks[3]-5; 
    System.out.println("updated marks-");
    System.out.println("chem= " + marks[0]);
    System.out.println("apc= " + marks[1]);
    System.out.println("civil= " + marks[2]);
    System.out.println("graphics= " + marks[3]);

        int avg=(marks[0]+marks[1]+marks[2]+marks[3])/4;
    System.out.println(avg);
    System.out.println("length of the array is " + marks.length);           //size of an array
    }
}
