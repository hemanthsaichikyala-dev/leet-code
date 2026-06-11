class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n =cardPoints.length;
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=cardPoints[i];
        }
        int maxi=sum;
        for(int i=0;i<k;i++){
            sum = sum-cardPoints[k-i-1]+cardPoints[n-i-1];

            if(sum>maxi)
            maxi=sum;
        }
        return maxi;
    }
}