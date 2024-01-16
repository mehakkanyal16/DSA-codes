class Solution {
public:
    int maxProfit(vector<int>& arr) {
            int minPrice = INT_MAX;
        int maxProfit = 0;
        int n = arr.size();

        for (int i = 0; i < n; ++i) {
            if (arr[i] < minPrice) {
                minPrice = arr[i];
            } else if (arr[i] - minPrice > maxProfit) {
                maxProfit = arr[i] - minPrice;
            }
        }

        return maxProfit;
    
    }
};