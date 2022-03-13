package homework_week_6;

public class Calculator {
    public static void main(String[] args){
        addition( 10 , 20, 30);// calling static addition method
        subtraction( 20,10);//`calling static subtraction method
        Calculator calc = new Calculator();// creating object calc to call instance methods
        calc.multiplication(30 ,20 );// calling instance method multiplication by object calc
        calc.division(30 , 15); // calling insatnce method division into static by object calc
    }

    public static void addition(int a , int b, int c )// passing 3 parameters a, b, c
    {
        System.out.println("Addition : " +(a+b+c));//prinintg addition of 3 numbers
    }

    public static void subtraction ( int a, int b) // passing 2 parameters in subtraction method
    {
        System.out.println("Subtraction : "  +(a-b));
    }

    public void multiplication(int a, int b) // passing 2 parameters for multiplictaion instance method
    {
        System.out.println("Multiplication : " + (a*b));
    }
    public void division( int a , int b) // passing 2 parameters for division instance method
    {
        System.out.println("Division : " + (a/b));
    }
}
