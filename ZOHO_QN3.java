import java.util.*;
public class ZOHO_QN3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        int mid = n/2;
        
        for(int i = 0; i < n; i++){
            int left = i <= mid ? i : n - i - 1;
            int right = n - 1 - left;


            for(int j = 0; j < n; j++){
                if(j == left || j == right){
                    System.out.print(s.charAt(j));
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}