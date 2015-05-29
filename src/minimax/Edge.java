package minimax;

/**
 * Created by Jo�o on 29/05/2015.
 */
public class Edge {
    public final Vertex target;
    public final double weight;

    public Edge(Vertex argTarget, double argWeight) {
        target = argTarget;
        weight = argWeight;
    }
}
