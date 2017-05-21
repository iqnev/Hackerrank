package implementation;

import java.util.Arrays;

public class SockMerchant {

    public static void main(String[] args) {
        int c[] = { 10, 20, 20, 10, 10, 30, 50, 10, 20 };
        int cSize = c.length;

        Arrays.sort(c);
        int a = c[0];
        int pairs = 0;
        boolean flag = true;
        for (int i = 1; i < cSize; i++) {
            if (flag && c[i] == a) {
                pairs++;
                flag = false;
            } else {
                a = c[i];
                flag = true;
            }
        }
        System.out.println(pairs);
        System.out.println("SockMerchant.main()");
    }

}
