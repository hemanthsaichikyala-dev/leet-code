class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
         int n1 = landStartTime.length;
         int n2 = waterStartTime.length;
         int mini =Integer.MAX_VALUE;
    for(int i=0;i<n1;i++){
        int sum = landStartTime[i]+landDuration[i];
        for(int j=0;j<n2;j++){
            int finish=0;
            if(sum>waterStartTime[j]){
                finish=sum+waterDuration[j];
            }else{
                finish = waterStartTime[j]+waterDuration[j];
            }
           if(finish<mini)
           mini = finish;

        }

         }
         for(int i=0;i<n2;i++){
        int sum = waterStartTime[i]+waterDuration[i];
        for(int j=0;j<n1;j++){
            int finish=0;
            if(sum>landStartTime[j]){
                finish=sum+landDuration[j];
            }else{
                finish = landStartTime[j]+landDuration[j];
            }
           if(finish<mini)
           mini = finish;

        }

         }




         return mini;
        
        
    }
}