/**
 * @Author zhoujiacheng
 * @Date 2023-02-07
 * @Description 基数排序
 **/
public class RadixSort {
    public static void main(String[] args) {
        int[] arr = CommonUtil.randomArr(10);
        System.out.print("排序前：");
        CommonUtil.printArr(arr);
        System.out.print("排序后：");
        CommonUtil.printArr(radixSort(arr));
    }

    public static int[] radixSort(int[] arr) {
        int max = getMax(arr);
        int[][] temp = new int[10][arr.length];
        for (int exp = 1; max / exp > 0; exp = exp * 10) {
            int[] tempCount = new int[10];
            for (int i = 0; i < arr.length; i++) {
                temp[(arr[i]/exp)%10][tempCount[(arr[i]/exp)%10]] = arr[i];
                tempCount[(arr[i]/exp)%10]++;
            }
            int key = 0;
            for (int i = 0; i < tempCount.length; i++) {
                if (tempCount[i] != 0) {
                    for (int j = 0; j < tempCount[i]; j++) {
                        arr[key++] = temp[i][j];
                    }
                }
            }
        }
        return arr;
    }

    public static int getMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new RuntimeException("数组为空");
        }
        int maxValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
}
