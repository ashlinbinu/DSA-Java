class Solution {
    public double mincostToHireWorkers(int[] quality, int[] wage, int k) {

        //REALLY GOOD QUESTION GO THROUGH IT
    
        List<double[]> output = new ArrayList<>();
        for(int i = 0 ; i< wage.length;i++)
        {
            output.add(new double[]{(double)wage[i]/quality[i],quality[i]});
        }
        Collections.sort(output, (a, b) -> {
    return Double.compare(a[0],b[0]);
});
PriorityQueue<double[]> pq = new PriorityQueue<>((a, b) -> Double.compare(b[1], a[1]));

long tquality = 0;
double result = Double.MAX_VALUE;
for(int i = 0; i< output.size();i++)
{
   pq.offer(output.get(i));
   tquality+=output.get(i)[1];
  
   if(pq.size()>k)
   {
    double[] a = pq.poll();
    tquality-=a[1];
   }
    if(pq.size()==k)
   {
    result = Math.min(result,tquality*output.get(i)[0]);
   }
}
return result;

      
      

          }
}