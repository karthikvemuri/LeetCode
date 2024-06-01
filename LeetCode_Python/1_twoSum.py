from typing import List


class TwoSum:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        numsMap = {}

        for i in range(len(nums)):
            complement = target - nums[i]

            if complement in numsMap:
                return [numsMap[complement], i]

            numsMap[nums[i]] = i
            
if __name__ == "__main__":
    solution = TwoSum()
    nums = [2, 7, 11, 15]
    target = 9
    
    print(solution.twoSum(nums, target))
    
    