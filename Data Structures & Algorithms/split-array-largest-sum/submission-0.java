class Solution {
    public int splitArray(int[] nums, int k) {
        int l = nums.length;
        int left = 0;
        int right = 0;
        for(int num: nums){
            left = Math.max(left,num);
            right += num;
        }
        int result = 0;
        while(left<=right){
            int mid = (left+right)/2;
            if(cansplit(nums,mid,k)){
                result = mid;
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return result;
    }

    private boolean cansplit(int[] nums,int sum,int splits){
        int curSum = 0;
        int subArrays = 1;
        for(int num : nums){
            curSum += num;
            if(curSum > sum){
                subArrays++;
                if(subArrays > splits) return false;
                curSum = num;
            }
        }
        return true;
    }
}