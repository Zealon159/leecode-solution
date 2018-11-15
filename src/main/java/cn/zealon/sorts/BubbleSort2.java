package cn.zealon.sorts;

import cn.zealon.utils.Utils;

import java.util.Arrays;

/**
 * @auther: Zealon
 * @Date: 2018-11-15 09:17
 */
public class BubbleSort2 {


    public static void main(String[] args){
        int[] nums = {10,4,2,478,31,43,1,46,2,18};
        int[] sortNums = sort(nums);
        System.out.println(Arrays.toString(sortNums));
    }

    public static int[] sort(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            boolean flag = false;
            for (int j = 0; j < arr.length-i-1 ; j++) {
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if (!flag){
                break;
            }
        }
        return arr;
    }
}
