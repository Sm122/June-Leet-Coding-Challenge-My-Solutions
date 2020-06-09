class Solution {
    public int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs, new Comparator<int[]>(){
            public int compare(int a[],int b[])
            {
                return (a[1]-a[0])-(b[1]-b[0]);
            }
        });
        int result=0;
        for(int i =0;i<costs.length/2;i++)
        {
           result+=costs[i][1]+costs[costs.length-i-1][0]; 
        }
        return result;
    }
}