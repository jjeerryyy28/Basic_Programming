package twopointer;

import java.util.Scanner;

public class PairSum {
    static int isPairSum(int A[], int N, int X){
        int i=0;
        int j=N-1;
        while(i<j){
            if (A[i] + A[j] == X) 
                return 1; 
            else if (A[i] + A[j] < X) 
                i++; 
            else
                j--; 
        } 
    return 0; 
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        // int N = sc.nextInt();
        int A[]={2,3,5,8,9,10,11};
        int N = A.length;
        int X = sc.nextInt();
        // for(int i=0;i<N;i++){
        //     A[i]=sc.nextInt();
        // }
        sc.close();
        System.out.println(isPairSum(A, N, X));
    }
}
