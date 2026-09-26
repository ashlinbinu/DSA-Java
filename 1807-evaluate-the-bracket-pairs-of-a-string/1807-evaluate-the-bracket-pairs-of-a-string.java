class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String,String> map = new HashMap<>();
        for(int i = 0; i<knowledge.size();i++)
        {
            map.put(knowledge.get(i).get(0),knowledge.get(i).get(1));
        }//name:bob age:two
        String ans = "";
       int i = 0;

       while(i<s.length())
       {
        if(s.charAt(i)=='(')
        {
            String str2 = "";
            int a =i+1;
            for( ;a<s.length();a++)
            {
                if(s.charAt(a) == ')')
                {
                    break;
                }
                str2+=s.charAt(a);
               
                
            }
             ans+=map.getOrDefault(str2,"?");
            i=a+1;
            continue;
        }
        ans+=s.charAt(i);
        i++;

       }
       return ans;

    }
}