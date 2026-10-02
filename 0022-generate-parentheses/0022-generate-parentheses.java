class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        
        StringBuilder sb = new StringBuilder();
        helper(0,0,list,n,sb);
        return list;
    }

    public void helper(int opencount, int closecount , List<String> list, int n ,StringBuilder temp)
    {
        
        if(opencount==n && closecount==n)
        {
            list.add(temp.toString());
            return ;
        }
        
        //open bracket 
        if(opencount<n)
        {
           
            temp.append("(");
            helper(opencount+1,closecount,list,n,temp);
            temp.deleteCharAt(temp.length()-1);

        }
        //close bracket
        if(closecount<opencount)
        {
           
            temp.append(")");
            helper(opencount,closecount+1,list,n,temp);
            temp.deleteCharAt(temp.length()-1);
        }
    }
}