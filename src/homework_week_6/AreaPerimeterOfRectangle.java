package homework_week_6;

import java.util.Scanner;

public class AreaPerimeterOfRectangle {
    public static void main(String [] args){
        float width , height , area , perimeter;// declaring float variables
        System.out.println("Enter the width of the Rectangle");
        Scanner sc = new Scanner(System.in);// using scanner to accept input
        width = sc.nextFloat();// nextFloat() to accept the floating input value
        System.out.println("Enter the Height of the Rectangle");
        height = sc.nextFloat();
        area = width * height;// calculating the area with width and height knwon
        perimeter = 2 * ( width + height);// calculating the perimter of rectangle
        // printing the output in user desired formats
        System.out.println(" Area of Rectangle with Width " + width + " and Height " +height+ " = " + +area);
        System.out.println(" Perimeter of Rectangle is  2*("+ width + " + " +height  + ") = " +perimeter);
    }
}
