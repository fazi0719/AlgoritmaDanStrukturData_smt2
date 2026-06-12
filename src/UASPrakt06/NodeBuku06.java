package UASPrakt06;

public class NodeBuku06 {
    // menyimpan data buku
    Buku06 data;
    // pointer ke anak kiri dan kanan
    NodeBuku06 left;
    NodeBuku06 right;

    // konstruktor 
    public NodeBuku06(Buku06 data) {
        this.data = data;
        left = null;
        right = null;
    }
}

