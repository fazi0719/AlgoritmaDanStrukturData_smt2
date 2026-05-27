package minggu_13;

public class binaryTreeArray06 {
    mahasiswa06[] dataMahasiswa;
    int idxLast;

    // Konstruktor default
    public binaryTreeArray06() {
        this.dataMahasiswa = new mahasiswa06[10]; // Mengambil slot array isi 10
    }

    // Method untuk mengisi data ke dalam array
    void populateData(mahasiswa06 dataMhs[], int idxLast) {
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    // Method penelusuran secara In-Order Traversal
    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                traverseInOrder(2 * idxStart + 1); // Menelusuri left child
                dataMahasiswa[idxStart].tampilInformasi(); // Menampilkan data
                traverseInOrder(2 * idxStart + 2); // Menelusuri right child
            }
        }
    }
    // TUGAS 4 - method add() untuk BinaryTreeArray
    void add(mahasiswa06 data) {
        // Cari slot kosong berikutnya (level-order / breadth-first insertion)
        for (int i = 0; i < dataMahasiswa.length; i++) {
            if (dataMahasiswa[i] == null) {
                dataMahasiswa[i] = data;
                if (i > idxLast) idxLast = i;
                return;
            }
        }
        System.out.println("Array tree penuh!");
    }
    // TUGAS 4 - method traversePreOrder()
    void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                dataMahasiswa[idxStart].tampilInformasi();
                traversePreOrder(2 * idxStart + 1);
                traversePreOrder(2 * idxStart + 2);
            }
        }
    }
}