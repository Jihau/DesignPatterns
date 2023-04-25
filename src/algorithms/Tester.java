package algorithms;

import java.util.*;

public class Tester {

    //Answer to firt question
    public static int greatestProduct1(int[] arr) {
        int n = arr.length;
        int maxproduct = Integer.MIN_VALUE;
        for (int i= 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    int product = arr[i] * arr[j] * arr[k];
                    if (product > maxproduct) {
                        maxproduct = product;
                    }
                }
            }
        }
        return maxproduct;
    }

    //Answer to second question
    public static int greatestProduct2(int[] arr) {
        int n = arr.length;
        if (n < 3) {
            return 0;
        }
        Arrays.sort(arr);
        return Math.max(arr[0] * arr[1] * arr[n-1], arr[n-3] * arr[n-2] * arr[n-1]);
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 7, 8, 6, 1};
        System.out.println(greatestProduct1(arr));
        System.out.println(greatestProduct2(arr));
    }
}