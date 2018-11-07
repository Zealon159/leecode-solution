package cn.zealon.sorts;

import java.util.Arrays;

/**
 * 归并排序
 * @Author: zealon
 * @Version: 1.0
 */
public class MergeSort {
    public static void main(String[] args){
        int[] arr = {2,1,61,12,6,10};
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] mergeSort(int[] arr){
        if(arr.length<2){
            return arr;
        }

        int mid = arr.length/2;
        int[] left = Arrays.copyOfRange(arr,0,mid);
        int[] right = Arrays.copyOfRange(arr,mid,arr.length);

        return merge(mergeSort(left),mergeSort(right));
    }

    //将已经排序好的两个数组合并为一个排序好的数组
    public static int[] merge(int[] left,int[] right){
        int[] result = new int[left.length+right.length];
        for (int index = 0,i=0,j=0; index < result.length; index++) {
            if(i >= left.length){
                result[index] = right[j++];
            }else if(j >= right.length){
                result[index] = left[i++];
            }else if(left[i] > right[j]){
                result[index] = right[j++];
            }else{
                result[index] = left[i++];
            }
        }
        return result;
    }
}
