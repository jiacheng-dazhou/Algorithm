/**
 * @Author zhoujiacheng
 * @Date 2023-02-08
 * @Description 二分查找法
 **/
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[]{123, 2580, 2825, 3834, 4135, 4203, 5337, 6363, 8022, 8242};
        System.out.print("查找数组：");
        CommonUtil.printArr(arr);
        int index = binarySearch(arr, 8242, 0, arr.length - 1);
        if (index != -1) {
            System.out.println("查找索引值为：" + index);
        } else {
            System.out.println("当前数值不在数组中");
        }

    }

    public static int binarySearchRecursion(int[] arr, int selectValue, int left, int right) {
        if (left > right) {
            return -1;
        }
        int mid = (left + right) / 2;
        if (arr[mid] == selectValue) {
            return mid;
        }
        if (arr[mid] > selectValue) {
            return binarySearch(arr, selectValue, left, mid - 1);
        } else {
            return binarySearch(arr, selectValue, mid + 1, right);
        }
    }

    public static int binarySearch(int[] arr, int selectValue, int left, int right) {
        int key = -1;
        while (left <= right) {
            int mid = (left + right) >>> 1;
            if (arr[mid] == selectValue) {
                key = mid;
                break;
            }
            if (arr[mid] > selectValue) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return key;
    }
}
