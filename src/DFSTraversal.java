import java.util.*;

public class DFSTraversal {
    private LinkedList<Integer> adj[];
    private boolean visited[];
    
    DFSTraversal(int V){
        adj = new LinkedList[V];
        visited = new boolean[V];
        for (int i=0; i<V; i++)
            adj[i] = new LinkedList<Integer>();
    }
    
    void insertEdge(int src, int dest){
        adj[src].add(dest);
    }
    
    void DFS(int vertex){
        visited[vertex] = true;
        System.out.print(vertex + " ");
        Iterator<Integer> it = adj[vertex].listIterator();
        while (it.hasNext()){
            int n = it.next();
            if (!visited[n])
                DFS(n);
        }
    }
    
    public static void main(String[] args) {
        DFSTraversal graph = new DFSTraversal(8);
        graph.insertEdge(0, 1);
        graph.insertEdge(0, 2);
        graph.insertEdge(0, 3);
        graph.insertEdge(1, 3);
        graph.insertEdge(2, 4);
        graph.insertEdge(3, 5);
        graph.insertEdge(3, 6);
        graph.insertEdge(4, 7);
        graph.insertEdge(4, 5);
        graph.insertEdge(5, 2);
        System.out.println("Depth First Traversal for the graph is: ");
        graph.DFS(0);
    }
}