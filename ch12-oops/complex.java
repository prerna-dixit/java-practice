/*Print the sum, difference and product of two complex numbers by creating a class named 'Complex' with separate methods for each operation whose real and imaginary parts are entered by the user */
import java.util.*;
public class complex{
    int real;
    int img;

    complex(int real, int img){
        this.real=real;
        this.img=img;
    }

    public static void add(complex c1, complex c2)
    {
        int realpart=c1.real+c2.real;
        int imgpart=c1.img+c2.img;

        System.out.println("addition= (" + realpart + ", " + imgpart + "i )");
    }

    public static void sub(complex c1, complex c2)
    {
        int realpart=c1.real-c2.real;
        int imgpart=c1.img-c2.img;

        System.out.println("subtraction= (" + realpart + ", " + imgpart + "i )");
    }

    public static void mul(complex c1, complex c2)
    {
        int realpart = c1.real * c2.real - c1.img * c2.img;
        int imgpart = c1.real * c2.img + c1.img * c2.real;

        System.out.println("multiplication= (" + realpart + ", " + imgpart + "i )");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter real part of first num: ");
        int real1=sc.nextInt();
        System.out.println("enter imaginary part of first num: ");
        int img1=sc.nextInt();
        System.out.println("enter real part of second num: ");
        int real2=sc.nextInt();
        System.out.println("enter imaginary part of second num: ");
        int img2=sc.nextInt();
        complex c1=new complex(real1, img1);
        complex c2=new complex(real2, img2);

        add(c1, c2);
        sub(c1, c2);
        mul(c1, c2);


    }
}
