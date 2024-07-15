class Solution {
    public int minCostToMoveChips(int[] position) {
        int e=0;
        int o=0;
        for(int pos:position){
            if(pos%2==0){
                e++;
            }
            else{
                o++;
            }

        }
        return Math.min(e,o);
    }
}