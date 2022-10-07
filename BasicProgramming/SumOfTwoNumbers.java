import java.util.Scanner;

class SumOfTwoNumbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int sum = n1+n2;

        System.out.println("Sum of two numbers are: " +sum);

        sc.close();
    }
}