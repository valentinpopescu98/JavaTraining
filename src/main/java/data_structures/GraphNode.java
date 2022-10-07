package data_structures;

import java.util.LinkedList;
import java.util.List;

public class GraphNode {
    public int value;
    public boolean visited = false;
    public List<GraphNode> neighbours = new LinkedList<>();

    public GraphNode(int value) {
        this.value = value;
    }
}
