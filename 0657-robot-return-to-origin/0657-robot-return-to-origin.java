class Solution {
    public boolean judgeCircle(String moves) {
        int u = 0;
        int v = 0;
        for(int i = 0; i< moves.length();i++)
        {
            if(moves.charAt(i) == 'U')
            {
                v++;
            }
            else if(moves.charAt(i) == 'D')
            {
                v--;
                
            }
            else if(moves.charAt(i) == 'L')
            {
                u--;
                
            }
            else if(moves.charAt(i) == 'R')
            {
                u++;
                
            }
        }
        if(u==0 && v==0)
        {
            return true;
        }
        return false;
    }
}