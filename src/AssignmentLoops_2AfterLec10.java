import java.util.Enumeration;
import java.util.Scanner;

public class AssignmentLoops_2AfterLec10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //fibonacci series
         int nthTerm = sc.nextInt();
         int f2 = 1 ;
         int f1 = 1;
         for(int i = 1 ; i <= nthTerm ; i++){
             int counter = f1+f2;
             f2 = f1 ;
             f1 = counter;
             System.out.println(""+f2);
         }

        // // negative or zero. Calculate the sum of numbers until a negative number is encountered.
        // // If the input is a negative number, current sum is discarded and print -1.
        int sumCounter = 0 ;
        while(sc.hasNextInt()){
            int number = sc.nextInt();
                if(number<0){
                    sumCounter =  -1 ;
                    System.out.println(sumCounter);
                    break;
                }
                else {
                    sumCounter = sumCounter+number;
                }
        }

//          factorial program using for loop
                int inputNum = sc.nextInt();
                int fact = 1 ;
                for(int i = 1 ; i <= inputNum ; i++){
                    fact = fact*i;
                    System.out.println(fact);
                }

        //ArmStrong Number

        int n = sc.nextInt();
        int num = 1;
        while (num <= n) {
            int count = 0;
            int i = num;
            while (i > 0) {
                count++;
                i /= 10;
            }
            int val = num;
            int sum = 0;
            while (val > 0) {
                int digit = val % 10;
                sum += Math.pow(digit, count);
                val /= 10;
                if (sum > val){
                    continue;
                }
            }
            if (sum == num) {
                System.out.println(num);
            }
            num++;
        }

        //Question no 5 X Pattern
        int depth  = sc.nextInt();
        for (int i = 0 ; i < depth ; i++)
        {
            for(int j = 0 ; j < depth ; j++)
            {
                if( i==j || (i+j)==depth-1)
                    {
                        System.out.print("*");
                    }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


//         Question no 7 Alphabet Pyramid

        int dep = 5;
        int alph = 65;
        int alpinterator = 0;
        for(int i = 1 ; i <=  dep ; i++)
        {
            for (int space = 1 ; space <= dep-i ; space++)
                {
                    System.out.print(" ");
                }
            for(int alp = 1 ;alp <= i*2-1 ; alp++ )
                {
                    System.out.print((char)(alph+alpinterator++));
                }
            System.out.println();
        }
        alpinterator = 0 ;
        for (int i = 1; i <= dep - 1; i++) {
            for (int j = 0; j < i; j++) { //bottom half
                System.out.print(" ");
            }
            for (int k = (dep - i) * 2 - 1; k > 0; k--) {
                System.out.print((char)(alph+alpinterator++));
            }
            System.out.println();
        }
    }
}