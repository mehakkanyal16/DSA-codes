class Solution {
public:
    vector<int> intersection(vector<int>& nums1, vector<int>& nums2) {
        vector<int>intersectionresult;
        for(int i=0;i<nums1.size();i++){
            bool isduplicate=false;
            for(int j=0;j<intersectionresult.size();j++){
                if(nums1[i]==intersectionresult[j]){
                    isduplicate=true;
                    break;
                }
            }
        
            if(!isduplicate){
            for(int k=0;k<nums2.size();k++){
                if(nums1[i]==nums2[k]){
                    intersectionresult.push_back(nums1[i]);
                    break;
                }
            }
        }
        }

       return intersectionresult; 
        
    }
};