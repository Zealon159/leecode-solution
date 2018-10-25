package cn.zealon.sorts;

/**
 * 冒泡排序
 * @auther: Zealon
 * @Date: 2018-10-25 11:24
 */
public class BubbleSort {

    public static void main(String[] args){
        int[] nums = {1,2,78,6,48,10,8,66};
        bubbleSort(nums);

        // 输出结果
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+"\t");
        }
    }

    /**
     * 冒泡排序
     * @param nums
     */
    public static void bubbleSort(int[] nums){
        // 數組长度
        int len = nums.length;

        for(int i=0;i<len;++i){
            boolean flag = false;
            for(int j=0;j<len-i-1;++j){
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    flag = true; // 表示有数据交换
                }
            }
            if (!flag) break; // 没有数据交换，提前退出
        }
    }

}
