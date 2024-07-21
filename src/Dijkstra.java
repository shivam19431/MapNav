import java.util.*;

public class Dijkstra {
    public static Map<Node, Integer> computeShortestPaths(Node source) {
        Map<Node, Integer> distances = new HashMap<>();
        PriorityQueue<Node> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(distances::get));
        distances.put(source, 0);
        priorityQueue.add(source);

        while (!priorityQueue.isEmpty()) {
            Node currentNode = priorityQueue.poll();
            for (Edge edge : currentNode.getEdges()) {
                Node targetNode = edge.getTargetNode();
                int newDist = distances.get(currentNode) + edge.getWeight();
                if (newDist < distances.getOrDefault(targetNode, Integer.MAX_VALUE)) {
                    distances.put(targetNode, newDist);
                    priorityQueue.add(targetNode);
                }
            }
        }
        return distances;
    }
}