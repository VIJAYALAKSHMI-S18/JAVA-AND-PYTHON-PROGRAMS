import java.util.*;

public class ZOHO_QN2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] odd = new int[(n + 1) / 2];
        int[] even = new int[n / 2];

        int o = 0, e = 0;

        // Separate odd and even position elements
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                odd[o++] = arr[i];
            } else {
                even[e++] = arr[i];
            }
        }

        // Sort odd array in descending order
        Arrays.sort(odd);
        for (int i = 0; i < odd.length / 2; i++) {
            int temp = odd[i];
            odd[i] = odd[odd.length - 1 - i];
            odd[odd.length - 1 - i] = temp;
        }

        Arrays.sort(even);

        o = 0;
        e = 0;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                arr[i] = odd[o++];
            } else {
                arr[i] = even[e++];
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}