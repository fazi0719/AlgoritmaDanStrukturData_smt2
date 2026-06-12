package UASPrakt06;

public class BukuMain06 {

    public static void main(String[] args) {
        // membuat objek BST untuk menyimpan data buku
        BinarySearchTreeBuku06 bst = new BinarySearchTreeBuku06();

        // menambahkan beberapa buku ke dalam BST
        bst.add(new Buku06("BK105", "Struktur Data", "Andi", 2020));
        bst.add(new Buku06("BK102", "Algoritma Dasar", "Budi", 2019));
        bst.add(new Buku06("BK108", "Basis Data", "Citra", 2021));
        bst.add(new Buku06("BK101", "Pemrograman Java", "Dewi", 2018));
        bst.add(new Buku06("BK104", "Sistem Operasi", "Eka", 2022));
        bst.add(new Buku06("BK107", "Jaringan Komputer", "Fajar", 2017));

        // menampilkan data buku dengan traversal in-order 
        System.out.println("=== DATA BUKU IN-ORDER ===");
        bst.traverseInOrder(bst.root);
        // menampilkan data buku dengan traversal pre-order
        System.out.println("=== DATA BUKU PRE-ORDER ===");
        bst.traversePreOrder(bst.root);

        // pencarian buku berdasarkan kode buku
        System.out.println("Pencarian BK104 : " + (bst.find("BK104") ? "Ditemukan" : "Tidak Ditemukan"));
        System.out.println("Pencarian BK110 : " + (bst.find("BK110") ? "Ditemukan" : "Tidak Ditemukan"));

        // menghitung jumlah buku dalam BST
        System.out.println("\nJumlah Buku : " + bst.hitungJumlahBuku(bst.root));

        // mencari buku tertua berdasarkan tahun terbit
        System.out.println("\n=== BUKU TERTUA ===");

        Buku06 tertua = bst.cariBukuTertua(bst.root);

        tertua.tampilInformasi();
    }
}

