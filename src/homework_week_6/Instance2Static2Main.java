package homework_week_6;

public class Instance2Static2Main {
    int i = 10;      //declaring instance variable i
    static String name = "Hello World"; // declaring static string variable name
    public static void main (String[] args)
    {
        static1();
        Instance2Static2Main obj = new Instance2Static2Main() ;//creating an object obj
        obj.instance1();// calling instance1 method with object obj
    }
    public void instance1()

   { // calling insatnce variable to instance method
       System.out.println("Value of i in instance1 method  is: " +i);
   }
   public  static void static1()

   {
       // calling static variable to static method
       System.out.println("static variable string name is : " +name);
   }



}
