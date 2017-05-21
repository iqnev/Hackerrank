package implementation;

public class TheGridSearch {

    public static void main(String[] args) {
        String test1[] = new String[10];
        test1[0] = "7283455864";
        test1[1] = "6731158619";
        test1[2] = "6731158619";
        test1[3] = "3830589324";
        test1[4] = "2229505813";
        test1[5] = "5633845374";
        test1[6] = "6473530293";
        test1[7] = "7053106601";
        test1[8] = "0834282956";
        test1[9] = "4607924137";

        int rows = 3;
        int columns = 4;

        String pattern[] = new String[3];
        pattern[0] = "9505";
        pattern[1] = "3845";
        pattern[2] = "3530";

        String sub;
        int flag = 0;
        for (int i = 0; i <= 10 - rows; i++) {
            for (int j = 0; j <= 10 - columns; j++) {
                sub = test1[i].substring(j, j + columns);
                if (sub.equals(pattern[0])) {
                    int k = 1;
                    while (k < rows && pattern[k].equals(test1[i + k].substring(j, j + columns))) {
                        k++;
                    }
                    if (k == rows) {
                        flag = 1;
                    }
                }
            }
        }
        System.out.println((flag == 1) ? "YES" : "NO");
    }

}
