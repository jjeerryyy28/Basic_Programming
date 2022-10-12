package recursion;

import java.util.Scanner;
//Pre-Increment
public class RecursionDemo {
    static void Print(int x){
        if(x>21){
            return;
        }
        System.out.print(x+" ");
        // Print(x--);
        Print(++x);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Value of x is ");
        int x=sc.nextInt();
        
        Print(x);
        sc.close();
    }
}
