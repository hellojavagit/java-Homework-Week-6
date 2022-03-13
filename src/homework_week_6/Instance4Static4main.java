package homework_week_6;

public class Instance4Static4main {
    int i = 10, j= 20; // declaring two instance variables i , j
    static String name1 = "HelloWorld";
    static String name2 = "GoodMorning";// declaring  two static variables x, y

    public static void main(String[] args)
    {
        static1();
        Instance4Static4main obj = new Instance4Static4main();
        obj.instance1();
    }
    public static void static1()//Declaring an static method static1()
    {
        // Calling static variables name1 and name2 by concatenating them
         System.out.println(name1+ " " +  name2);//HelloWorld GoodMorning

        //Calling instance variables i, j by creating an object ism into static1 method
         Instance4Static4main ism = new Instance4Static4main();
         System.out.println(ism.i);//10
         System.out.println(ism.j);//20
         System.out.println("End Of Static1 method");
         System.out.println();
    }
    public void instance1() // Declaring an instance method instance1()
    {
        // Calling instance variables i , j
         System.out.println(i);//10
         System.out.println(j);//20
        //Calling static variables name1 and name2  by Class name Instance4Static4main

         System.out.println(Instance4Static4main.name1);//HelloWorld//
         System.out.println(Instance4Static4main.name2);//GoodMorning
         System.out.println("End Of instance1 method");
         System.out.println();

    }
}
