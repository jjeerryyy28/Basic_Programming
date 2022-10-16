package greatLearningJava;

import java.util.Scanner;

public class IOOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        float num2 = sc.nextFloat();
        double num3 = sc.nextDouble();
        boolean bool = sc.nextBoolean();
        char c = sc.next().charAt(0);

        System.out.println("Integer -> "+num);
        System.out.println("Float -> "+num2);
        System.out.println("Double -> "+num3);
        System.out.println("Boolean -> "+bool);
        System.out.println("Character -> "+c);
        sc.close();
    }
}
