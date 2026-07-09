import java.util.*;

class Solution {
    public int[] dijkstra(int src, int n, ArrayList<ArrayList<int[]>> adj) {
        // Min-Heap to store pairs of {node, current_distance} sorted by distance
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        
        // Size n + 1 so we can safely use 1-based indexing (1 to n)
        int[] time = new int[n + 1]; 
        Arrays.fill(time, Integer.MAX_VALUE);
        
        time[src] = 0;
        pq.offer(new int[]{src, 0});
        
        while (!pq.isEmpty()) {
            int[] pair = pq.poll();
            int u = pair[0];
            int d = pair[1];
            
            // If we found a shorter path to u already, skip this older entry
            if (d > time[u]) continue; 
            
            // Explore neighbors
            for (int[] neighbor : adj.get(u)) {
                int v = neighbor[0];
                int w = neighbor[1];
                
                if (time[u] + w < time[v]) {
                    time[v] = time[u] + w;
                    pq.offer(new int[]{v, time[v]});
                }
            }
        }
        return time;
    }

    public int networkDelayTime(int[][] times, int n, int k) {
        // Size n + 1 adjacency list to accommodate 1-based node labels
        ArrayList<ArrayList<int[]>> adj = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }
        
        // Build the graph directly using 1-based indexing
        for (int[] edge : times) {
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];
            adj.get(u).add(new int[]{v, w});
        }
        
        int[] minTime = dijkstra(k, n, adj);
        
        int maxDelay = 0;
        // Start from index 1 because node 0 is unused
        for (int i = 1; i <= n; i++) {
            // If any node is unreachable, return -1
            if (minTime[i] == Integer.MAX_VALUE) {
                return -1;
            }
            maxDelay = Math.max(maxDelay, minTime[i]);
        }
        
        return maxDelay;
    }
}