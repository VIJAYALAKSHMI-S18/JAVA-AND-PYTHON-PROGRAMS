import java.util.*;
public class TwoPointers{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
Sing
        //Backward rotation of an array
        int arr[] = {1, 2, 3, 4, 5};
        int n = arr.length;
        int k = sc.nextInt();
        k = k % n;
        int temp;
        
        while(k != 0){
            temp = arr[n-1];
            for(int i = n-1; i > 0; i--){
                arr[i] = arr[i-1];
            }
            arr[0] = temp;
            k--;
        }
        System.out.println(Arrays.toString(arr));
        
    }
}

/*

import java.util.*;

public class TwoPointersForward {
    //Backward rotation of an array by k elements
    static void reverse(int arr[], int st, int end) {
        int t;
        while (st < end) {
            t = arr[st];
            arr[st] = arr[end];
            arr[end] = t;
            st++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        k = k % n;

        reverse(arr, 0, n - k - 1);
        reverse(arr, n - k, n - 1);
        reverse(arr, 0, n - 1);

        System.out.println(Arrays.toString(arr));
    }
}

*/