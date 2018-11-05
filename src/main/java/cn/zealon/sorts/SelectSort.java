package cn.zealon.sorts;

/**
 * 选择排序
 * @Author: zealon
 * @Version: 1.0
 */
public class SelectSort {
    public static void main(String[] args){

        int[] nums = {1,4,52,14,5,8,12,2};
        sort(nums);

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
}
