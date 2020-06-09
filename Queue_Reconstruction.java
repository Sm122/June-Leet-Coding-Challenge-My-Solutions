class Solution {
    public int[][] reconstructQueue(int[][] people) {
        
        Arrays.sort(people,new Comparator<int[]>(){
            public int compare(int a[] ,int b[]){
                return a[0]!=b[0]?b[0]-a[0]:a[1]-b[1];
            }
        });
        List<int[]> res = new LinkedList<int[]>();
        for(int i =0;i<people.length;i++)
        {
            res.add(people[i][1],people[i]);
        }
        return res.toArray(people);
    }
}