

class Main { 
    
    public static void main(String[] args) {

        Vertex _0 = new Vertex("0");
        Vertex _1 = new Vertex("1");
        Vertex _2 = new Vertex("2");
        Vertex _3 = new Vertex("3");
        Vertex _4 = new Vertex("4");
        Vertex _5 = new Vertex("5");
        Vertex _6 = new Vertex("6");
        Vertex _7 = new Vertex("7");
        Vertex _8 = new Vertex("8");

        Edge _0_1 = new Edge(4, _0, _1);
        Edge _0_7 = new Edge(8, _0, _7);

        Edge _1_7 = new Edge(11, _1, _7);
        Edge _1_2 = new Edge(8, _1, _2);

        Edge _2_8 = new Edge(2, _2, _8);
        Edge _2_3 = new Edge(7, _2, _3);
        Edge _2_5 = new Edge(4, _2, _5);

        Edge _3_5 = new Edge(14, _3, _5);
        Edge _3_4 = new Edge(9, _3, _4);

        Edge _4_5 = new Edge(10, _4, _5);

        Edge _5_6 = new Edge(2, _5, _6);

        Edge _6_8 = new Edge(6, _6, _8);
        Edge _6_7 = new Edge(1, _6, _7);

        Edge _7_8 = new Edge(7, _7, _8);

        Dijkstra algo = new Dijkstra(_0);

        algo.performDijkstra();

        System.out.println("Distance from 0 to 4: " + _4.cost);
        System.out.println("Path: " + _4.backtrack());

        for (Vertex v : Vertex.vAll) {
            System.out.println("Distance from 0 to " + v.name + ": " + v.cost + ": " + v.backtrack());
        }

    }

}