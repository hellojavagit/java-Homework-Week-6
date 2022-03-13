package homework_week_6;

import java.util.Scanner;
//program to perform operations on numbers taken as input using Scanner method
public class OperationsOnTwoNumbers {
    public static void main(String[] args){
        int i , j ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        i = sc.nextInt();//accepting first number into variable i
        System.out.println("Enter Second Number : ");
        j = sc.nextInt();//accepting value into variable j
        System.out.println( i + " + " + j + " = " +  (i+j));
        System.out.println( i + " - " + j + " = " +   (i-j));
        System.out.println( i + " X " + j + " = " +   (i*j));
        System.out.println( i + " / " + j + " = " +   (i/j));
        System.out.println( i + " mod " + j + " = " +   (i%j));
    }
}
