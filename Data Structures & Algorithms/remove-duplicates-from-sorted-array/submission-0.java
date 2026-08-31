class Solution {
    public int removeDuplicates(int[] nums) {
        int l = nums.length;
        if(l==1) return 1;
        int k = 1;
        int i = 1;
        while(i<l){
            if(nums[i] != nums[i-1]){
                nums[k] = nums[i];
                k++;
            }
            i++;
        }
        return k;
    }
}