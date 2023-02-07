/**
 * @Author zhoujiacheng
 * @Date 2023-02-07
 * @Description 快速排序
 **/
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = CommonUtil.randomArr(10);
        System.out.print("排序前：");
        CommonUtil.printArr(arr);
        quickSort(arr,0,arr.length-1);
        System.out.print("排序后：");
        CommonUtil.printArr(arr);
    }

    public static void quickSort(int[] arr, int left, int right) {
        if (left > right) {
            return;
        }
        //取第一个元素作为key
        int key = arr[left];
        int begin = left;
        int end = right;
        while (begin < end) {
            while (begin < end && arr[end] >= key) {
                end--;
            }
            while ((begin < end && arr[begin] <= key)) {
                begin++;
            }
            if(begin<end){
                swap(arr,begin,end);
            }
        }
        //交换基准位置
        swap(arr,left,begin);
        CommonUtil.printArr(arr);
        quickSort(arr,left,begin-1);
        quickSort(arr,begin+1,right);
    }

    private static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
