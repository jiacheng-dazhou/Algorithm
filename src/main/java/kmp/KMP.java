package kmp;


/**
 * @Author zhoujiacheng
 * @Date 2023-02-14
 * @Description KMP算法
 **/
public class KMP {
    public static void main(String[] args) {
        String str = "abcababcdbca";
        String match = "ababcd";//0 0
        int[] next = getNext(match);
        System.out.println(next);
    }

    public static int[] getNext(String t) {
        int[] next = new int[t.length()];
        int i = 0;
        int j = -1;
        next[0] = -1;
        while (i < t.length() - 1) {
            if (j == -1 || t.charAt(i) == t.charAt(j)) {
                i++;
                j++;
                if (t.charAt(i) != t.charAt(j)) {
                    next[i] = j;
                } else {
                    next[i] = next[j];
                }
            } else {
                j = next[j];
            }
        }
        return next;
    }

}
