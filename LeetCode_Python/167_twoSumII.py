from typing import List
class TwoSumII:
    def twoSumII(self, nums: List[int], target : int)-> List[int]:

        left = 0
        right = len(nums) - 1

        while left < right:
            sum = nums[left] + nums[right]

            if sum == target:
                return [left + 1, right + 1]
            
            elif sum < target:
                left += 1

            else:
                right -= 1

if __name__ == "__main__":
    solution = TwoSumII()

    nums = [2, 7, 11, 15]
    target = 17

    print(solution.twoSumII(nums, target))

    