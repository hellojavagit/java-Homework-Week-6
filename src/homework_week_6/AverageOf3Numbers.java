package homework_week_6;

import java.util.Scanner;

public class AverageOf3Numbers {
    public static void main(String[] args) {
        int num1, num2, num3,  average; //declaring int variables
        System.out.println("Finding The Average Of 3 Numbers");//
        //Using Scanner method to accept the Input
        Scanner avg = new Scanner(System.in);
        System.out.println("Enter First Number " );
        num1 = avg.nextInt();// accepts input into num1
        System.out.println("Enter Second Number");
        num2 = avg.nextInt();// accepts input into num2
        System.out.println("Enter Third Number");
        num3 = avg.nextInt();// accepts input into num3
        average = ((num1) + (num2) + (num3))/3;// finding the average of 3 numbers
        System.out.println("Average of these 3 Numbers is " +average);//printing the average


    }
}
