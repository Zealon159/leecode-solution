package cn.zealon.sorts;

import java.util.Arrays;

/**
 * @auther: Zealon
 * @Date: 2018-11-15 09:31
 */
public class InsertSort2 {


    public static void main(String[] args){
        int[] nums = {11,45,7,1,64,2,15,0,48,50};
        int[] sortNums = sort(nums);
        System.out.println(Arrays.toString(sortNums));
    }

    public static int[] sort(int[] arr){
        // 当前元素值
        int current;
        
        // 遍历数组，当前元素与排好序的元素进行对比，如果小于则进行数据移动，最后将 当前元素值插入到合适位置
        for (int i = 0; i < arr.length-1; i++) {
            int preIndex = i;
            current = arr[i+1];
            while (preIndex>=0 && current<arr[preIndex]){
                arr[preIndex+1] = arr[preIndex];
                preIndex--;
            }
            arr[preIndex+1] = current;
        }

        return arr;
    }
}
