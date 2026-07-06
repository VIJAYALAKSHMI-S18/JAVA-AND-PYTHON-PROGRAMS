import java.util.*;

public class TwoPointersForward {
    //Forward rotation of an array by k elements
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

        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        reverse(arr, 0, n - 1);

        System.out.println(Arrays.toString(arr));
    }
}