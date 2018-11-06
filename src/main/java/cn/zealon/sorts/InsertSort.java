package cn.zealon.sorts;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/**
 * 插入排序
 *
 * step1：从第一个元素开始，该元素可以认为已经被排序；
 * step2：取出下一个元素，在已经排序的元素序列中从后向前扫描；
 * step3：如果该元素（已排序）大于新元素，将该元素移到下一位置；
 * step4：重复步骤3，直到找到已排序的元素小于或者等于新元素的位置；
 * step5：将新元素插入到该位置后，重复步骤2 ~ 5。
 *
 * @auther: Zealon
 * @Date: 2018-10-25 14:54
 */
public class InsertSort {
    public static void main(String[] args){
        int[] nums = {1,21,38,16,20,29};
        sort(nums);

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    public static void insertSort(int[] nums){

        int current;

        for(int i=0;i<nums.length-1;i++){
            current = nums[i+1];
            int preIndex = i;
            while (preIndex>=0 && current<nums[preIndex]){
                // 下移元素
                nums[preIndex+1] = nums[preIndex];
                preIndex--;
            }
            nums[preIndex+1] = current;
        }


    }




























    public static void sort(int[] nums){
        for (int i = 0; i < nums.length-1; i++) {
            int current = nums[i+1];
            int preIndex = i;
            while (preIndex>=0 && current<nums[preIndex]){
                nums[preIndex+1] = nums[preIndex];
                preIndex --;
            }
            nums[preIndex+1]= current;
        }
    }


}
