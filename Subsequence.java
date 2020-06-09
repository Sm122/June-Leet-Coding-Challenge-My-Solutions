class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0)
            return true;
     int i=0;
     int count=0;
     int max=Integer.MIN_VALUE;
     for(int j =0;j<t.length();j++)
     {
         if(s.charAt(i)==t.charAt(j))
         {
            count++;
             i++;
             if(j>max)
                 max=j;
             else{
                 break;
             }
         }
         if(i==s.length())
             break;
     }
        if(count==s.length())
            return true;
        else
            return  false;
    }
}