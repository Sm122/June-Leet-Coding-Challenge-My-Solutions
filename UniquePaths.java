class Solution {
    public int uniquePaths(int m, int n) {
       int paths[][] = new int[m][n];
        for(int i =0;i<m;i++)
            paths[i][0]=1;
        for(int j =0;j<n;j++)
            paths[0][j]=1;
        for(int p=1;p<m;p++)
        {
            for(int q=1;q<n;q++)
            {
                paths[p][q]=paths[p-1][q]+paths[p][q-1];
            }
        }
        return paths[m-1][n-1];
        
        
    }
}