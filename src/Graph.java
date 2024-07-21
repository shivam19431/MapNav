import java.util.HashMap;
import java.util.Map;

public class Graph {
    private Map<String, Node> nodes;

    public Graph() {
        nodes = new HashMap<>();
    }

    public void addNode(String name) {
        nodes.put(name, new Node(name));
    }

    public Node getNode(String name) {
        return nodes.get(name);
    }

    public void addEdge(String from, String to, int weight) {
        Node fromNode = nodes.get(from);
        Node toNode = nodes.get(to);
        if (fromNode != null && toNode != null) {
            fromNode.addEdge(new Edge(toNode, weight));
        }
    }

    public Map<String, Node> getNodes() {
        return nodes;
    }
}