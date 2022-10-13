package twopointer;

import java.util.Scanner;

public class MoveNegativeNumToFirst {
    static void shiftNum(int []arr, int i, int j){
        while(i<j){
            if(arr[i]<0 && arr[j]<0)
                i++;
            else if(arr[i]>0 && arr[j]<0){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
            else{
                i++;
                j--;
            }
        }
    }
    static void display(int arr[], int j){
        for(int i=0;i<=j;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        shiftNum(arr, 0, n-1);
        display(arr, n-1);
        sc.close();
        
    }
}
