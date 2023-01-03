package Sorting;

public class mergeSort {
    void merge(int arr[], int left, int mid, int right){
        int len1 = mid-left+1;
        int len2 = right - mid;
        int leftarr[] = new int[len1];
        int rightarr[] = new int[len2];

        for(int i=0;i<len1;i++)
            leftarr[i] = arr[left+i];

        for(int j=0;j<len2;j++)
            rightarr[j] = arr[mid+1+j];

        int i,j,k;
        i=0;
        j=0;
        k=left;

        while(i<len1 && j<len2){
            if(leftarr[i]<=rightarr[j]) {
                arr[k] = leftarr[i];
                i++;
            }
            else{
                arr[k]=rightarr[j];
                j++;
            }
            k++;
        }
        while(i<len1){
            arr[k]=leftarr[i];
            i++;
            k++;
        }
        while (j<len2){
            arr[k]=rightarr[j];
            j++;
            k++;
        }
    }

    void MergeSort(int arr[], int left, int right){
        if(left<right){
            int mid = (left+right)/2;
            MergeSort(arr, left, mid);
            MergeSort(arr, mid+1, right);

            merge(arr, left, mid, right);
        }
    }
    static void display(int arr[]){
        int n = arr.length;
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {2,3,22,11,1,10,8};
        mergeSort obj = new mergeSort();
        System.out.println("Original array");
        display(arr);

        obj.MergeSort(arr,0, arr.length-1);

        System.out.println("Sorted Array");
        display(arr);
    }
}
