/**
 * @Author zhoujiacheng
 * @Date 2023-02-06
 * @Description 插入排序
 **/
public class InsertSort {
    public static void main(String[] args) {
        int[] arr = CommonUtil.randomArr(4);
        System.out.print("排序前：");
        CommonUtil.printArr(arr);
        System.out.print("排序后：");
        CommonUtil.printArr(insertMoveSort(arr));
    }

    public static int[] insertSwapSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j + 1] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }else{
                    break;
                }
            }
        }
        return arr;
    }

    public static int[] insertMoveSort(int[] arr) {
        int j;
        for (int i = 1; i < arr.length; i++) {
            int insertVal = arr[i];
            for (j = i - 1; j >= 0 && arr[j] > insertVal; j--) {
                arr[j + 1] = arr[j];
            }
            if (!((j + 1) == i)) {
                arr[j + 1] = insertVal;
            }
        }
        return arr;
    }
}
