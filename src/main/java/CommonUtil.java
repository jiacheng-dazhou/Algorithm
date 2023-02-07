/**
 * @Author zhoujiacheng
 * @Date 2023-02-06
 **/
public class CommonUtil {

    public static void printArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            }else{
                System.out.print(arr[i] + ",");
            }
        }
        System.out.println();
    }

    public static int[] randomArr(int size){
        if (size> 20) {
            throw new RuntimeException("数据过大");
        }
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int)(Math.random()*10000);
        }
        return arr;
    }
}
