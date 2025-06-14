class Solution {
    public int minMaxDifference(int num) {
        String s=Integer.toString(num);
        int maxVal=num;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='9')continue ;
            String maxStr=s.replace(ch,'9');
            maxVal=Math.max(maxVal,Integer.parseInt(maxStr));
            break;
        }
         int minVal=num;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='0')continue ;
            String minStr=s.replace(ch,'0');
            minVal=Math.min(minVal,Integer.parseInt(minStr));
            break;
        }
        return maxVal-minVal;

        
    }
}