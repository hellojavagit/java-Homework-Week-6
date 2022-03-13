package homework_week_6;

//importing util.scanner
import java.util.Scanner;
//program to convert temperatures

public class TemperatureConverter {
    public static void main(String[] args)
    {
        float tempF, celsius;// declaring 2 float type variables tempF and celsius
        System.out.println(" Enter Temperature in Fahrenheit");
        Scanner sc = new Scanner(System.in);// accepting input through the keyboard
        tempF = sc.nextFloat();
        celsius = ( ( tempF - 32) * 5 / 9);// using formula converting fahrenheit to celsius temperature
        System.out.println(" Tempertaure in Celsius is : " + celsius);// printing the result
    }
}
