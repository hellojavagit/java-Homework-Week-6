package homework_week_6;

import java.util.Scanner;

public class SwapTwoVariables {
    public static void main(String [] args){
        int num1,num2, num3;//Declaring variables
        //Using Scanner method to accept the input from keyboard
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to swap");
        num1 = sc.nextInt();// Accepts input to num1
        num2 = sc.nextInt();//Accepts input into num2
        //entered inputs as 20 and 30 into num1 and num2
        System.out.println("Numbers before Swapping are "  + num1 +" and " + num2);
        num3 = num2;//num 3 = 30
        num2 = num1;//num2 = 20
        num1= num3;//num1 = 30
        System.out.println("Numbers after Swapping  are " +num1+ " and "  +num2);

    }
}
