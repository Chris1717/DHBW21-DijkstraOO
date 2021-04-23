

public class Edge {

    int weight = 0;
    Vertex v0, v1;

    public Edge(int weight, Vertex v0, Vertex v1) {
        this.weight = weight;
        this.v0 = v0;
        this.v1 = v1;
        v0.newEdge(this);
        v1.newEdge(this);
    }

    public Vertex getOtherSide(Vertex v) {
        if (v == v0) {
            return v1;
        } else {
            return v0;
        }
    }
    
    
}