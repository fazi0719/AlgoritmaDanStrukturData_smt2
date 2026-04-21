package minggu_9;

public class mahasiswa06 {
    String nim;
    String nama;
    String kelas;
    int nilai;
 
    // Konstruktor default
    public mahasiswa06() {}
 
    // Konstruktor berparameter
    public mahasiswa06(String nama, String nim, String kelas) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        nilai = -1; // nilai default sebelum dinilai
    }
 
    // Method untuk mengeset nilai tugas
    void tugasDinilai(int nilai) {
        this.nilai = nilai;
    }
}

