package homework_week_6;

import java.util.Scanner;
//program to find the area of triangle
public class AreaOfTriangle {
    public static void main(String[] args) {
        int base, height , area;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter Base Of The Traingle");
        base = sc.nextInt();//assinging the input value to base variable
        System.out.println("Enter Height Of The Triangle");
        height = sc.nextInt();// accepting input and assigning it to height
        area = (base * height)/2;
        System.out.println("Area of the Triangle with Base " + base + " and Height " + height +" is : " + area);
    }

}
