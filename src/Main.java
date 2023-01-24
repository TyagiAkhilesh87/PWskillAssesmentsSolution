import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        //Question No  1

        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("Product of X and Y = "+(x*y));

        //Question No  2


        char given ='U';
        int given_int_conversion = given;
        System.out.println("Character ASCII Value of U  = "+given_int_conversion);

        //Question no 3

        System.out.println("Rectangle Area = "+(x*y));
        //Question 4
        double cube = Math.pow(x,3);
        System.out.println("Cube of First_Given Number  X =  "+cube);

        // Question 5
        System.out.println("Before Swapping X = "+x+"And Y = "+y);
         int thirdvar = x;
         x=y;
         y=thirdvar;
        System.out.println("After Swapping X = "+x+"And Y = "+y);
    }
}