package Sorting;

import recursion.Array;

import java.util.Arrays;
import java.util.Scanner;

public class RadixSort {
//    static Scanner sc = new Scanner(System.in);
//    static void radixSort(int arr[], int size){
//        int m = getMaxElements(arr, size);
//
//        for(int exp=1;m/exp>0;exp++){
//            countSort(arr,size,exp);
//        }
//    }
//
//    static int getMaxElements(int arr[], int size){
//        int max=arr[0];
//        for(int i=0;i<size;i++)
//            if(arr[i]>max)
//                max=arr[i];
//
//        return max;
//    }
//
//    static void countSort(int arr[], int size, int exp){
//        int output[]=new int[size];
//        int i;
//        int count[]=new int[10];
//        Arrays.fill(count, 0);
//
//        for(i=0;i<size;i++){
//            count[(arr[i]/exp)%10]++;
//        }
//
//        for( i=0;i<10;i++){
//            count[i]+=count[i-1];
//        }
//
//        for(i=size-1;i>=0;i--){
//            output[count[(arr[i]/exp)%10]-1]=arr[i];
//            count[(arr[i]/exp)%10]--;
//        }
//
//        for(i=0;i<size;i++){
//            arr[i]=output[i];
//        }
//    }
//
//    static void printArray(int arr[], int size){
//        for(int i=0;i<size;i++){
//            System.out.println("Values at position "+i+"is: "+arr[i]);
//        }
//    }
//
//    public static void insertValues(int arr[], int n){
//        System.out.println("Enter the values: ");
//        for(int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//        }
//    }
//    public static void main(String[] args) {
//
//        int n = sc.nextInt();
//        int arr[]=new int[n];
//        insertValues(arr, n);
//        System.out.println("Before Sorting: ");
//        printArray(arr, n);
//        System.out.println();
//        System.out.println("After Sorting: ");
//        radixSort(arr, n);
//        System.out.println();
//        printArray(arr, n);
//    }
//}

    public int max, i, remainder, count, temp, modinput, NUM_ELEMENTS, startpoint;
    public int[] array;
    Scanner sc = new Scanner(System.in);

    public void implementationOfRadixSort() {
        System.out.println("Enter the number of elements you want to sort: ");
        NUM_ELEMENTS = sc.nextInt();
        array = new int[NUM_ELEMENTS];
        System.out.println("Enter positive integers only.");
        insertValues();
        printValues();
        findMaxValue();
        remainder = max;
        while (remainder != 0) {
            remainder = remainder / 10;
            count++;
        }
        System.out.println("digits in max is " + count);
        sortValues();
        System.out.println("\nThe Sorted array is: \n");
        printValues();
    }

    public void insertValues() {
        for (i = 0; i < array.length; i++) {
            System.out.print("Enter element at position " + i + ": ");
            array[i] = sc.nextInt();
        }
    }

    public void printValues() {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Value at position " + i + "is:" + array[i]);
        }
        System.out.println();
        System.out.println("Sorted Array using Radix Sort: ");
        System.out.println(Arrays.toString(array));
    }

    public void findMaxValue() {
        i = 0;
        do {
            if (max < array[i]) {
                max = array[i];
            }
            i++;
        } while (i < array.length);
        System.out.println("max value is: " + max);
    }

    public void sortValues() {
        for (i = 1; i <= count; i++) {
            System.out.println("\nIteration " + i + "\n");
            for (int j = 0; j < 10; j++) { //
                // digit searchvalue is j
                System.out.println("\nSearching at position "+ i + " from right for digit " + j + "\n");
                for (int k = startpoint; k < array.length; k++){
                    // checking each digit for the digit search value
                    remainder = array[k];
                    System.out.println("value is: " + remainder);
                    int q = i;
                    /** q is number of times to perform division operation before applying mod. we do* this only to find the second, third,.... placevalueof a number. we then* apply modulus operation for the remainder.*/
                while (q > 1) {
                    remainder = remainder / 10;
                    q--;
                }
                modinput = remainder;
                if (modinput % 10 == j) {
                    System.out.println("digit at position " + i + "from right for value " + array[k] + " is: " + modinput % 10);
                    System.out.println("Start point is: " + startpoint);
                    temp = array[k];
                    for (int p = k; p > startpoint; p--) {
                        // shiftingvalues to right
                        array[p] = array[p - 1];
                    }
                    array[startpoint] = temp;
                    startpoint += 1;printValues();
                }
                else
                    System.out.println("digit at position " + i+ "from right for value " + array[k] + " is: "+ modinput % 10);
                }
            }
            startpoint = 0;
        }
    }

    public static void main(String[] args) {
        RadixSort radixsort = new RadixSort();
        radixsort.implementationOfRadixSort();
    }
}