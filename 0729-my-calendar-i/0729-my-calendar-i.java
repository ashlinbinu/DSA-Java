class MyCalendar {
 public List<int[]> myCalender;
    public MyCalendar() {
        
        
        this.myCalender  = new ArrayList<>();
        
    }
    
    public boolean book(int startTime, int endTime) {
        if(myCalender.size() == 0)
        {
            myCalender.add(new int[]{startTime,endTime});
            return true;
        }
        else
        {
            for(int i = 0; i< myCalender.size();i++)
            {
                if(startTime<myCalender.get(i)[1] && endTime>myCalender.get(i)[0])
                {return false;}
                
                
            }
            myCalender.add(new int[]{startTime,endTime});
            return true;
        }
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(startTime,endTime);
 */