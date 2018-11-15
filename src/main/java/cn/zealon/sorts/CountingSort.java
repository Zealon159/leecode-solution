package cn.zealon.sorts;

import java.util.Arrays;

/**
 * 计数排序
 * @auther: Zealon
 * @Date: 2018-11-13 15:49
 */
public class CountingSort {

    public static void main(String[] args){
        int[] nums = {3,4,7,3,5};
        sort2(nums);
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






















    public static void sort2(int[] arr){
        // 获取最大最小值
        int max=arr[0],min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max<arr[i]) max=arr[i];
            if (min>arr[i]) min=arr[i];
        }

        // 定义计数数组，并填充计数值
        int[] bucket = new int[max-min+1];
        for (int i = 0; i < arr.length; i++) {
            bucket[arr[i]-min]++;
        }

        // 将桶填充为有序数组
        int i=0; //桶下标
        int index = 0; //排序数组下标
        while (i < bucket.length){
            if(bucket[i]!=0){
                arr[index]=i+min;
                bucket[i]--;
                index++;
            }else{
                i++;
            }
        }
    }









}
