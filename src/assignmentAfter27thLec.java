import java.util.Scanner;

public class assignmentAfter27thLec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Question 1 - Write a program to add 8 to the number x and then divide it by 3. Now, the modulus of the quotient
        //is taken with 5 and then multiply the resultant value by 5. Display the final result. x= 2345 O/P=20
//        System.out.println("Enter Number");
//        int x = sc.nextInt();
//        System.out.println((((x+8)/3)%5)*5);

        //Question 2 Swap Two Number Without Third Var
//        int x = sc.nextInt();
//        int y = sc.nextInt();
//        System.out.println("Before Swap X : "+x+" And Y : "+y);
//        x+=y;
//        y=x-y;
//        x=x-y;
//        System.out.println("After Swapping X : "+x+" And Y : "+y);

        // Question 3 Write a program to calculate the sum of the digits of a 3-digit number.
        // ip :132 THen OP : 6
//        int x = sc.nextInt();
//        int sum = 0;
//        while(x>0)
//            {
//                sum = sum+x%10;
//                x = x/10;
//                System.out.println(sum);
//            }

        //Question 4 Assign values of variables 'a' and 'b' as 55 and 70 respectively and then check if:
        //i) both the conditions 'a < 50' and 'a < b' are true.
        //ii) at least one of the conditions 'a < 50' or 'a < b' is true.

//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        if(a<50 && a<b){
//            System.out.println("AND Block hai (i) : True");
//        }
//        else if(a<50 || a<b){
//            System.out.println("OR Block hai (ii) : True");
//        }
//        else{
//            System.out.println("Both Condition Are Not Valid ");
//        }

        //Question 5 Find the total number of bits needed to be flipped to convert x to y.

        int x = sc.nextInt();
        int y = sc.nextInt();
        int counter = 0;
        int bitXor = x ^ y;
        while(bitXor != 0)
                    {
                        bitXor = bitXor & (bitXor - 1 );
                        counter++;
                        System.out.println(Integer.toBinaryString(bitXor));
                    }
        System.out.println(counter);
    }
}
