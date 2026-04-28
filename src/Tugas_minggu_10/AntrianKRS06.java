package Tugas_minggu_10;

public class AntrianKRS06 {
     MahasiswaKRS06[] data;
    int front;
    int rear;
    int size;
    int max;       // maksimal antrian = 15
    int sudahKRS;  // jumlah yang sudah diproses
    int maxDPA;    // maksimal yang ditangani DPA = 25
 
    public AntrianKRS06(int max, int maxDPA) {
        this.max = max;
        this.maxDPA = maxDPA;
        this.data = new MahasiswaKRS06[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
        this.sudahKRS = 0;
    }
 
    // Cek antrian kosong
    public boolean isEmpty() {
        return size == 0;
    }
 
    // Cek antrian penuh
    public boolean isFull() {
        return size == max;
    }
 
    // Mengosongkan antrian
    public void kosongkanAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian sudah kosong.");
        } else {
            front = 0;
            rear = -1;
            size = 0;
            System.out.println("Antrian berhasil dikosongkan.");
        }
    }
 
    // Menambahkan antrian
    public void tambahAntrian(MahasiswaKRS06 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh (maks " + max + "), tidak dapat menambah mahasiswa.");
            return;
        }
        if (sudahKRS >= maxDPA) {
            System.out.println("DPA sudah menangani " + maxDPA + " mahasiswa. Tidak bisa menambah.");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masuk ke antrian KRS. (Posisi: " + size + ")");
    }
 
    // Memanggil antrian untuk proses KRS - 2 mahasiswa sekaligus
    public void panggilAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak ada mahasiswa untuk diproses.");
            return;
        }
        System.out.println("=== Memanggil 2 mahasiswa untuk proses KRS ===");
        int dipanggil = 0;
        while (dipanggil < 2 && !isEmpty()) {
            if (sudahKRS >= maxDPA) {
                System.out.println("DPA sudah mencapai batas maksimal (" + maxDPA + " mahasiswa).");
                break;
            }
            MahasiswaKRS06 mhs = data[front];
            front = (front + 1) % max;
            size--;
            sudahKRS++;
            dipanggil++;
            System.out.print("  Mahasiswa #" + sudahKRS + " diproses: ");
            mhs.tampilkanData();
        }
        if (dipanggil == 0) {
            System.out.println("Tidak ada mahasiswa yang dapat diproses.");
        }
    }
 
    // Menampilkan semua antrian
    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Daftar Semua Antrian KRS:");
        System.out.println("No | NIM - NAMA - PRODI - KELAS");
        System.out.println("---+----------------------------");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + "  | ");
            data[index].tampilkanData();
        }
    }
 
    // Menampilkan 2 antrian terdepan
    public void tampilkan2Terdepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("2 Antrian Terdepan:");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        int tampil = Math.min(2, size);
        for (int i = 0; i < tampil; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }
 
    // Menampilkan antrian paling akhir
    public void lihatAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Antrian paling akhir:");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[rear].tampilkanData();
        }
    }
 
    // Cetak jumlah antrian saat ini
    public void cetakJumlahAntrian() {
        System.out.println("Jumlah mahasiswa dalam antrian saat ini: " + size);
    }
 
    // Cetak jumlah yang sudah KRS
    public void cetakSudahKRS() {
        System.out.println("Jumlah mahasiswa yang sudah proses KRS: " + sudahKRS + " / " + maxDPA);
    }
 
    // Cetak jumlah yang belum KRS (dalam antrian + yang akan datang)
    public void cetakBelumKRS() {
        int belum = maxDPA - sudahKRS;
        System.out.println("Jumlah mahasiswa yang belum proses KRS (sisa kuota DPA): " + belum);
        System.out.println("Mahasiswa dalam antrian belum diproses: " + size);
    }
}


