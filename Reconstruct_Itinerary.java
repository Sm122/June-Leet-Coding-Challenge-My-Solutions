class Solution {
    public List<String> findItinerary(List<List<String>> tickets) {
        HashMap<String,PriorityQueue<String>> goal = new HashMap<>();
        for(List<String> ticket : tickets)
        {
            goal.computeIfAbsent(ticket.get(0),k -> new PriorityQueue()).add(ticket.get(1));
        }
        Stack<String> stack = new Stack<String>();
        List<String> result = new LinkedList<>();
        stack.push("JFK");
        while(!stack.isEmpty())
        {
           // result.add(0,stack.peek());
           while(goal.containsKey(stack.peek()) && !goal.get(stack.peek()).isEmpty())
           {
               stack.push(goal.get(stack.peek()).poll());
           }
            result.add(0,stack.pop());
            
        }
        
        
     return result;   
    }
}