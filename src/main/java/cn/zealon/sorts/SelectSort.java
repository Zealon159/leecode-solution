package cn.zealon.sorts;

/**
 * 选择排序
 *
 * 首先在未排序序列中找到最小(大)元素，存放到排序序列的其实位置，
 * 然后再从剩余未排序元素中继续寻找最小(大)元素，然后放到已排序序列的末尾。
 * 以此类推，知道所有元素均排序完成。
 *
 * @Author: zealon
 * @Version: 1.0
 */
public class SelectSort {
    public static void main(String[] args){

        int[] nums = {1,4,52,14,5,8,12,2};
        sort1(nums);

        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }

    public static void sort(int[] nums){
        for(int i=0;i<nums.length;i++){
            int minIndex = i; //假设最小索引为 i
            for(int j=i;j<nums.length;j++){
                //比较最小索引进行赋值
                if(nums[minIndex]>nums[j]){
                    minIndex = j;
                }
            }
            //每比较一轮 进行数据交换
            int temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;
        }
    }

























    public static void sort1(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            int min = i;
            for (int j = i; j < nums.length; j++) {
                if (nums[i]>nums[j]){
                    min = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[min];
            nums[min] = temp;
        }
    }






}
