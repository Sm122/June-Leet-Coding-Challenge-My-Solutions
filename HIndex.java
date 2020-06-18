class Solution {
    public int hIndex(int[] citations) {
       int l =0;
        int h = citations.length-1;
        while(l<=h)
        {
            int m =(l+h)/2;
            if(citations[m]==citations.length-m)
                return citations.length-m;
            else if(citations[m]<citations.length-m)
            {
                l=m+1;
                continue;
            }
            else
                h=m-1;
        }
        return citations.length-(h+1);
        
    }
}