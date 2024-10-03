import java.util.*;
public class f11 {
    public static boolean distinct(int nums[]) {
        for(int i = 0;i<nums.length;i++) {
            int currNum = nums[i];
            int count = 0;
            for(int j=0;j<nums.length;j++){
                if(currNum == nums[j]){
                    count++;
                }
                if(count>1) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[] = {2,3,1,4,1,1,1,1,1};
        System.out.println(distinct(nums));
    }
}
