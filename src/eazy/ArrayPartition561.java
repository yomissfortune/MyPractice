package eazy;

/**
 * Created by Administrator on 2018/1/3.
 */
public class ArrayPartition561 {
//    Given an array of 2n integers, your task is to group these integers into n pairs of integer, say (a1, b1), (a2, b2), ..., (an, bn) which makes sum of min(ai, bi) for all i from 1 to n as large as possible.
//
//    Example 1:
//
//    Input: [1,4,3,2]
//
//    Output: 4
//    Explanation: n is 2, and the maximum sum of pairs is 4 = min(1, 2) + min(3, 4).
//
//    Note:
//
//    n is a positive integer, which is in the range of [1, 10000].
//    All the integers in the array will be in the range of [-10000, 10000].
    public int arrayPairSum(int[] nums) {
        int length  = nums.length;
        quicksort(nums, 0, length - 1);
        int total = 0;
        length = length/2;
        for(int i = 0;i<length ;i++){
            total = total +nums[2*i];
        }
        return total;
    }
    private int getMiddle(int[] sortArray,int low,int high){
        int key = sortArray[low];
        while(low<high){
            while(low <high && sortArray[high] >= key){
                high--;
            }
            sortArray[low] = sortArray[high];
            while(low < high && sortArray[low] <= key){
                low++;
            }
            sortArray[high] = sortArray[low];
        }
        sortArray[low] = key;
        return low;
    }
    public void quicksort(int[] sortArray, int low,int high){
        if(low<high){
            int middle = getMiddle(sortArray, low, high);
            quicksort(sortArray, low, middle-1);
            quicksort(sortArray, middle+1, high);
        }
    }

}
