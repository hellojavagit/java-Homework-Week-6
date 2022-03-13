package homework_week_6;

import java.util.Scanner;
//adding two binary numbers
public class AddTwoBinaryNumbers {
    public static void main(String[] args)
    {
        String bNum1 , bNum2; // Declaring two binary numbers a Strings
        System.out.println("Enter First Binary Number: ");
        Scanner tbn = new Scanner(System.in); //Using Scanner method to accept the input
        bNum1 = tbn.nextLine(); // Accepting first binary number
        System.out.println("Enter Second Binary Number: ");
        bNum2 = tbn.nextLine();  // Accepting second binary number

        int bin1 = Integer.parseInt(bNum1,2); // using Integer.parseInt(String, radix) default method
        int bin2 = Integer.parseInt(bNum2,2);

        int result = bin1 + bin2; // assining sum of two binary numbers into result variable
        System.out.println(" The Sum Of Two Binary Numbers Is : " + Integer.toBinaryString(result));
    }
}
