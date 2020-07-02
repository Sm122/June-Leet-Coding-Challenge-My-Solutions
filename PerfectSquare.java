class Solution {
    public int numSquares(int n) {
        if(n<=3)
            return n;
      int count[] =new int[n+1];
        count[0]=0;
        count[1]=1;
        count[2]=2;
        count[3]=3;
        for(int i=4;i<=n;i++)
        {
            count[i]=i;
            for(int x=1;x<=Math.ceil(Math.sqrt(i));x++)
            {
              int temp = x*x;
                if(temp>i)
                    break;
                else
                    count[i]=Math.min(count[i],1+count[i-temp]);
            }
        }
        return count[n];
        
    }
}