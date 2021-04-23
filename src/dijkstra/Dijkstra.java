

import java.util.*;

public class Dijkstra {
    
    Vertex vStart = null;

    Queue<Vertex> vWaiting = new PriorityQueue<Vertex>();

    public Dijkstra(Vertex vStart) {
        this.vStart = vStart;
        vStart.cost = 0;
        vWaiting.add(vStart);
    }

    public void performDijkstra() {
        while(!vWaiting.isEmpty()) {
            Vertex vCurrent = vWaiting.poll();
            for (Edge e : vCurrent.edges) {
                Vertex vNext = e.getOtherSide(vCurrent);
                if (!vNext.done) {
                    if (vNext.cost > vCurrent.cost + e.weight) {
                        vNext.cost = vCurrent.cost + e.weight;
                        vNext.predecessor = vCurrent;
                        vWaiting.add(vNext);
                    }
                }
            }
            vCurrent.done = true;
        }

    }
    

    
}