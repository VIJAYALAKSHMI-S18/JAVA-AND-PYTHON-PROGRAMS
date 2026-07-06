import java.util.*;

public class ZOHO_QN18 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        char[] ch = s.toCharArray();

        int[] num = new int[(ch.length + 1) / 2];
        char[] opr = new char[ch.length / 2];

        int n = 0, o = 0;

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '+' || ch[i] == '-' || ch[i] == '*' || ch[i] == '/') {
                opr[o++] = ch[i];
            } else {
                num[n++] = ch[i] - '0';
            }
        }

        int result = num[0];

        for (int i = 0; i < opr.length; i++) {
            if (opr[i] == '+') {
                result = result + num[i + 1];
            } else if (opr[i] == '-') {
                result = result - num[i + 1];
            } else if (opr[i] == '*') {
                result = result * num[i + 1];
            } else if (opr[i] == '/') {
                result = result / num[i + 1];
            }
        }

        System.out.println(result);
    }
}