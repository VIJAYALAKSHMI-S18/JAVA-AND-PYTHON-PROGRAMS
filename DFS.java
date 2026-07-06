import java.util.*;

public class DFS {

    public static void dfs(ArrayList<ArrayList<Integer>> graph, int node, boolean[] visited) {
        visited[node] = true;
        System.out.print(node + " ");

        for (int neighbor : graph.get(node)) {
            if (!visited[neighbor]) {
                dfs(graph, neighbor, visited);
            }
        }
    }

    public static void main(String[] args) {
        int vertices = 6;

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }

        // Example graph edges
        graph.get(0).add(1);
        graph.get(0).add(2);
        graph.get(1).add(0);
        graph.get(1).add(3);
        graph.get(1).add(4);

        graph.get(2).add(0);
        graph.get(2).add(5);

        graph.get(3).add(1);
        graph.get(4).add(1);
        graph.get(5).add(2);

        boolean[] visited = new boolean[vertices];

        System.out.println("DFS Traversal:");
        dfs(graph, 0, visited);
    }
}