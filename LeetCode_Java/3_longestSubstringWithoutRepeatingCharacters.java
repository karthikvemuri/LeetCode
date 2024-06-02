import java.util.HashSet;
import java.util.Set;

class LongestSubstringWithoutRepeatingCharacters{
    public int longestSubstringWithoutRepeatingCharacters(String s){

        int wStart = 0;
        int result = 0;
        Set<Character> charSet = new HashSet<>();

        for(int wEnd = 0; wEnd < s.length(); wEnd++){
            while(charSet.contains(s.charAt(wEnd))){
                charSet.remove(s.charAt(wStart));
                wStart++;
            }

            charSet.add(s.charAt(wEnd));
            result = Math.max(result, wEnd - wStart + 1);
        }

        return result;

    }

    public static void main(String[] args){
        LongestSubstringWithoutRepeatingCharacters solution = new LongestSubstringWithoutRepeatingCharacters();
        String s = "pwwkew";

        System.out.println(solution.longestSubstringWithoutRepeatingCharacters(s));

    }
}