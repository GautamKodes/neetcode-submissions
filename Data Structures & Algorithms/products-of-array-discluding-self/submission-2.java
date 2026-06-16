class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        if (len == 1){
            return new int[] {nums[0]};
        }
        int j = 0;
        int product = 1;
        // while (nums[j] == 0){
        //     j++;
        // }
        // product = nums[j];
        int zero = 0;
        boolean nonzero = false;
        for (int i = 0; i<len; i++){
            if (nums[i] != 0){
                nonzero = true;
                product *= nums[i];
            } else {
                zero++;
            }
        }
        System.out.println("Product: " + product);
        int[] productarr = new int[len];
        if (zero == 1 && nonzero){
            System.out.println("Zero found");
            for (int i = 0; i<len; i++){
                if (nums[i] == 0){
                    productarr[i] = product;
                } else {
                    productarr[i] = 0;
                }
            }
        } else if (zero>1 || !nonzero){
            for (int i = 0; i<len; i++){
                    productarr[i] = 0;
            }
        } 
        else {
            for (int i = 0; i<len; i++){
                    productarr[i] = product/nums[i];
            }
        }
        return productarr;
    }
}  
