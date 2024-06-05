import java.util.*;

class ContainsDuplicate{
    public boolean containsDuplicate(int[] nums){
        HashSet<Integer> numsSet = new HashSet<>();

        for(int num : nums){
            if(numsSet.contains(num)){
                return true;
            }
            numsSet.add(num);
        }

        return false;
    }

    public static void main(String[] args){
        ContainsDuplicate solution = new ContainsDuplicate();

        int[] nums = {1, 2, 3, 4, 5, 6, 5};

        System.out.println(solution.containsDuplicate(nums));

    }
}