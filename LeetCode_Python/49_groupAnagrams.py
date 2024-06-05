from collections import defaultdict
from typing import List


class GroupAnagrams:
    def groupAnagrams(self, strs : List[str]) -> List[List[str]]:
        
        anagramMap = defaultdict(list)
        
        for str in strs:
            countArray = [0] * 26
            
            for c in str:
                countArray[ord(c) - ord('a') ] += 1
                
            anagramMap[tuple(countArray)].append(str)
            
        return anagramMap.values()
    
if __name__ == "__main__":
    solution = GroupAnagrams()
    
    strs = ["eat","tea","tan","ate","nat","bat"]
    
    print(solution.groupAnagrams(strs))