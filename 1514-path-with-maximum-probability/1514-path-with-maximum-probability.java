import java.util.*;
//IMPORTANT
class Solution {
    static class Edge {
        int to;
        double logWeight; // Stores -log(prob)
        Edge(int to, double logWeight) {
            this.to = to;
            this.logWeight = logWeight;
        }
    }

    static class State {
        int node;
        double cost; // Stores accumulated -log cost
        State(int node, double cost) {
            this.node = node;
            this.cost = cost;
        }
    }

    public double maxProbability(int n, int[][] edges, double[] succProb, int start_node, int end_node) {
        // 1. Build the adjacency list with log weights
        List<List<Edge>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            double prob = succProb[i];
            
            // Handle edge case: if probability is 0, -log(0) is Infinity
            double logWeight = (prob == 0) ? Double.POSITIVE_INFINITY : -Math.log(prob);
            
            adj.get(u).add(new Edge(v, logWeight));
            adj.get(v).add(new Edge(u, logWeight));
        }

        // 2. Standard Min-Heap (Closest/lowest cost first)
        PriorityQueue<State> pq = new PriorityQueue<>((a, b) -> Double.compare(a.cost, b.cost));

        // 3. Track min cost to reach each node (Initialize to Infinity)
        double[] minCost = new double[n];
        Arrays.fill(minCost, Double.POSITIVE_INFINITY);
        
        // Base case: start node cost is -log(1.0) = 0.0
        minCost[start_node] = 0.0;
        pq.offer(new State(start_node, 0.0));

        while (!pq.isEmpty()) {
            State current = pq.poll();
            int u = current.node;
            double currCost = current.cost;

            if (u == end_node) break;
            if (currCost > minCost[u]) continue;

            for (Edge edge : adj.get(u)) {
                int v = edge.to;
                // Standard Dijkstra addition logic
                if (minCost[u] + edge.logWeight < minCost[v]) {
                    minCost[v] = minCost[u] + edge.logWeight;
                    pq.offer(new State(v, minCost[v]));
                }
            }
        }

        // 4. Convert the final min log cost back to a normal probability
        // If unreachable, cost stays Infinity, e^(-Infinity) = 0.0
        if (minCost[end_node] == Double.POSITIVE_INFINITY) {
            return 0.0;
        }
        
        // Inverse of -log(p) is e^(-cost)
        return Math.exp(-minCost[end_node]);
    }
}