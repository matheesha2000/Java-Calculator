import java.util.Scanner;

public class Calculator 
{
    public static void main(String[] args) 
    {
        double num1,num2,result=0;
        
        //create an object of scanner class
        Scanner input = new Scanner(System.in);
        
        System.out.println("Basic Calculator");

        //ask users to enter numbers
        System.out.println("Enter two numbers");

        //enter 1st number
        System.out.print("Number 1: ");
        num1 = input.nextDouble();

        //enter 2nd number
        System.out.print("Number 2: ");
        num2 = input.nextDouble();
        
        //getting operator
        System.err.println("Select operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exit");

        System.out.print("Enter choice (1-4): ");
        int choice = input.nextInt();

        if (choice == 5)
            {
                System.out.println("exiting the calculator, Good byee!");
                
            }

        switch (choice) {
            case 1:result = num1 + num2;
            break;

            case 2:result = num1 - num2;
            break;

            case 3:result = num1 * num2;
            break;

            case 4:
            if(num2 != 0){
                result = num1 / num2;
            }else{
                System.out.println("Error: Division by zero.");
                return;
            }
            break;
            default:
            System.out.println("Invalid choice.");
            return;

        }

        System.out.println("Result:" +result);


    }
    
}