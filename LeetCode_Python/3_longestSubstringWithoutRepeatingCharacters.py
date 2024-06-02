class LongestSubstringWithoutRepeatingCharacters:
    def longestSubstringWithoutRepeatingCharacters(self, s:str) -> int: 
        wStart = 0
        result = 0
        charSet = set()

        for wEnd in range(len(s)):
            while s[wEnd] in charSet:
                charSet.remove(s[wStart])
                wStart += 1

            charSet.add(s[wEnd])

            result = max(result, wEnd - wStart + 1)

        return result
    
if __name__ =="__main__":
    solution = LongestSubstringWithoutRepeatingCharacters()
    s = "pwwkew"
    
    print(solution.longestSubstringWithoutRepeatingCharacters(s))