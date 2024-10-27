class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int lsum=0,rsum=0,maxsum=0;

        for(int i=0;i<k;i++){
            lsum+=cardPoints[i];
        }
        maxsum=lsum;
        int right=cardPoints.length-1;
        for(int j=k-1;j>=0;j--){
            lsum-=cardPoints[j];
            rsum+=cardPoints[right];
            right--;
            maxsum=Math.max(maxsum,lsum+rsum);
        }
       return  maxsum;
        
    }
    
}