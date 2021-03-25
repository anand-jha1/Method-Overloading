/** Java program to demonstrate Method Overloading */
public class MethodOverloading {

    private   void addition(int a , int b){
        System.out.println("Sum is--" + (a+b));
    }
    private   void addition(int a, int b, int c){
        System.out.println("Sum is --" + (a+b+c));
    }
    private   void addition(int a, double b){
        System.out.println("Sum is --" + (a + b));
    }
    private   void addition(double a, double b){
        System.out.println("Sum is --" + (a + b));
    }
    /** Main method */
    public static void main(String[] args){
        MethodOverloading  m = new MethodOverloading();//Object Creation of class
        m.addition(10,20);
        m.addition(10,20,25);
        m.addition(10,20.5);
        m.addition(10.3,20.5);

    }
}
