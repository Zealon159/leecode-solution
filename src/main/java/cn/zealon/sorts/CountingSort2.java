package cn.zealon.sorts;

import java.util.Arrays;

/**
 * @auther: Zealon
 * @Date: 2018-11-15 09:22
 */
public class CountingSort2 {

    public static void main(String[] args){
        int[] nums = {1,4,56,3,4,8,4,6,7894,6,51,20,354,11,5};
        int[] sortNums = sort(nums);
        System.out.println(Arrays.toString(sortNums));
    }

    public static int[] sort(int[] arr){
        // 定义最大最小值
        int min = arr[0],max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min>arr[i]) min = arr[i];
            if (max<arr[i]) max = arr[i];
        }

        // 定义桶，并填充
        int[] bucket = new int[max-min+1];
        for (int i = 0; i < arr.length; i++) {
            bucket[arr[i]-min]++;
        }

        // 将桶进行排序，赋值到数组
        int index=0,i=0;
        while (i<bucket.length){
            // 如果桶元素不等于0 ，进行赋值
            if (bucket[i]!=0){
                arr[index] = i+min;
                bucket[i]--;
                index++;
            }else{
                i++;
            }
        }
        return arr;
    }
}
