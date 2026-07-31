class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if(!wordList.contains(endWord)){return 0;}
        if(beginWord.equals(endWord)) return 1;

        //make a map 
        HashMap<String,ArrayList<String>> map = new HashMap<>();
        if(!wordList.contains(beginWord)){wordList.add(beginWord);}
        for(int i = 0 ; i< wordList.size();i++)
        {
            String st = wordList.get(i);

            for(int j = 0 ; j<st.length();j++)
            {
                String s = "";
                for(int k = 0; k<st.length();k++)
                {
                    if(j==k)
                    {
                        s+="*";
                    }
                    else
                    {
                        s+=st.charAt(k);
                    }}
                    if(map.containsKey(s) == false)
                    {
                        map.put(s,new ArrayList<>());
                    
                    }
                
                    
                        map.get(s).add(st);
                    }
                }

            

        

        //do bfs traversal

        Queue<String> q = new LinkedList<>();
        HashSet<String> vis = new HashSet<>();
        int level = 1;
        q.offer(beginWord);
        vis.add(beginWord);

        while(!q.isEmpty())
        {
            int n = q.size();
            for(int i = 0;i<n;i++)
            {
                String curr = q.poll();

            
             if (curr.equals(endWord))
                    return level;
            char[] arr =  curr.toCharArray();;
            for(int j  = 0; j< arr.length;j++)
            {
                char temp = arr[j];
                arr[j] = '*';

                String s = new String(arr);// * I T
                ArrayList<String> innerlist = map.get(s);

                if(innerlist != null)
                {
                    for(String a: innerlist)
                    {
                        if(vis.contains(a) == false)
                        {q.offer(a);
                        vis.add(a);}

                    }
                    innerlist.clear();
                }
                arr[j] = temp;
                


            }


        }
        level+=1;}


        

        return 0;
    }
}