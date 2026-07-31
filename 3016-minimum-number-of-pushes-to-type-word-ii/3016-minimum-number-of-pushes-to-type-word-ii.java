class Solution {
    public int minimumPushes(String word) {
        
        int[] arr = new int[26];
        
        int count = 0;
        for(int i = 0 ; i<word.length();i++ )//aabsssbsbb
        {
             char ch = word.charAt(i);//a
            if(arr[ch-'a'] == 0){count++;
            arr[ch-'a']=1;}
            else{
                int x= arr[ch-'a']+1;
           arr[ch-'a'] = x;}
            
            
        }

        Arrays.sort(arr);
        for (int i = 0; i < arr.length / 2; i++) {
    int temp = arr[i];
    arr[i] = arr[arr.length - 1 - i];
    arr[arr.length - 1 - i] = temp;
}
         int p = 0;
        int i = 0;
        while(i<count){
            if(count>24 && count<=26)
            {p +=arr[count-1]*4;
                count--;}
            else if(count>16 && count<=24)
            {p +=arr[count-1]*3;
                count--;}
            else if(count>8 && count<=16)
            {p +=arr[count-1]*2;
                count--;}
            else if(count<=8)
            {
                p +=arr[count-1];
                count--;
                
            }
            
            
        }
        return p;
        
    }
}