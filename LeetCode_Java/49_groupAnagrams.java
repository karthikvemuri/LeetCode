import java.util.*;

class GroupAnagrams{
    public List<List<String>> groupAnagrams(String[] strs){
        Map<String,List<String>> anagramMap = new HashMap<>();
        
        for(String str : strs){
            int[] countArray = new int[26];

            for(char c : str.toCharArray()){
                countArray[c - 'a']++;
            }

            String key = Arrays.toString(countArray);

            if(!anagramMap.containsKey(key)){
                anagramMap.put(key, new ArrayList<>());
            }

            anagramMap.get(key).add(str);
        }
        return new ArrayList<>(anagramMap.values());
    }

    public static void main(String[] args){

        GroupAnagrams solution = new GroupAnagrams();
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

        List<List<String>> result = solution.groupAnagrams(strs);

        for(List<String> group : result){
            System.out.println(group);
        }

    }
}