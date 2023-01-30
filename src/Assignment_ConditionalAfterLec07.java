import java.util.Scanner;

public class Assignment_ConditionalAfterLec07 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //Question 1 - Write a program which takes the values of length and breadth from user and check if it is
        //a square or not.
        System.out.println("EnterSides To check its Rectangle or Square");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a==b)
            {
                System.out.println("It is Square ");
            }
        else
            {
                System.out.println("Its Rectangle");
            }

//        Question 2 - Write a program to print absolute value of a number entered by the user.
        int num = sc.nextInt();
        if(num<0){
            num*=-1;
        }
        System.out.println("The Absolute Value Is :- "+num);


        //Question 3 Write a program to take input from user for Cost Price (C.P.) and Selling Price(S.P.) and
        //calculate Profit or Loss.

        System.out.println("Enter to Calculate Profit And Loss: ");
        System.out.println("EnterCostPrice");
        int costPrice = sc.nextInt();
        System.out.println("Enter Selling Price");
        int sellingPrice = sc.nextInt();
        if(costPrice>sellingPrice)
            {
                int loss = costPrice-sellingPrice;
                System.out.println("Loss : "+loss);
            } else if (costPrice<sellingPrice) {
            int profit=sellingPrice-costPrice;
            System.out.println("Profit: "+profit);
             }
        else
            {
                System.out.println("No Profit OR Loss");
            }


        //Question 4 Write a program to print positive number entered by the user, if user enters a negative
        //number, it is skipped

        System.out.println("Question4 if user enters a negative number , it is skipped : ");
        System.out.println("Enter Number ");
        int number = sc.nextInt();
        if(number<0)
            {
                System.out.println("Number is Negative And Skipped : ");
            }
        else
            {
                System.out.println("Number is Positive ");
            }


        //Question 5 using switch Statement performe add,Sub,Multiple,divide
        System.out.println("Performing Add,Sub,Mul,Div using Switch ");
        System.out.println("Enter Two Number A and B :");
        int A = sc.nextInt();
        int B = sc.nextInt();
        char action = sc.next().charAt(0);
        switch (action)
            {
                case '+':
                    System.out.println("Addition is :- "+(A+B));
                    break;
                case '-':
                    System.out.println("Subtraction is :- "+(A-B));
                    break;
                case '*':
                    System.out.println("Multiplication is :- "+(A*B));
                    break;
                case '/':
                    System.out.println("Division is :- "+(A/B));
                    break;
                default:
                    System.out.println("Invalid Input of Operation Perform");
                    break;
            }


        //Question 6 Write a program to calculate marks to grades . Follow the conversion rule as given below :
        System.out.println("Giving Percentage According to A,B,C,D,E,F");
        System.out.println("Enter Marks :-  ");
        int marks;
        System.out.print("Enter the marks : ");
        marks=sc.nextInt();
        if(marks>=90)
        {
            System.out.print("Your Grade is A+");
        }else if(marks>=80)
        {
            System.out.print("Your Grade is A");
        }else if(marks>=70)
        {
            System.out.print("Your Grade is B+");
        }else if(marks>=60)
        {
            System.out.print("Your Grade is B");
        }else if(marks>=50)
        {
            System.out.print("Your Grade is C");
        }else if(marks>=40)
        {
            System.out.print("Your Grade is D");
        }else if(marks>=30)
        {
            System.out.print("Your Grade is E");
        }else if(marks<30){
            System.out.print("Your Grade is f");
        }else{
            System.out.print("Enter valid marks");
        }
    }
}
