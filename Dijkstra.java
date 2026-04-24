import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

class Pair{
    int node, dist;
    Pair(int n, int d){
    node = n;
    dist = d;
}
}
public class Dijkstra{
    public static void dijkstra(int V, ArrayList<ArrayList<Pair>> adj, int src) {
        // Method implementation goes here
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.dist - b.dist);
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;
        pq.add(new Pair(src, 0));
        while(!pq.isEmpty()){
            Pair curr = pq.poll();
            int node = curr.node;
            int d = curr.dist;
            for(Pair neighbrour:adj.get(node)){
                int adjNode = neighbrour.node;
                int weight = neighbrour.dist;
                if(d+weight<dist[adjNode]){
                    dist[adjNode] = d+weight;
                    pq.add(new Pair(adjNode, dist[adjNode]));
                }
            }
        }
        System.out.println("Shortest distance from the source:");
        System.out.println(Arrays.toString(dist));
    }
    public static void main(String[] args) {
        int V = 5;
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        for(int i=0; i<V; i++){
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(new Pair(1, 2));
        adj.get(0).add(new Pair(2, 4));

        adj.get(1).add(new Pair(0, 2));
        adj.get(1).add(new Pair(2, 1));
        adj.get(0).add(new Pair(3, 7));

        adj.get(2).add(new Pair(0, 4));
        adj.get(2).add(new Pair(1, 1));
        adj.get(2).add(new Pair(4, 3));

        adj.get(3).add(new Pair(1, 7));
        adj.get(3).add(new Pair(4, 1));

        adj.get(4).add(new Pair(2, 3));
        adj.get(4).add(new Pair(3, 1));
        
        int src = 0;
        dijkstra(V, adj, src);
    }
}
