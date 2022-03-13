package homework_week_6;

import java.util.Scanner;
//printing multiplictaion tables using for loop for any  number
public class MultiTableUsingForLoop {
    public static void main(String [] args){
        int i, j ,product;
        System.out.println("Enter a Number");
        Scanner sc = new Scanner (System.in);
        i = sc.nextInt();
        System.out.println("Enter a Number");
        for(j=1;j<=10;j++)
        {
            product = i * j ;
            System.out.println(i + " X " + j + " = " + product);
        }
    }
}
