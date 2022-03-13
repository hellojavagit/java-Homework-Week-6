package homework_week_6;

public class InstanceToMain {
    int i=10,j=20 ,product ;//Instance variables
    public static void main(String [] args)
    {
        InstanceToMain obj = new InstanceToMain();
        // System.out.println(obj.i);// to print
        // System.out.println(obj.j);
        obj.productNumbers();
    }
    public void productNumbers(){
        System.out.println(i);//calling instance variable i into instance method//10
        System.out.println(j);// calling instance variable j into instance method//20
        product = i * j;
        System.out.println("product of these 2 numbers is ");
        System.out.println(product);
    }
}
