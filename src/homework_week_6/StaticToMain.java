package homework_week_6;

public class StaticToMain {
    static int i = 10, j=20;// decllaring 2 static variables i,j

    public static void main(String[] args)
    {
        addition();//calling static method into main method
    }
    public static void addition()//declaring a static method addition()
    {
        System.out.println(i);//calling static variable into static addiiton method
        System.out.println(j);//calling static variable j into static addiiton method
        System.out.println("Addition of these two numbers is: " +(i+j));
    }
}
