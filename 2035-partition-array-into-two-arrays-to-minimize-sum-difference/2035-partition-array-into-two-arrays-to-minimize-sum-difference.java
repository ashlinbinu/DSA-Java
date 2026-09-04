class Solution {
    public int minimumDifference(int[] nums) {
        int n = nums.length/2 ;
        int sum =0;
        
        int[] n1 = new int[n];
        int[] n2 = new int[n];
        for(int i = 0; i< n;i++)
        {
            n1[i] = nums[i];
            n2[i] = nums[n+i];
            sum+=nums[i];
            sum+=nums[n+i];
        }

        List<List<Integer>> first = new ArrayList<>();
        List<List<Integer>> second = new ArrayList<>();

        for(int i= 0; i<= n;i++)
        {
            first.add(new ArrayList<>());
            second.add(new ArrayList<>());
        }
       for(int a=0; a< Math.pow(2,n);a++)
       {
        int temp = a;
        int s=0;
        int set = 0;
        int x = n-1;
        while(temp>0 && x>=0)
        {
            if((temp&1) == 1)
            {
                s+=n1[x];
                set++;
            }
            temp=temp>>1;
            x--;
        }
        first.get(set).add(s);
       }
        
       for(int a=0; a< Math.pow(2,n);a++)
       {
        int temp = a;
        int s=0;
        int set = 0;
        int x = n-1;
        while(temp>0 && x>=0)
        {
            if((temp&1) == 1)
            {
                s+=n2[x];
                set++;
            }
            temp=temp>>1;
            x--;
        }
        second.get(set).add(s);
       }


        for (int i = 0; i <= n; i++) {
            Collections.sort(second.get(i));
        }
        int ans = Integer.MAX_VALUE;
       for(int i= 0; i<= n;i++)
       {
           List<Integer> list1 = first.get(i);
            List<Integer> list2 = second.get(n - i);

           for(int a: list1)
           {
            int target= (sum/2)-a;
            int index= Collections.binarySearch(list2,target);

            if(index>=0)
            {
                int b = list2.get(index);
                ans = Math.min(ans,Math.abs(sum - 2 * (a + b)));
            }
            else
            {
                int insertion = -index - 1;
            
            // Check element at insertionPoint (smallest element >= target)
            if (insertion < list2.size()) {
                        int b = list2.get(insertion);
                        ans = Math.min(ans, Math.abs(sum - 2 * (a + b)));
                    }

                    // Check element right before insertionPoint (largest element < target)
                    if (insertion - 1 >= 0) {
                        int b = list2.get(insertion - 1);
                        ans = Math.min(ans, Math.abs(sum - 2 * (a + b)));
                    }
           } 
       }




    }
    return ans;
}
}