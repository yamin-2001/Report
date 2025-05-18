import java.util.*;
public class DijkstraAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of vertices: ");
        int V = sc.nextInt();

        System.out.print("Enter number of edges: ");
        int E = sc.nextInt();

        Graph graph = new Graph(V);
        System.out.println("Enter edges (u v weight):");
        for (int i = 0; i < E; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();
            graph.addEdge(u, v, w);
        }

        System.out.print("Enter source vertex: ");
        int source = sc.nextInt();

        graph.dijkstra(source);
    }
}
