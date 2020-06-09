class Solution {
    public boolean isPowerOfTwo(int n) {
        double res=0;
        int i =0;
        boolean st=false;
        while(res<=n)
        {
          res=Math.pow(2,i);
            if(res==n)
            {
              st=true;
                break;
            }
            i++;
        }
        return st;
    }
}