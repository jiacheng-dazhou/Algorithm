package always;

/**
 * @Author zhoujiacheng
 * @Date 2023-02-14
 * @Description 递归
 **/
public class Recursion {
    private static int count = 0;

    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            System.out.print(getSum(i) + "\t");
        }
        System.out.println();
        hanNuoTa(5);
    }

    //斐波那契
    public static int getSum(int n){
        if (n <= 2) {
            return 1;
        }
        return getSum(n-1) + getSum(n-2);
    }

    /**
     * 汉诺塔
     * @param n
     * @param a
     * @param b
     * @param c
     */
    public static void hanNuoTa(int n, char a,char b,char c){
        if (n <= 1) {
            System.out.println(++count + ": " + a + "->" + c);
            return;
        }
        hanNuoTa(n-1,a,c,b);
        System.out.println(++count + ": " + a + "->" + c);
        hanNuoTa(n-1,b,c,a);
    }

    public static void hanNuoTa(int n){
        hanNuoTa(n,'A','B','C');
    }
}
