package cn.zealon.sorts;

import cn.zealon.utils.Utils;

import java.util.Arrays;

/**
 * 堆排序
 *
 * 1）构建大顶堆
 * 2）排序
 *
 * @auther: Zealon
 * @Date: 2018-11-13 15:20
 */
public class HeapSort {


    private static int len;

    public static void main(String[] args){
        int[] nums = {5,2,1,8,10,6};
        heapSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void heapSort(int[] arr){

        len = arr.length;

        // 构建大顶堆
        buildMaxHeap(arr);

        // 将顶部的元素，与无序区的最后一个元素交换位置
        while (len > 0){
            // 0 表示大顶元素， len-1 表示最后一个元素
            Utils.swap(arr,0,len-1);

            // 无序区的长度减少一位
            len--;

            //继续调整
            changeHeap(arr,0);
        }
    }

    // 构建一个大顶堆
    public static void buildMaxHeap(int[] arr){
        for (int i = (len/2); i >=0 ; i--) {
            // 调整大顶堆
            changeHeap(arr,i);
        }
    }

    // 调整大顶堆
    private static void changeHeap(int[] arr, int i) {
        int maxIndex = i;
        // 如果有左子树。且左子树大于父节点，则将最大指针指向左子树
        if(i*2<len && arr[i*2] > arr[maxIndex]){
            maxIndex = i*2;
        }

        // 如果有右子树。且右子树大于父节点，则将最大指针指向右子树
        if(i*2+1<len && arr[i*2+1] > arr[maxIndex]){
            maxIndex = i*2+1;
        }

        // 如果父节点(i) 不是最大值，则将父节点与最大值交换
        // （这样才能保证我们的父节点是最大的）
        if(maxIndex != i){
            Utils.swap(arr,maxIndex,i);
            changeHeap(arr,maxIndex);
        }
    }
}
