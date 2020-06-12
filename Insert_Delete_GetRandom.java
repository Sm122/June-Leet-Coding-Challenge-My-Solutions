class RandomizedSet {
    ArrayList<Integer> list;
    HashMap<Integer,Integer> hm;
   java.util.Random rand = new java.util.Random();
    /** Initialize your data structure here. */
    public RandomizedSet() {
      list = new ArrayList<Integer>();
      hm = new HashMap<Integer,Integer>();
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
       
        if(hm.containsKey(val))
            return false;
        
            hm.put(val,list.size());
            list.add(val);
            return true;                 
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
       
       if(!hm.containsKey(val))
            return false;          
          int k = hm.get(val);
           if(k<list.size()-1)
           {
           
           int t = list.get(list.size()-1);
    
           list.set(k,t);  
           hm.put(t,k);
       
           }
            list.remove(list.size()-1);
           hm.remove(val);
           return true;              
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
         return list.get(rand.nextInt(list.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
