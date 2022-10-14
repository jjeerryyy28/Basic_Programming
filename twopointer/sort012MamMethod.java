package twopointer;

import java.util.Arrays;

public class sort012MamMethod {
    public static void main(String[] args) {
    
        int a[] = { 0, 1, 1, 2, 1, 2, 0, 0, 0, 1, 2, 1, 2, 1, 2 };


		int i = 0;
		int j = a.length - 1;
		while (i <= j) {

			if (a[j] == 2) {
				j--;
			}

			else if (a[i] == 0 || a[i] == 1) {
				i++;
			}

			else if ((a[j] == 0 || a[j] == 1) && a[i] == 2) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
				j--;

			}

		}

		System.out.println(Arrays.toString(a));

		j = a.length-1;
		i = 0;
		
		while (i <= j) {

			if (a[j] == 2 || a[j] == 1) {
				j--;
			}

			else if (a[i] == 0) {
				i++;
			}

			else if ((a[j] == 0 && a[i] == 1)) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
				j--;

			}

		}

		System.out.println(Arrays.toString(a));
    }
}
