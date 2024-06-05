import java.util.*;

class ValidParentheses{

    public boolean validParentheses(String s){
        Stack<Character> charStack = new Stack<>();
        Map<Character, Character> charMap = new HashMap<>();

        charMap.put(')', '(');
        charMap.put(']', '[');
        charMap.put('}', '{');

        for(char c : s.toCharArray()){
            if(charMap.containsKey(c)){
                if(!charStack.isEmpty() && charStack.peek() == charMap.get(c)){
                    charStack.pop();
                } 
                else{
                    return false;
                }
            } else{
                charStack.push(c);
            }
        }

        return charStack.isEmpty();

    }

    public static void main(String[] args){
        ValidParentheses solution = new ValidParentheses();
        String s = "()[]{}";
        System.out.println(solution.validParentheses(s));
    }  
}
