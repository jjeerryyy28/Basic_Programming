package recursion;

import java.util.Scanner;

public class PrintEvenBackTracking {
    static void printEven(int x){
        if(x<0){
            return;
        }
        if(x%2==0){
            System.out.print(x+" ");
        }
        printEven(--x);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Value starts from ");
        int n = sc.nextInt();
        printEven(n);
        sc.close();
    }
}
