package cn.zealon.array;

/**
 * 二分查找算法
 * @auther: Zealon
 * @Date: 2018-10-23 11:28
 */
public class BinarySearch {

    public static void main(String[] args){

        int [] array = {1,2,3,4,5,6,7,12,19,55};
        for(int i=0;i<array.length;i++){
            //System.out.println(binarySearch(array,array[i]));
        }
        System.out.println(binarySearch2(array,6));

    }

    /**
     * 二分查找
     * @param nums 递增数组
     * @param target 待查找数值
     * @return
     */
    private static int binarySearch(int[] nums,int target) {
        if(null == nums) return -1;
        int low = 0,high = nums.length-1;
        while (low <= high){
            int mid = low + (high - low) / 2;
            if(target == nums[mid]){
                return mid;
            }else if(target < nums[mid]){
                high = mid - 1;
            }else if(target > nums[mid]){
                low = mid + 1;
            }
        }
        return -1;
    }

















    public static int binarySearch2(int[] nums,int target){
        int min = 0;
        int max = nums.length-1;
        while (min <= max){
            int mid = min+(max-min)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] > target){
                max = mid - 1;
            }else if(nums[mid] < target){
                min = mid + 1;
            }
        }
        return -1;
    }


}
