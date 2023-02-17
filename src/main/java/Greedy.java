import java.util.Scanner;

/**
 * @Author zhoujiacheng
 * @Date 2023-02-14
 * @Description  贪心算法
 **/
public class Greedy {
    static int[] arr = {100,50,20,5,1}; //用来存纸币面额
    static int[] num = new int[5]; //每种纸币的数量
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        f(n);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+":"+num[i]);
        }
    }
    static void f(int n) {
        //遍历arr数组
        for (int i = 0; i < arr.length; i++) {
            //  求出每类纸币需要多少张
            num[i] = n / arr[i];
            n = n % arr[i];
        }
    }
}
