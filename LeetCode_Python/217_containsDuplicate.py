from typing import List

class ContainsDuplicate:
    def containsDuplicate(self, nums : List[int]) -> bool:
        numsSet = set()

        for num in nums:
            if num in numsSet:
                return True
            else:
                numsSet.add(num)
        return False
    
if __name__ == "__main__":
    solution = ContainsDuplicate()
    nums = [1, 2, 3, 4, 5, 6, 5]

    print(solution.containsDuplicate(nums))




