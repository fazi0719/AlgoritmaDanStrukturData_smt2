package minggu_11.Tugas;

public class MahasiswaQueue06 {
    String nim;
    String nama;
    String kelas;
    double ipk;
    int nomorAntrian;
 
    public MahasiswaQueue06() {}
 
    public MahasiswaQueue06(String nim, String nama, String kelas, double ipk) {
        this.nim   = nim;
        this.nama  = nama;
        this.kelas = kelas;
        this.ipk   = ipk;
    }
 
    public void tampilInformasi() {
        System.out.printf(nomorAntrian + "\t" + nama + "\t" + nim + "\t" + kelas + "\t" + ipk);
    }
}

