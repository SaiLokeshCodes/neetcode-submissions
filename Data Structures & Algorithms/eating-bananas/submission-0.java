class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int max = 0;
        for(int i=0;i<n;i++){
            max = Math.max(max,piles[i]);
        }
        int l = 1;
        int r = max;
        int res = 0;
        while(l<=r){
            int mid = (l+r)/2;
            int rate = solve(piles,mid);
            System.out.println(rate);
            if(rate<=h){
                r=mid-1;
                res = mid;
            }else{
                l=mid+1;
            }
        }
        return res;
    }

    private int solve(int[] piles,int rate){
        int h = 0;
        for(int i=0;i<piles.length;i++){
            if(piles[i]/rate < 1){
                h++;
            }else if(piles[i]%rate == 0){
                h+=(piles[i]/rate);
            }else{
                h+=(piles[i]/rate)+1;
            }
        }
        return h;
    }
}
