import java.util.Arrays;

class ProductOfArrayExceptSelf{
    public int[] productOfArrayExceptSelf(int[] nums){

        int[] result = new int[nums.length];

        int preProduct = 1;
        int postProduct = 1;

        for(int i = 0 ; i < nums.length; i++){
            result[i] = preProduct;
            preProduct = preProduct * nums[i];
        }

        for(int i = nums.length - 1; i >= 0; i--){
            result[i] = result[i] * postProduct;
            postProduct = postProduct * nums[i];
        }

        return result;
    }

    public static void main(String[] args){
        ProductOfArrayExceptSelf solution = new ProductOfArrayExceptSelf();

        int[] nums = {1, 2, 3, 4};
        int[] result = solution.productOfArrayExceptSelf(nums);

        System.out.println(Arrays.toString(result));
    }
}