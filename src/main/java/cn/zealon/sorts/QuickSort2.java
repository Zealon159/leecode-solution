package cn.zealon.sorts;

import java.util.Arrays;

/**
 * @auther: Zealon
 * @Date: 2018-11-15 09:01
 */
public class QuickSort2 {

    public static void main(String[] args){
        int[] nums = {12,52,1,4,20,16};
        int[] numsSort = quickSort(nums,0,nums.length-1);
        System.out.println(Arrays.toString(numsSort));
    }


    public static int[] quickSort(int[] arr,int start,int end){
        int index = partition(arr,start,end);
        if (index>start){
            quickSort(arr,start,index-1);
        }
        if (index<end){
            quickSort(arr,index+1,end);
        }
        return arr;
    }

    public static int partition(int[] arr,int start,int end){
        // 随机获得基准
        int pivot = (int)(start+Math.random()*(end-start+1));

        // 交换到数组尾部
        QuickSort.swap(arr,pivot,end);

        // 将小于基准的元素进行筛选
        int index = start-1;
        for (int i = start; i <= end; i++) {
            if (arr[i]<=arr[end]){
                index++;
                if(i>index){
                    QuickSort.swap(arr,i,index);
                }
            }
        }
        return index;
    }
}
