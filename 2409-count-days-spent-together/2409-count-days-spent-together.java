class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int[] days = new int[]{0,31,28,31,30,31,30,31,31,30,31,30,31};
        
        for(int i = 1; i<days.length;i++)
        {
            days[i] +=days[i-1];
            
        }
        
        int aAmonth = Integer.valueOf(arriveAlice.substring(0,2));
        int aAdate = Integer.valueOf(arriveAlice.substring(3,5));
        int aA= days[aAmonth-1]+aAdate;

        int aBmonth = Integer.valueOf(arriveBob.substring(0,2));
        int aBdate = Integer.valueOf(arriveBob.substring(3,5));
        int aB= days[aBmonth-1]+aBdate;

        int lAmonth = Integer.valueOf(leaveAlice.substring(0,2));
        int lAdate = Integer.valueOf(leaveAlice.substring(3,5));
        int lA= days[lAmonth-1]+lAdate;
        int lBmonth = Integer.valueOf(leaveBob.substring(0,2));
        int lBdate = Integer.valueOf(leaveBob.substring(3,5));
        int lB= days[lBmonth-1]+lBdate;
       

       int arrive = Math.max(aA,aB);
       int depart = Math.min(lA,lB);
       return Math.max(depart-arrive+1,0);




        
    }
}