import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> numsMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];

            if(numsMap.containsKey(complement)){
                return new int[] {numsMap.get(complement), i};
            }

            numsMap.put(nums[i], i);
        }

        return new int[] {};
        
    }
    public static void main(String[] args) {
        TwoSum solution = new TwoSum();

        int[] nums = {2, 7, 11, 15};
        int target = 9;
        
        int[] result = solution.twoSum(nums, target);
        
        System.out.println(Arrays.toString(result));
    }
}
