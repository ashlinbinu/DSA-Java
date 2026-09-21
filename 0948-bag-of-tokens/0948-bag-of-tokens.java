class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        if(tokens.length==0){return 0;}
        Arrays.sort(tokens);
        int a = 0;
        int b = tokens.length-1;
        int score = 0;
        int maxscore =0;
         if(tokens[0]>power)
           {
                return 0;
           }
        while(a<=b)
        {
            
           if(tokens[a]<=power)
           {
            score= Math.max(score,score+1);
            
            power -=tokens[a];
            a++;
           }
           else
           {
            score--;
            power+=tokens[b];
            b--;

           }
           maxscore= Math.max(maxscore,score);
          

          
        }
        return maxscore;
    }
}