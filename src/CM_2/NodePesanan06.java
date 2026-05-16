package CM_2;

public class NodePesanan06 {
    Pesanan06 data;
    NodePesanan06 prev;
    NodePesanan06 next;


    public NodePesanan06(NodePesanan06 prev, Pesanan06 data, NodePesanan06 next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
