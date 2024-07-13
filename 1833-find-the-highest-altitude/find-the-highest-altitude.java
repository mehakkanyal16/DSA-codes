class Solution {
    public int largestAltitude(int[] gain) {
     int altitude=0;
     int highestAltitude=0;

     for(int i=0;i<gain.length;i++){
        altitude+=gain[i];
        if(altitude>highestAltitude){
            highestAltitude=altitude;
        }
     }
     return highestAltitude;

        
    }
}