class Solution {
    public int[][] reconstructQueue(int[][] people) {
        int[][] ans = new int[people.length][2];
        List<int[]> result = new ArrayList<>();
        boolean[] occupied = new boolean[people.length];
        Arrays.sort(people, (a, b) -> {
            
            if(a[0]==b[0])
            {
                return Integer.compare(a[1],b[1]);
            }
            else 
            {
                return Integer.compare(b[0], a[0]);
            }});
        for(int[] person:people)
        {
            result.add(person[1],person);
            
        }
        return result.toArray(new int[people.length][2]);


    }
}