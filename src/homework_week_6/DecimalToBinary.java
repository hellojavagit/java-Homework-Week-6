package homework_week_6;
import java.util.Scanner;
//program to convert deciaml number to binary number
public class DecimalToBinary
{
    public static void main(String[] args) {
        int number;
        System.out.println("Enter a decimal number: ");
        Scanner dec = new Scanner(System.in);// Using Scanner to accept the input decimal number
        number = dec.nextInt();
        // Converting decimal number to binary by usin inbuilt Integer.toBinaryString method
        System.out.println("Decimal Number " + number + " In Binary Format is : " + Integer.toBinaryString(number));
    }
}
