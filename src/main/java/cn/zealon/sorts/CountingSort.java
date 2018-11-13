package cn.zealon.sorts;

import java.util.Arrays;

/**
 * 计数排序
 * @auther: Zealon
 * @Date: 2018-11-13 15:49
 */
public class CountingSort {

    public static void main(String[] args){
        int[] nums = {6,2,8,10,7,10,6};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static int[] sort(int[] arrays){

        // 先找到数组最大值，最小值
        int min = arrays[0],max = arrays[0];
        for (int i = 0; i < arrays.length; i++) {
            if(max<arrays[i]){
                max = arrays[i];
            }
            if(min>arrays[i]){
                min = arrays[i];
            }
        }

        // 定义计数数组，并填充计数值
        int[] bucket = new int[max-min+1];
        for (int i = 0; i < arrays.length; i++) {
            bucket[arrays[i]-min]++;
        }

        int index=0,i=0;
        while (index < arrays.length){
            if(bucket[i]!=0){
                arrays[index] = i + min;
                bucket[i]--;
                index++;
            }else{
                i++;
            }
        }
        return arrays;
    }























    public static void sort2(int[] nums){

        // 计算最大最小值
        int min=nums[0],max =nums[0];
        for (int i = 0; i < nums.length; i++) {
            if(min>nums[i]){
                min=nums[i];
            }
            if(max<nums[i]){
                max=nums[i];
            }
        }

        // 定义并填充计数数组
        int[] bucket = new int[max-min+1];
        for (int i = 0; i < nums.length; i++) {
            bucket[nums[i]-min]++;
        }

        // 将计数数组回填到有序数组
        int index=0,i=0;
        while (index<nums.length){
            if(bucket[index]!=0){
                nums[index]=i+min;
                bucket[i]--;
                index++;
            }else {
                i++;
            }
        }

    }











}
