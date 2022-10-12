package recursion;

import java.util.Scanner;

public class PrintEven {
    static void printEven(int x){
        if(x>100){
            return;
        }
        if(x%2==0){
            System.out.print(x+" ");
        }
        printEven(++x);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.print("Value starts from ");
        int n = sc.nextInt();
        printEven(n);
        sc.close();
    }
}
