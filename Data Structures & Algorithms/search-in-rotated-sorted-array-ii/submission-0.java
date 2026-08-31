class Solution {
    public boolean search(int[] nums, int target) {
        int n = nums.length;
        int l = 0, r = n-1;
        while(l<=r){
            int m = (l+r)/2;
            if(nums[m] == target){
                return true;
            }
            if(nums[l] < nums[m]){
                if(target >= nums[l] && target < nums[m]){
                    r = m-1;
                }else{
                    l = m+1;
                }
            }else if(nums[l] > nums[m]){
                if(nums[m] < target && nums[r] >= target){
                    l = m+1;
                }else{
                    r = m-1;
                }
            }else{
                l++;
            }
        }
        return false;
    }
}