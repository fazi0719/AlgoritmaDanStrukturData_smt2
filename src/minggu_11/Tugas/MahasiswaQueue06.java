package minggu_11.Tugas;

public class MahasiswaQueue06 {
    String nim;
    String nama;
    String kelas;
    double ipk;
    int nomorAntrian;
 
    public MahasiswaQueue06() {}
 
   // Di file MahasiswaQueue06.java
public MahasiswaQueue06(String nim, String nama, String kelas, double ipk, int nomorAntrian) {
    this.nim = nim;
    this.nama = nama;
    this.kelas = kelas;
    this.ipk = ipk;
    this.nomorAntrian = nomorAntrian;
}
 
    public void tampilInformasi() {
        System.out.printf(nomorAntrian + "\t" + nama + "\t" + nim + "\t" + kelas + "\t" + ipk);
    }
}

