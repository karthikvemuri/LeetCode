class ValidParentheses:
    def validParentheses(self, s : str) -> bool:
        charStack = []

        charMap = {')' : '(', ']' : '[', '}' : '{' }

        for char in s:
            if char in charMap:
                if charMap and charMap[char] == charStack[-1]:
                    charStack.pop()

                else:
                    return False
            else:
                charStack.append(char)
        
        return True if not charStack else False
    

if __name__ == "__main__":
    solution = ValidParentheses()

    s = "()[]{}"

    print(solution.validParentheses(s))

