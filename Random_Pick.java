class Solution {
    public double p[];
    public Solution(int[] w) {
      double sum = 0;
      p= new double[w.length];
      for(int wt : w)
      {
          sum+=wt;
      }
      for(int i =0;i<w.length;i++)
      {
        w[i]+=(i==0)?0:w[i-1];
          p[i]=w[i]/sum;
      }
    }
    
    public int pickIndex() {
      return Math.abs(Arrays.binarySearch(this.p,Math.random()))-1;
    }
}
