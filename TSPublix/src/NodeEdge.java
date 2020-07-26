public class NodeEdge {
    public NodeBonus end;
    public int weight;
    public char value;

    public NodeEdge(NodeBonus end, int weight) {
        this.value = end.value;
        this.end = end;
        this.weight = weight;
    }
}