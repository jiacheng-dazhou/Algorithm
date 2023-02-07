/**
 * @Author zhoujiacheng
 * @Date 2023-02-06
 * @Description 选择排序
 **/
public class SelectSort {

    public static void main(String[] args) {
        int[] arr = CommonUtil.randomArr(8);
        System.out.print("排序前：");
        CommonUtil.printArr(arr);
        System.out.print("排序后：");
        CommonUtil.printArr(selectMinSort(arr));
        System.out.print("排序后：");
        CommonUtil.printArr(selectMaxSort(arr));
    }

    public static int[] selectMinSort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return arr;
    }

    public static int[] selectMaxSort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            int maxIndex = i;
            int count = -1;
            for (int j = 0; j < arr.length-i; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
                count ++;
            }
            temp = arr[count];
            arr[count] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
        return arr;
    }
}
