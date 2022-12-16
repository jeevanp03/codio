import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class BFSTree {
    private IntGraph graph;
    private int source;
    private Map<Integer, Integer> distances; // vertices to integers
    private Map<Integer, Integer> parents; // vertices to vertices

    public BFSTree(IntGraph graph, int source) {
        this.graph = graph;
        this.source = source;
        distances = new HashMap<>();
        parents = new HashMap<>();
        Queue<Integer> visited = new LinkedList();
        if (!graph.hasVertex(source)) {
            throw new java.lang.IllegalArgumentException();
        }
        for (int node : graph.getVertices()) {
            distances.put(node, -1);
            parents.put(node, null);
        }
        distances.put(source, 0);
        visited.add(source);

        while (!visited.isEmpty()) {
            int parent = visited.remove();
            for (int v : graph.getAdjacencyList(parent)) {
                if (distances.get(v) == -1) {
                    distances.put(v, distances.get(parent) + 1);
                    parents.put(v, parent);
                    visited.add(v);
                }
            }
        }
    }

    public int getDistanceTo(int vertex) {
        return distances.get(vertex);
    }

}
