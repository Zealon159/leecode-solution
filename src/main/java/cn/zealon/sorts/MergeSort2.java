package cn.zealon.sorts;

import java.util.Arrays;

/**
 * @auther: Zealon
 * @Date: 2018-11-15 10:07
 */
public class MergeSort2 {

    public static void main(String[] args){
        int[] arr = {1,4,5874,2,48,2,4,1,410,10,1566};
        int[] sortNums = sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    // 排序
    public static int[] sort(int[] arr){
        if (arr.length<2){
            return arr;
        }

        // 定义数组中间点
        int mid = arr.length/2;
        int[] left = Arrays.copyOfRange(arr,0,mid);
        int[] right = Arrays.copyOfRange(arr,mid,arr.length);
        return merge(sort(left),sort(right));
    }

    public static int[] merge(int[] left,int[] right){
        // 定义合并好的数组
        int[] result = new int[left.length+right.length];

        // 进行合并
        for (int index = 0,i=0,j=0; index < result.length; index++) {
            if (i>=left.length){
                result[index] = right[j++];
            }else if (j>=right.length){
                result[index] = left[i++];
            }else if (left[i]>right[j]){
                result[index] = right[j++];
            }else {
                result[index] = left[i++];
            }
        }

        return result;
    }


}
