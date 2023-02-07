/**
 * @Author zhoujiacheng
 * @Date 2023-02-06
 * @Description 希尔排序
 **/
public class ShellSort {
    public static void main(String[] args) {
        int[] arr = new int[]{8, 9, 1, 7};
        shellSwapSort(arr);
        CommonUtil.printArr(arr);
        int[] arr1 = new int[]{8, 9, 1, 7};
        shellMoveSort(arr1);
        CommonUtil.printArr(arr1);
    }

    public static void shellSwapSort(int[] arr) {
        //遍历所有的步长
        for (int gap = arr.length / 2; gap > 0; gap = gap / 2) {
            //遍历所有的元素
            for (int i = gap; i < arr.length; i++) {
                //遍历本组中所有元素
                for (int j = i - gap; j >= 0; j -= gap) {
                    //如果当前元素大于加上步长后的那个元素
                    if (arr[j] > arr[j + gap]) {
                        int temp = arr[j];
                        arr[j] = arr[j + gap];
                        arr[j + gap] = temp;
                    }
                }
            }
        }
    }

    public static void shellMoveSort(int[] arr) {
        //遍历所有的步长
        for (int gap = arr.length / 2; gap > 0; gap = gap / 2) {
            //遍历所有的元素
            for (int i = gap; i < arr.length; i++) {
                //遍历本组中所有元素
                int index = i;
                int insertValue = arr[i];
                if (arr[index] < arr[index - gap]) {
                    while (index - gap >= 0 && insertValue < arr[index - gap]) {
                        arr[index] = arr[index-gap];
                        index -= gap;
                    }
                    arr[index] = insertValue;
                }
            }
        }
    }
}
