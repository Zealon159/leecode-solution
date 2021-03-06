package cn.zealon.sorts;


import java.util.Arrays;

/**
 * 归并排序
 * @Author: zealon
 * @Version: 1.0
 */
public class MergeSort {
    public static void main(String[] args){
        int[] arr = {1,4,5874,2,48,2,4,1,410,10,1566};
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println(5 << 2);
/*        int[] left = {1,3};
        int[] right = {2,4};
        System.out.println(left.length);
        int[] nums = merge1(left,right);

        System.out.println(Arrays.toString(nums));*/

    }

    public static int[] mergeSort1(int[] nums){
        if(nums.length<2){
            return nums;
        }
        int mid = nums.length/2;
        int[] left = Arrays.copyOfRange(nums,0,mid);
        int[] right = Arrays.copyOfRange(nums,mid,nums.length);
        return merge1(mergeSort1(left),mergeSort1(right));
    }

    // 合并已经排好序的2个数组
    public static int[] merge1(int[] left,int[] right){
        int[] result = new int[left.length+right.length];
        for (int index = 0,i=0,j=0; index < result.length; index++) {
            if(i>=left.length){
                result[index]=right[j++];
            }else if(j>=right.length){
                result[index]=left[i++];
            }else if(left[i]>right[j]){
                result[index]=right[j++];
            }else if(left[i]<right[j]){
                result[index]=left[i++];
            }
        }
        return result;
    }


    public static int[] mergeSort(int[] nums){
        int mid = nums.length/2;
        if(nums.length<2){
            return nums;
        }
        int[] left = Arrays.copyOfRange(nums,0,mid);
        int[] right = Arrays.copyOfRange(nums,mid,nums.length);
        return merge(mergeSort(left),mergeSort(right));
    }


    public static int[] merge(int[] left,int[] right){
        int[] result = new int[left.length+right.length];
        for (int index = 0,i=0,j=0; index < result.length; index++) {
            if(i>=left.length){
                result[index]=right[j++];
            }else if(j>=right.length){
                result[index]=left[i++];
            }else if(left[i]>right[j]){
                result[index]=right[j++];
            }else if(left[i]<right[j]){
                result[index]=left[i++];
            }
        }
        return result;
    }











}
