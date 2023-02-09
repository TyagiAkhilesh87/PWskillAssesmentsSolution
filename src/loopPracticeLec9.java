import java.util.Scanner;

public class loopPracticeLec9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//         factorial program using for loop
        int inputNum = sc.nextInt();
        int fact = 1 ;
        for(int i = 1 ; i <= inputNum ; i++){
            fact = fact*i;
            System.out.println(fact);
        }

//        Hollow Rectangle

        int n = sc.nextInt();
        for(int i = 1 ; i <= n ; i++)
            {
                for (int j = 1 ; j <= n ; j++)
                    {
                        if( i == 1 || i == n || j == 1 || j==n  )
                            {
                                System.out.print("* ");
                            }
                        else {
                            System.out.print("  ");
                        }
                    }
                System.out.println();
            }//for loop outer End Here


//         Triangle Pattern using For Loop

        int len = sc.nextInt();
        for(int i  = 1 ; i <= len ; i++)
            {
                for(int j = 1 ; j <= i ; j++)
                    {
                        System.out.print("*");
                    }
                System.out.println();
            }

//         Inverted Triangle

        int len1 = sc.nextInt();
        for(int i  = 1 ; i <= len1 ; i++)
        {
            for(int j = len1 ; j >= i ; j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }

//        Pyramid
        int height = sc.nextInt();
        for(int i = 1 ; i <= height ; i++)//Rows
        {
            for(int sp = 1 ; sp <= height - i ; sp++) //Col Spaces
                {
                    System.out.print(" ");
                }
            for(int st = 1 ; st <= 2*i - 1 ; st++) // col Star
                {
                    System.out.print("*");
                }
            System.out.println();
        }

//          number triangle and its inverse triangle

        int dept = sc.nextInt();
        for(int i = 1 ; i <= dept ; i++){
            for( int j = i ; j <= dept ;j++  )
                {
                    System.out.print(j);
                }
            for(int k = 1 ; k <=i-1 ; k++)
                {
                    System.out.print(k);
                }
            System.out.println();
        }
    }
}
