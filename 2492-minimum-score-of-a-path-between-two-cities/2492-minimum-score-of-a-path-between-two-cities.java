import java.util.*;

class Solution {
    public int minScore(int n, int[][] roads) {
        // Step 1: Build the adjacency list for the graph
        // Each node maps to a list of pairs: [neighbor, road_distance]
        Map<Integer, List<int[]>> graph = new HashMap<>();
        for (int[] road : roads) {
            graph.computeIfAbsent(road[0], k -> new ArrayList<>()).add(new int[]{road[1], road[2]});
            graph.computeIfAbsent(road[1], k -> new ArrayList<>()).add(new int[]{road[0], road[2]});
        }
        
        // Step 2: BFS to traverse the connected component containing city 1
        int minScore = Integer.MAX_VALUE;
        boolean[] visited = new boolean[n + 1];
        Queue<Integer> queue = new LinkedList<>();
        
        queue.offer(1);
        visited[1] = true;
        
        while (!queue.isEmpty()) {
            int current = queue.poll();
            
            // If the node has no neighbors, skip
            if (!graph.containsKey(current)) continue;
            
            for (int[] neighborInfo : graph.get(current)) {
                int neighbor = neighborInfo[0];
                int distance = neighborInfo[1];
                
                // Track the minimum edge weight seen in this entire component
                minScore = Math.min(minScore, distance);
                
                // Only queue the neighbor if it hasn't been visited yet
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.offer(neighbor);
                }
            }
        }
        
        return minScore;
    }
}