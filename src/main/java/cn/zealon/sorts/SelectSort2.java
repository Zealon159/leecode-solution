package cn.zealon.sorts;

import java.util.Arrays;

/**
 * @auther: Zealon
 * @Date: 2018-11-15 13:43
 */
public class SelectSort2 {

    public static void main(String[] args){
        int[] nums = {1,456,15,2,4,6,74,4,561,4,10,158};
        System.out.println(Arrays.toString(sort(nums)));
    }

    public static int[] sort(int[] arr){
        int minIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            minIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[minIndex]>arr[j]){
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return arr;
    }
}
