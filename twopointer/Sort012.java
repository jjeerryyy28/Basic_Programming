package twopointer;

import java.util.Scanner;

public class Sort012 {
    static void sort(int[] arr, int n){
        int i=0;
        int mid=0;
        int j = n-1;
        while(mid<=j){
            if(arr[mid]==0){
                int temp=arr[mid];
                arr[mid]=arr[i];
                arr[i]=temp;
                i=i+1;
                mid=mid+1;
            }
            else if(arr[mid]==1){
                mid=mid+1;
            }
            else{
                int temp=arr[mid];
                arr[mid]=arr[j];
                arr[j]=temp;
                j=j-1;
            }
        }
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sort(arr, n);
        System.out.println("Sorting 0, 1, and 2: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        sc.close();
    }
}
