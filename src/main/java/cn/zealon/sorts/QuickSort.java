package cn.zealon.sorts;

import java.util.Arrays;

/**
 * 快速排序
 * @auther: Zealon
 * @Date: 2018-10-29 14:52
 */
public class QuickSort {
    public static void main(String[] args){

        int[] nums = {1,87,24,17,7,10};


        // 获取基准点
        int pivot = (int) (0+Math.random()*(nums.length-0+1));

        //System.out.println((int)(Math.random()*7));
        int[] sortNums = sort(nums,0,nums.length-1);

        System.out.println(Arrays.toString(sortNums));

    }

    public static int[] quickSort(int[] arr,int start,int end){
        int si = partition2(arr,start,end);
        if (si > start){
            quickSort(arr,start,si-1);
        }
        if (si < end){
            quickSort(arr,si+1,end);
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









    public static int[] sort(int[] arr,int start,int end){
        int val = partition2(arr,start,end);
        if(val>start){
            sort(arr,start,val-1);
        }
        if (val<end){
            sort(arr,val+1,end);
        }
        return arr;
    }

    public static int partition2(int[] arr,int start,int end){
        // 随机获得基准值
        int pivot = (int)(start + Math.random()*(end-start+1));

        // 交换
        swap(arr,pivot,end);
        
        // 将小于基准值的元素移动到基准值左边
        int index = start-1;
        for (int i = start; i <= end; i++) {
            if(arr[i]<=arr[end]){
                index++;
                if(i>index){
                    swap(arr,index,i);
                }
            }
        }
        return index;
    }

    public static void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }






























    public static int partition4(int[] arr,int start,int end){
        // 随机获得基准
        int pivot = (int)(start+Math.random()*(end-start+1));

        // 交换到数组尾部
        swap(arr,pivot,end);

        // 将小于基准的元素进行筛选
        int index = start-1;
        for (int i = start; i <= end; i++) {
            if (arr[i]<=arr[end]){
                index++;
                if(i>index){
                    swap(arr,i,index);
                }
            }
        }
        return index;
    }









}
