package twopointer;

public class ContainerWithMostWater {
    static int maxArea(int a[]){
        int n = a.length;
        int i=0;
        int j=n-1;
        int max=-1;
        while(i<j){
            int min = Math.min(a[i], a[j]);
            int val = min*(j-i);
            if(val>max)
                max=val;
            if(a[i]<a[j])
                i++;
            else
                j--;
        }
        return max;
    }
    public static void main(String[] args) {
        int a[] = {2,3,4,5,6};
        System.out.println(maxArea(a));
    }
    
}
