package cn.zealon.sorts;

import cn.zealon.utils.Utils;

import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * 快速排序
 * @auther: Zealon
 * @Date: 2018-10-29 14:52
 */
public class QuickSort {
    public static void main(String[] args){

        int[] nums = {1,87,24,17,7,10};

        int[] sortNums = quickSort(nums,0,nums.length-1);

        System.out.println(Arrays.toString(sortNums));

    }

    public static int[] quickSort(int[] arr,int start,int end){
        int minIndex = partition(arr,start,end);
        if (minIndex > start){
            quickSort(arr,start,minIndex-1);
        }
        if (minIndex < end){
            quickSort(arr,minIndex+1,end);
        }
        return arr;
    }


    public static int partition(int[] arr,int start,int end){
        // 获取基准点
        int pivot = (int) (start+Math.random()*(end-start+1));

        // 将基准点放到数组最后面（交换）
        int temp = arr[pivot];
        arr[pivot] = arr[end];
        arr[end] = temp;

        // 比基准数大的索引下标，用于交换位置
        int minIndex = start - 1;

        for (int i = start; i <= end; i++) {
            // 依次对 i 元素，与基准数对比
            if(arr[i] <= arr[end]){
                minIndex++;
                if(i>minIndex){
                    int tmp = arr[i];
                    arr[i] = arr[minIndex];
                    arr[minIndex] = tmp;
                }
            }
        }
        return minIndex;
    }






















}
