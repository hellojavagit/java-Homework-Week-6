package homework_week_6;

import java.util.Scanner;
//calculating with area of circle with radius as input
public class AreaOfCircle {
    public static void main(String[] args) {
        int radius;
        float area , pi = 3.14f;
        Scanner sc = new Scanner(System.in);// using Scanner to accept the radius input
        System.out.println("Enter Radius of the Circle");
        radius = sc.nextInt();
        area = (pi * radius * radius);//calculating the area
        System.out.println("Area of Circle With Radius " + radius + " is : " + area );
    }
}
