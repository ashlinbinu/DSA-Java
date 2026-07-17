import java.util.*;

class Solution {
    public int leastInterval(char[] tasks, int n) {
        // 1. Count frequencies
        HashMap<Character, Integer> frequency = new HashMap<>();
        for (int i = 0; i < tasks.length; i++) {
            frequency.put(tasks[i], frequency.getOrDefault(tasks[i], 0) + 1);
        }

        // 2. Initialize Max-Heap based on frequency values
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.addAll(frequency.values());

        int totalTime = 0;

        // 3. Process in cycles of (n + 1)
        while (!pq.isEmpty()) {
            List<Integer> templist = new ArrayList<>();
            int tasksExecuted = 0;

            // Try to fill the cooling window of size n + 1
            for (int i = 0; i <= n; i++) {
                if (!pq.isEmpty()) {
                    int currentFreq = pq.poll();
                    tasksExecuted++;
                    
                    // Decrement frequency and save if it still needs processing
                    if (currentFreq > 1) {
                        templist.add(currentFreq - 1);
                    }
                }
            }

            // 4. Track Total Time (Step 4 logic)
            if (!templist.isEmpty()) {
                totalTime += (n + 1); // Scenario A: More tasks left, full cycle counted
            } else {
                totalTime += tasksExecuted; // Scenario B: Last round, count only actual tasks
            }

            // 5. Re-enqueue and Repeat
            pq.addAll(templist);
        }

        return totalTime;
    }
}