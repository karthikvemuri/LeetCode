from typing import List

class ProductOfArrayExceptSelf:
    def productOfArrayExceptSelf(self, nums : List[int]) -> List[int]:
        result = [0] * len(nums)
        
        preProduct = 1
        postProduct = 1
        
        for i in range(len(nums)):
            result[i] = preProduct
            preProduct *= nums[i]
            
        for i in range(len(nums) - 1, -1, -1):
            result[i] *= postProduct
            postProduct *= nums[i]
            
        return result
    

if __name__ == "__main__":
    solution = ProductOfArrayExceptSelf()
    
    nums = [1, 2, 3, 4]
    print(solution.productOfArrayExceptSelf(nums))
    