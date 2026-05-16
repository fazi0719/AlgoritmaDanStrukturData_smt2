package CM_2;

public class NodePembeli06 {
    Pembeli06 data;
    NodePembeli06 prev;
    NodePembeli06 next;

    
    public NodePembeli06(NodePembeli06 prev, Pembeli06 data, NodePembeli06 next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
