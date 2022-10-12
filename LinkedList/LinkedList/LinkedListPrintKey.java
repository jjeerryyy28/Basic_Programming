package LinkedList;

/* import java.util.Arrays; */ 
import java.util.Scanner;

class LinkedListPrintKey{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k = sc.nextInt();
        //Arrays.sort(arr);
        for(int i=0;i<n;i++){
            if(arr[i]==k){
                System.out.println("Output: "+i);
            }
            else{
                System.out.println("-1");
            }
        }
        sc.close();
    }
}