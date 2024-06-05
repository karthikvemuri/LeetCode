class TwoSumII{
    public int[] twoSumII(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;

        while(left < right){
            int sum = nums[left] + nums[right];

            if (sum == target){
                return new int[]{left + 1, right + 1};

            }
            else if (sum < target){
                left++;
            }
            else{
                right--;
            }

        }

        return new int[]{};
    }

    public static void main(String[] args){
        TwoSumII solution = new TwoSumII();
        int[] nums = {2, 7, 9, 15};
        int target = 17;

        int[] result = solution.twoSumII(nums, target);

        System.out.println("[" + result[0] + "," + result[1] + "]");
    }
}