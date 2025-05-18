import java.util.*;
public class BFS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of vertices: ");
        int v = sc.nextInt();
        System.out.print("Enter number of edges: ");
        int e = sc.nextInt();

        Graph graph = new Graph(v);

        System.out.println("Enter edges (u v):");
        for (int i = 0; i < e; i++) {
            int u = sc.nextInt();
            int v1 = sc.nextInt();
            graph.addEdge(u, v1);
        }

        System.out.print("Enter starting vertex for BFS: ");
        int start = sc.nextInt();

        graph.bfs(start);
    }
}
