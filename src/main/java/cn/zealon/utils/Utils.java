package cn.zealon.utils;

/**
 * @auther: Zealon
 * @Date: 2018-11-09 15:16
 */
public class Utils {
    public static void swap(int[] arr, int i ,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
