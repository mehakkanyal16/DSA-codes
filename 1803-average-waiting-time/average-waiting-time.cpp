class Solution {
public:
    double averageWaitingTime(vector<vector<int>>& customers) {
         int n=customers.size();
         double total_WT=0;
         int current_time=0;
         for(int i=0;i<n;i++){
            int arrival=customers[i][0];
            int service=customers[i][1];
            if(current_time<arrival){
                current_time=arrival;
            }
            int waiting_time=current_time-arrival+service;
            total_WT+=waiting_time;
            current_time+=service;

         }
         return total_WT/n;
        
    }
};