import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-->0){
            if(n%2==0){
                System.out.println("Number is even");
            }
            else{
                System.out.println("Number is Odd");
            }
        }
        sc.close();
    }
    
}