class Solution {
    public int maxDistance(int[] colors) {
        // 1 1 1 6 1 1 1
        // 
        //

        int left = 0;
        int right = colors.length-1;
        int max1 = 0;
        while(left<=right)
        {
            if(colors[left]!=colors[right])
            {
                // max = Math.max(Math.abs(left-right),max);
                // left++;
                max1= (Math.abs(left-right));
                break;
            }
            else if(colors[left]==colors[right])
            {
                right--;
            }
        }

        int max2=0;
        int left2 = 0;
        int right2 = colors.length-1;

        while(left2<=right2)
        {
            if(colors[left2]!=colors[right2])
            {
                // max = Math.max(Math.abs(left-right),max);
                // left++;
                max2= (Math.abs(left2-right2));
                break;
            }
            else if(colors[left2]==colors[right2])
            {
                left2++;
            }

        }

        return Math.max(max1,max2);
    }
}