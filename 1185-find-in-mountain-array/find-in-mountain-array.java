/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
     public int peakIndexInMountainArray(MountainArray mountainArr,int n) {
        
       int start=0;
       int end=n-1;
       while(start<end){
        int mid=start+(end-start)/2;
       if (mountainArr.get(mid) < mountainArr.get(mid + 1)) {
            start=mid+1;
        }else{
            end=mid;
        }
       }
       return start;
        
    }
    public int binarySearch(int start,int end,MountainArray mountainArr,int target,boolean asc){
        while(start<=end){
            int mid=start+(end-start)/2;
            int value=mountainArr.get(mid);
            if(value==target)return mid;
            if(asc){
                if(value<target){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }else{
                if(value<target){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }

        }
        return -1;
    }

    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n=mountainArr.length();
        int peakIdx=peakIndexInMountainArray(mountainArr,n);
        int searchLeftIdx=binarySearch(0,peakIdx,mountainArr,target,true);
        

        if(searchLeftIdx !=-1){
            return searchLeftIdx;
        }
        return binarySearch(peakIdx+1,n-1,mountainArr,target,false);
        

        
    }
}