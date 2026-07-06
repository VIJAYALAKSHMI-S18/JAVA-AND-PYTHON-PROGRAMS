import java.util.*;

public class ZOHO_QN1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            i++;

            String num = "";

            while (i < s.length() && Character.isDigit(s.charAt(i))) {
                num += s.charAt(i);
                i++;
            }

            int count = Integer.parseInt(num);

            for (int j = 0; j < count; j++) {
                System.out.print(ch);
            }

            i--;
        }

        sc.close();
    }
}