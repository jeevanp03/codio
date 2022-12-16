import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DFSTree {
    private IntGraph graph;
    private int source;
    private Map<Integer, Integer> parents;
    private Set<Integer> visited;

    public DFSTree(IntGraph graph, int source) {
        this.graph = graph;
        this.source = source;
        visited = new HashSet<>();
        parents = new HashMap<>();
        if (!graph.hasVertex(source)) {
            throw new java.lang.IllegalArgumentException();
        }
        for (int node : graph.getVertices()) {
            parents.put(node, null);

        }
        // for (int v : graph.getVertices()) {
        // dfsVisit(v, visited, parents);
        // }
        dfsVisit(source, visited, parents);
    }

    private void dfsVisit(int u, Set<Integer> visited, Map<Integer, Integer> parents) {
        visited.add(u);
        for (int v : graph.getAdjacencyList(u)) {
            if (!visited.contains(v)) {
                parents.put(v, u);
                dfsVisit(v, visited, parents);
            }
        }
    }

    public boolean isConnected(int vertex) {
        return visited.contains(vertex);
    }
}