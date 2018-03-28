package eazy;

/**
 * Created by Administrator on 2018/1/3.
 */
public class TwoSum1 {
    public int[] twoSum(int[] nums, int target) {
        int[] s = new int[2];
        int size = nums.length-1;
        for(int i =0;i<size;i++){
            for(int j = i+1;j<=size;j++){
                if(nums[i]+nums[j]==target){
                    s[0]=i;
                    s[1]=j;
                    break;
                }
            }
        }
        return s;
    }


}
