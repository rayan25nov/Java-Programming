package Graph;

import Graph.graph;

public class main {
    public static void main(String[] args) {
        graph gh = new graph();
        gh.addVertex("A");
        gh.addVertex("B");
        gh.addVertex("C");
        gh.addEdge("A", "B");
        gh.addEdge("A", "C");
        gh.addEdge("B", "C");
        // gh.removeEdge("A", "B");
        gh.removeVertex("C");
        gh.printGraph();
    }
   
}
