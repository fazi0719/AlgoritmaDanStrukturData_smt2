package UASPrakt06;

public class BinarySearchTreeBuku06 {

    // root bst
    NodeBuku06 root;

    // mengecek apakah tree kosong
    public boolean isEmpty() {
        return root == null;
    }

    // menambahkan buku ke dalam bst
    public void add(Buku06 data) {
        NodeBuku06 newNode = new NodeBuku06(data);
 
        // jika tree kosong, buku baru menjadi root
        if (isEmpty()) {
            root = newNode;
            return;
        }
        // membandingkan kode buku untuk menentukan posisi penempatan
        NodeBuku06 current = root;

        
        while (true) {
            // jika kode buku lebih kecil, masuk ke kiri
            if (data.kodeBuku.compareTo(current.data.kodeBuku) < 0) {

                if (current.left == null) {
                    current.left = newNode;
                    break;
                }

                current = current.left;
            } else {

                // jika kode lebih besar, masuk ke kanan
                if (current.right == null) {
                    current.right = newNode;
                    break;
                }

                current = current.right;
            }
        }
    }

    // mencari buku berdasarkan kode buku
    public boolean find(String kodeBuku) {

        NodeBuku06 current = root;

        while (current != null) {
            int hasil = kodeBuku.compareTo(current.data.kodeBuku);
            // jika hasil 0, berarti ditemukan
            if (hasil == 0) {
                return true;
            // jika hasil negatif, cari di kiri
            } else if (hasil < 0) {
                current = current.left;
            } else {
            // jika hasil positif, cari di kanan
                current = current.right;
            }
        }
        // jika tidak ditemukan, kembalikan false
        return false;
    }

    // traversal in-order untuk menampilkan buku secara terurut berdasarkan kode buku (traverssal in-order : kiri, root, kanan)
    public void traverseInOrder(NodeBuku06 node) {

        if (node != null) {
            traverseInOrder(node.left);
            node.data.tampilInformasi();
            traverseInOrder(node.right);
        }
    }

    // traversal pre-order untuk menampilkan buku berdasarkan urutan penambahan (traversal pre-order : root, kiri, kanan)
    public void traversePreOrder(NodeBuku06 node) {

        if (node != null) {
            node.data.tampilInformasi();
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }
    // menghitung jumlah buku 
    public int hitungJumlahBuku(NodeBuku06 node) {

        if (node == null) {
            return 0;
        }

        // hitung node sekarang  + jumlah buku di kiri + jumlah buku di kanan
        return 1
                + hitungJumlahBuku(node.left)
                + hitungJumlahBuku(node.right);
    }

    // mencari buku tertua berdasarkan tahun terbit
    public Buku06 cariBukuTertua(NodeBuku06 node) {

        if (node == null) {
            return null;
        }

        // perumpamaan buku di node saat ini sebagai tertua
        Buku06 tertua = node.data;
        // cari buku tertua di kiri 
        Buku06 kiri = cariBukuTertua(node.left);
        // cari buku tertua di kanan
        Buku06 kanan = cariBukuTertua(node.right);

        // bandingkan buku tertua di kiri  dengan buku tertua
        if (kiri != null && kiri.tahunTerbit < tertua.tahunTerbit) {
            tertua = kiri;
        }
        // bandingkan buku tertua di kanan dengan buku tertua 
        if (kanan != null && kanan.tahunTerbit < tertua.tahunTerbit) {
            tertua = kanan;
        }

        return tertua;
    }
}

