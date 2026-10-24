class LRUCache {
    List<int[]> list = new ArrayList<>();
    int cap = 0;
    int time = 0;
    public LRUCache(int capacity) {
        cap = capacity;
        time++;
    }
    
    public int get(int key) {
        time++;
        for(int i = 0; i< list.size();i++)
        {
            if(list.get(i)[0] == key)
            {
                list.get(i)[2]= time;
                return list.get(i)[1];
            }
        }
        return -1;
    }
    
    public void put(int key, int value) {
        time++;
        boolean flag= false;
         //case 1 its already present just update
            for(int i = 0; i<list.size();i++)
            {
                if(list.get(i)[0] == key)
            {
                list.get(i)[2]= time;
                list.get(i)[1] = value;
                flag = true;
                break;
            }
            }
        if(!flag)
        {
            if(list.size()<cap)
        {
            list.add(new int[]{key,value,time});
        }else if(list.size() == cap)
        {
            

           
            //case 2 remove 
            int m_t_ind = 0;
            for(int i = 0; i< list.size();i++)
            {
                if(list.get(i)[2]<list.get(m_t_ind)[2])
                {
                    m_t_ind= i;
                }
            }
            list.get(m_t_ind)[0] = key;
            list.get(m_t_ind)[1] = value;
            list.get(m_t_ind)[2] = time;
        }
        }
        

    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */