import java.util.*;

class ValidAnagram{
    public boolean validAnagram(String s, String t){

        if(s.length() != t.length()){
            return false;
        }

        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();

        for(int i = 0; i < s.length(); i ++){
            sMap.put(s.charAt(i),sMap.getOrDefault(s.charAt(i), 0) + 1);
            tMap.put(t.charAt(i),tMap.getOrDefault(t.charAt(i), 0) + 1);
        }

        return sMap.equals(tMap);

    }

    public static void main(String[] args){
        ValidAnagram solution = new ValidAnagram();

        String s = "anagram";
        String t = "nagaram";

        System.out.println(solution.validAnagram(s, t));
    }
}