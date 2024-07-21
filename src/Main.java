import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();
        Scanner scanner = new Scanner(System.in);

        // Add nodes
        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");
        graph.addNode("D");

        // Add edges
        graph.addEdge("A", "B", 1);
        graph.addEdge("A", "C", 4);
        graph.addEdge("B", "C", 2);
        graph.addEdge("B", "D", 5);
        graph.addEdge("C", "D", 1);

        System.out.print("Enter start node: ");
        String start = scanner.nextLine();
        System.out.print("Enter end node: ");
        String end = scanner.nextLine();

        Node startNode = graph.getNode(start);
        Node endNode = graph.getNode(end);

        if (startNode == null || endNode == null) {
            System.out.println("Invalid nodes.");
            return;
        }

        Map<Node, Integer> distances = Dijkstra.computeShortestPaths(startNode);
        System.out.println("Shortest path from " + start + " to " + end + " is " + distances.get(endNode));
    }
}