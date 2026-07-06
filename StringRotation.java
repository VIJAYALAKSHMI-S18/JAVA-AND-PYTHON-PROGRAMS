import java.util.*;

public class StringRotation {

    static void reverse(char arr[], int st, int end) {
        char t;

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

        String s = sc.next();
        int n = s.length();

        char arr[] = s.toCharArray();

        int k = sc.nextInt();
        k = k % n;

        reverse(arr, 0, n - k - 1);
        reverse(arr, n - k, n - 1);
        reverse(arr, 0, n - 1);

        String z = "";

        for (char d : arr) {
            z = z + d;
        }

        System.out.println(z);
    }
}