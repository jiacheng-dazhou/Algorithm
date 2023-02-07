/**
 * @Author zhoujiacheng
 * @Date 2023-02-06
 * @Description 冒泡排序
 **/
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = CommonUtil.randomArr(8);

        System.out.print("排序后：");
        CommonUtil.printArr(bubbleSort(arr));
    }

    public static int[] bubbleSort(int[] arr){
        boolean flag = false;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }else{
                flag = false;
            }
        }
        return arr;
    }
    

}
