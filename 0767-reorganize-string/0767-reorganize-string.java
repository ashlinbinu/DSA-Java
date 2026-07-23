class Solution {
    public String reorganizeString(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0; i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(map.containsKey(ch))
            {
                int x = map.get(ch);
                
                map.put(ch,x+1);


            }
            else
            {
                map.put(ch,1);
            }
        }
        
        for(int i :map.values())
        {
            if(i >(s.length()+1)/2)
                {return "";}
        }

        PriorityQueue<Character> pq = new PriorityQueue<>((a,b)->
        {
            return map.get(b)-map.get(a);
        });

        pq.addAll(map.keySet());
        
        
        StringBuilder sb = new StringBuilder();
        while(pq.size()>1)
        {
            char ch = pq.poll();
            char ch2 = pq.poll();
            
            
            sb.append(ch);
            sb.append(ch2);
            
            int z= map.get(ch);
            map.put(ch,z-1);
            int y= map.get(ch2);
            map.put(ch2,y-1);
            if(map.get(ch)!=0){pq.offer(ch);}
            
            if(map.get(ch2)!=0){pq.offer(ch2);}

        }
        if(pq.size()==1)
        {
            
                sb.append(pq.poll());
        }
        return sb.toString();
    }
}