public class Edge {
    private Node targetNode;
    private int weight;

    public Edge(Node targetNode, int weight) {
        this.targetNode = targetNode;
        this.weight = weight;
    }

    public Node getTargetNode() {
        return targetNode;
    }

    public int getWeight() {
        return weight;
    }
}