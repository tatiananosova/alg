package lesson7;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph(10);
        graph.addEdge(1,2);
        graph.addEdge(0,3);
        graph.addEdge(2,4);
        graph.addEdge(3,5);
        graph.addEdge(4,8);
        graph.addEdge(5,1);
        graph.addEdge(6,7);
        graph.addEdge(7,8);
        graph.addEdge(8,9);
        graph.addEdge(9,0);

//        System.out.println(graph.getAdjList(4));

        DepthFirstPath dfp = new DepthFirstPath(graph, 1);
        System.out.println(dfp.hasPathTo(3));
        System.out.println(dfp.pathTo(3));

        BreadthFirstPath bfp  = new BreadthFirstPath(graph, 1);
        System.out.println(bfp.hasPathTo(3));
        System.out.println(bfp.pathTo(3));



    }
}
