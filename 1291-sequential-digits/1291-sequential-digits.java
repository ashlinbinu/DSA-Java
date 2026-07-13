class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> list = new ArrayList<>();
        String check = "123456789";
        
        int shorter = (String.valueOf(low)).length();
        int longer = (String.valueOf(high)).length();
        for(int i = shorter;i<=longer;i++)
        {
           
        for(int left = 0;left+i<=check.length();left++)
        {
            String s = check.substring(left,left+i);
            int num = Integer.parseInt(s);
            if(num>=low && num<=high)
            {
                list.add(num);
                
                
                
            }
            
            
        }
        }
        return list;
    }
}