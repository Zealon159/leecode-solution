package cn.zealon.array;

/**
 * @auther: Zealon
 * @Date: 2018-11-15 09:07
 */
public class BinarySearch2 {

    public static void main(String[] args){
        int[] nums = {1,4,6,7,9,15,50,67,177,888,1004};
        int target = 1004;
        System.out.println(binarySearch(nums,target));
    }

    public static int binarySearch(int[] arr,int target){
        int low=0,high=arr.length;
        while (low <= high){
            int mid = low+(high-low)/2;
            if (arr[mid]==target){
                return mid;
            }else if (arr[mid]>target){
                high = mid-1;
            }else if (arr[mid]<target){
                low = mid+1;
            }
        }
        return -1;
    }
}
