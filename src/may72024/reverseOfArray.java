package may72024;

import java.util.Arrays;

public class reverseOfArray {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 11, 13, 12};
        int n = arr.length;

        for (int i = 0; i < n / 2; i++) {
            // Swap elements at index i and (n-i-1)
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
