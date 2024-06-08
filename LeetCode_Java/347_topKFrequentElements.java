import java.util.*;
import java.util.Map.Entry;

class TopKFrequentElements{

    public List<Integer> topKFrequentElements(int[] nums, int k){
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> countMap = new HashMap<>();
        List<Integer>[] freqCount = new List[nums.length + 1];

        for(int i = 0; i < freqCount.length; i++){
            freqCount[i] = new ArrayList<>();
        }

        for(int num: nums){
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        for(Entry<Integer, Integer> entry : countMap.entrySet()){
            int num = entry.getKey();
            int count = entry.getValue();
            freqCount[count].add(num);
        }

        for(int i = freqCount.length - 1; i > 0; i--){
            for(int num : freqCount[i]){
                result.add(num);

                if(result.size() == k){
                    return result;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        TopKFrequentElements solution = new TopKFrequentElements();
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;

        System.out.println(solution.topKFrequentElements(nums, k));
    }
}