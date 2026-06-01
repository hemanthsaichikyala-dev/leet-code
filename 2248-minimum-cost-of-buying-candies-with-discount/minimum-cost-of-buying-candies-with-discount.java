class Solution {
    public int minimumCost(int[] cost) {
        for(int i=0;i<cost.length-1;i++){
            for(int j=0;j<cost.length-i-1;j++){
                if(cost[j]<cost[j+1]){
                    int temp = cost[j];
                    cost[j]=cost[j+1];
                    cost[j+1]=temp;
                }

            }
        }
        int mincost=0;
        for(int i=0;i<cost.length;i++){
            if((i+1)%3!=0){
                mincost+=cost[i];
            }

        }
        return mincost;
        
    }
}