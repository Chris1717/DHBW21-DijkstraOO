

import java.util.*;

public class Vertex implements Comparable<Vertex>{

    static List<Vertex> vAll = new LinkedList<Vertex>();

    //Abbildung des Graphen
    String name;
    List<Edge> edges = new ArrayList<Edge>();

    static final public int infinit = Integer.MAX_VALUE;

    //Realisierung des Algorithmus
    int cost = infinit;
    Vertex predecessor = null;
    boolean done = false;

    public Vertex(String name) {
        this.name = name;
        vAll.add(this);
    }

    public void newEdge(Edge e) {
        edges.add(e);
    }

    public String backtrack() {
        if (predecessor == null) {
            return name;
        } else {
            return predecessor.backtrack() + " -> " + name;
        }
    }

    @Override
    public int compareTo(Vertex v) {
        if (this.cost < v.cost) {
            return -1;
        } else if (this.cost == v.cost) {
            return 0;
        } else {
            return 1;
        }
        
    }

    
}