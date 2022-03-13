package homework_week_6;

import java.util.Scanner;
//program to convert given upeercase string into lowercase string
public class StringIntoLowercase {
    public static void main(String[] args)
    {
        String name1, name2;
        System.out.println("Enter an uppercase String");
        Scanner str = new Scanner(System.in); // accepts input into variable str
        name1 = str.nextLine();//accepts  string as an input
        name2 = name1.toLowerCase();//to convert uppercase string into lowercase string
        System.out.println("The String In UpperCase is : "  + name1);
        System.out.println("The String In LowerCase is : " + name2);
    }
}
