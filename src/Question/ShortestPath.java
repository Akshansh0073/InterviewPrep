package Question;

import java.util.*;

public class ShortestPath {
    static class Road {
        int destination, length, toll;
        Road(int destination, int length, int toll) {
            this.destination = destination;
            this.length = length;
            this.toll = toll;
        }
    }
    public static int findShortestPath(int n, int r, int c, List<List<Road>> graph){
        int[][] dp = new int[n+1][c+1];
        for(int i=0;i<=n;i++){
            Arrays.fill(dp[i], Integer.MAX_VALUE);
        }
        dp[1][0] = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        pq.add(new int[]{1, 0, 0});

        while(!pq.isEmpty()){
            int[] current = pq.poll();
            int city = current[0];
            int length = current[1];
            int toll = current[2];

            if (city==n) return length;

            for(Road road : graph.get(city)){
                int newToll = toll + road.toll;
                if(newToll<=c){
                    int newLength = length + road.length;
                    if(dp[road.destination][newToll] > newLength){
                        dp[road.destination][newToll] = newLength;
                        pq.add(new int[]{road.destination, newLength, newToll});
                    }
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        while (m-->0){
            int n = sc.nextInt();
            int r = sc.nextInt();
            int c = sc.nextInt();
            List<List<Road>> graph = new ArrayList<>();
            for(int i=0; i<=n; i++){
                graph.add(new ArrayList<>());
            }
            for(int i=0; i<r; i++){
                int x = sc.nextInt();
                int y = sc.nextInt();
                int z = sc.nextInt();
                int t = sc.nextInt();
                graph.get(x).add(new Road(y, z, t));
            }
            System.out.println(findShortestPath(n, r, c, graph));
        }
    }
}
