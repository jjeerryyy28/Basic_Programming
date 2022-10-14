import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        int b[] = new int[m];
        for(int j=0;j<m;j++){
            b[j]=sc.nextInt();
        }
        int c[] = new int[a.length+b.length];

        int i=0; //a array
        int j=0; //b array
        int k=0; //c array

        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                c[k]=a[i];
                k++;
                i++;
            }
            else{
                c[k] = b[j];
                k++;
                j++;
            }
        }
        //leftover elements in array
        while(i<a.length){
            c[k]=a[i];
            k++;
            i++;
        }
        while(j<b.length){
            c[k]=b[j];
            k++;
            j++;
        }
        sc.close();
        System.out.println(Arrays.toString(c));
    }
}
