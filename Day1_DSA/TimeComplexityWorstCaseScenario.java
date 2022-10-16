package Day1_DSA;

public class TimeComplexityWorstCaseScenario {
    //Find Pair in an Array worst case Scenario:
    static boolean isPair(int a[], int n, int z){
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                if(i!=j && a[i]+a[j]==z)
                    return true;
        return false;
    }
    public static void main(String[] args) {
        int a[] = { 1,-2,1,0,5};
        int z = 0;
        int n = a.length;

        //function calling
        if(isPair(a, n, z))
            System.out.println("True");
        else
            System.out.println("False");
        
    }
}

/*
 * Here Time complexity for worst case Scenario will be  O(n2)
 * as N*c operations required to check input
 * then outer loop "i" loop will run N times
 * and for each i, the inner loop"j" will run N times
 * 
 * therfore: total execution time will be N*c+N*N*c+c
 * as we ignore lower order so the result will be N*N i.e N^2 
 */