from typing import List

class TopKFrequentElements:
    def topKFrequentElements(self, nums : List[int], k : int) -> List[int]:

        result = []
        countMap = {}
        freqCount = [[] for i in range(len(nums) + 1)]

        for num in nums:
            countMap[num] = 1 + countMap.get(num, 0)


        for num, count in countMap.items():
            freqCount[count].append(num)

         
        for i in range(len(freqCount) - 1, 0, -1):
            for j in freqCount[i]:
                result.append(j)

            if len(result) == k:
                return result
            
if __name__ == "__main__":
    solution = TopKFrequentElements()

    nums = [1, 1, 1, 2, 2, 3]
    k = 2

    print(solution.topKFrequentElements(nums, k))