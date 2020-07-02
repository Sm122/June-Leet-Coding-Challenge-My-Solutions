class Solution {
    public String getPermutation(int n, int k) {
      int fact[] = new int[n+1];
      List<Integer> list = new ArrayList<Integer>();
        StringBuilder sb = new StringBuilder();
        int sum =1;
        fact[0]=1;
        for(int i =1;i<=n;i++)
        {
           sum*=i;
           fact[i]=sum;
            list.add(i);
            
        }
        k=k-1;
        for(int j =1;j<=n;j++)
        {
            int a = k/fact[n-j];
            sb.append(String.valueOf(list.get(a)));
            list.remove(a);
            k=k-a*fact[n-j];
        }
        return sb.toString();
        
        
    }
}