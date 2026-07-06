import java.util.*;
public class ZOHO_QN6 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        for(int i=0;i<n;i++){
            arr1[i] = sc.nextInt();
        }

        for(int i=0;i<m;i++){
            arr2[i] = sc.nextInt();
        }

        int[] result = new int[n+m];
        for(int i=0;i<n;i++){
            if(arr1[i] not in result){
                result[i] = arr1[i];
            }
        }
    }
}