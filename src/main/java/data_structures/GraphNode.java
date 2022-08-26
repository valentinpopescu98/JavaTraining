package data_structures;

import java.util.List;

public class GraphNode {
    public int key;
    public List<GraphNode> values;

    public GraphNode(int key) {
        this.key = key;
    }
}
