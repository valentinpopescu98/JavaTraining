package data_structures;

import java.util.ArrayList;
import java.util.List;

public class NaryTreeNode {
    public int value;
    public List<NaryTreeNode> children =  new ArrayList<>();

    public NaryTreeNode(int value)
    {
        this.value = value;
    }
}
