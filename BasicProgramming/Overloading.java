// import java.util.Scanner;

public class Overloading {
    static int Multiply(int a, int b){
        return a * b;
    }
    static double Multiply(double a, double b)
    {
        return a * b;
    }
     public static void main(String [] args) {
        System.out.println(Multiply(4, 6));
        System.out.println(Multiply(3, 3.33));
        
        // sc.close();
    }
     
    
}
