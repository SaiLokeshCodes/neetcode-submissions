class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int l = 0;
        int r = 0;
        for(int i=0;i<n;i++){
            l = Math.max(l,weights[i]);
            r+=weights[i];
        }
        int res = r;
        while(l<=r){
            int cap = (l+r)/2;
            if(canShip(weights,days, cap)){
                res = Math.min(res,cap);
                r = cap-1;
            }else{
                l = cap+1;
            }
        }
        return res;
    }

    private boolean canShip(int[] weights,int days, int cap){
        int ships = 1, currCap = cap;
        for(int w: weights){
            if(currCap-w < 0){
                ships++;
                if(ships > days){
                    return false;
                }
                currCap = cap;
            }
            currCap -= w;
        }
        return true;
    }
}