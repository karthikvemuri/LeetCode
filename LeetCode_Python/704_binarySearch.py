from typing import List

class BinarySearch:
    def binarySearch(self, nums: List[int], target: int) -> int:
        low = 0
        high = len(nums) - 1
        
        while low <= high:
            mid = (low + high) // 2
            
            if nums[mid] == target:
                return mid
            
            elif nums[mid] < target:
                low = mid + 1
                
            else:
                high = mid - 1
                
        return -1
    

if __name__ == "__main__":
    solution = BinarySearch()
    
    nums = [-1, 0, 3, 5, 9, 12]
    target = 9
    
    print(solution.binarySearch(nums, target))