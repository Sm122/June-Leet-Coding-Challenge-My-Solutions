class Solution {
    public int calculateMinimumHP(int[][] dungeon) {
       if(dungeon==null || dungeon.length==0 || dungeon[0].length==0)
          return 0;
          int m = dungeon.length;
          int n = dungeon[0].length;
          int health[][] = new int[m][n];
          health[m-1][n-1] = Math.max(1-dungeon[m-1][n-1],1);
          for(int i=m-2;i>=0;i--)
          {
              health[i][n-1]=Math.max(health[i+1][n-1]-dungeon[i][n-1],1);
          }
          for(int j=n-2;j>=0;j--)
          {
              health[m-1][j]=Math.max(health[m-1][j+1]-dungeon[m-1][j],1);
          }
          for(int p =m-2;p>=0;p--){
              for(int q =n-2;q>=0;q--)
              {
                int right = Math.max(health[p][q+1]-dungeon[p][q],1);
                 int down = Math.max(health[p+1][q]-dungeon[p][q],1);
                  health[p][q]=Math.min(right,down);
              }
          }
          return health[0][0];
    }
}