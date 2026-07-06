import java.util.*;

public class BFS {

    public static void bfs(ArrayList<ArrayList<Integer>> graph, int start, int vertices) {
        boolean[] visited = new boolean[vertices];
        Queue<Integer> queue = new LinkedList<>();

        // start node visited and added to queue
        visited[start] = true;
        queue.offer(start);

        while (!queue.isEmpty()) {
            int current = queue.poll();   // remove front element
            System.out.print(current + " ");

            // visit all neighbors
            for (int neighbor : graph.get(current)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.offer(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {
        int vertices = 6;

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        // create empty list for each vertex
        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }

        // adding edges
        graph.get(0).add(1);
        graph.get(0).add(2);
        graph.get(1).add(3);
        graph.get(1).add(4);
        graph.get(2).add(5);

        System.out.println("BFS Traversal:");
        bfs(graph, 0, vertices);
    }
}