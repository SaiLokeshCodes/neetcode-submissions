class Solution {
    public int mySqrt(int x) {
        if(x == 0) return 0;
        if(x==1 || x == 2 || x == 3) return 1;
        int l = 0;
        int r = x/2;
        int res = 0;
        while(l<=r){
            int mid = l+((r-l)/2);
            long y =(long) mid*mid;
            if(y == x){
                return mid;
            }else if(y<x){
                l=mid+1;
                res = mid;
            }else{
                r=mid-1;
            }
        }
        return res;
    }
}