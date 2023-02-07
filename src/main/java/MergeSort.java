/**
 * @Author zhoujiacheng
 * @Date 2023-02-07
 * @Description 归并排序
 **/
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = CommonUtil.randomArr(10);
        System.out.print("排序前：");
        CommonUtil.printArr(arr);
        mergeSort1(arr);
        System.out.print("排序后：");
        CommonUtil.printArr(arr);
    }

    public static void mergeSort1(int[] arr){
        int[] temp = new int[arr.length];
        mergeSort1(arr,temp,0, arr.length-1);
    }

    private static void mergeSort1(int[] arr, int[] temp, int left, int right) {
        int mid = (right+left) / 2;
        if (right - left > 1) {
            mergeSort1(arr,temp,left,mid);
            mergeSort1(arr,temp,mid+1,right);
        }
        merge1(arr,temp,left,mid,right);
    }

    private static void merge1(int[] arr, int[] temp, int left, int mid, int right) {
        int begin1 = left;
        int end1 = mid;
        int begin2 = mid + 1;
        int end2 = right;
        int k = left;
        while(begin1 <= end1 || begin2 <= end2){
            if(begin1 > end1){
                temp[k++] = arr[begin2++];
            }else if(begin2 > end2){
                temp[k++] = arr[begin1++];
            }else{
                if(arr[begin1]>arr[begin2]){
                    temp[k++] = arr[begin2++];
                }else{
                    temp[k++] = arr[begin1++];
                }
            }
        }
        for (int i = left; i <= right; i++) {
            arr[i] = temp[i];
        }
    }


    public static void mergeSort(int[] a, int lo, int hi) {
        // 归并两个数组需要额外的数组空间，我们直接在此地new一个，放置递归时循环申请空间
        int[] temp = new int[a.length];
        mergeSort(a, temp, lo, hi);
    }

    public static void mergeSort(int[] a) {
        mergeSort(a, 0, a.length - 1);
    }

    /**
     * Description: 归并算法实现
     *
     * @param a    原数据位置
     * @param temp 用来存放数组
     * @param lo
     * @param hi   void
     * @Title: mergeSort
     */
    private static void mergeSort(int[] a, int[] temp, int lo, int hi) {
        int mid = (lo + hi) / 2;
        if (hi - lo > 1) { // 子数组长度大于1时，进行拆分
            mergeSort(a, temp, lo, mid);
            mergeSort(a, temp, mid + 1, hi);
        }
        merge(a, temp, lo, mid, hi);
        // 合并a[lo..mid]和 a[mid..hi] //此时两个数组都是有序数组
    }

    /**
     * Description:
     *
     * @param a
     * @param temp
     * @param lo
     * @param mid
     * @param hi   void
     * @Title: merge
     */
    private static void merge(int[] a, int[] temp, int lo, int mid, int hi) {
        int arr1Begin = lo;
        int arr1End = mid;

        int arr2Begin = mid + 1;
        int arr2End = hi;
        int k = lo;

        while (arr1Begin <= arr1End || arr2Begin <= arr2End) {
            if (arr1Begin > arr1End) { // 说明1号数组中已经无值
                temp[k++] = a[arr2Begin++];
            } else if (arr2Begin > arr2End) { // 说明二号数组中已经无值
                temp[k++] = a[arr1Begin++];
            } else {// 两个数组都没有结束，比大小添加。
                if (a[arr1Begin] < a[arr2Begin]) { // 比大小添加
                    temp[k++] = a[arr1Begin++];
                } else {
                    temp[k++] = a[arr2Begin++];
                }
            }
        }
        for (int i = lo; i <= hi; i++) {
            a[i] = temp[i];
        }
    }
}
