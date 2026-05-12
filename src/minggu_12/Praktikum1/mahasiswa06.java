package minggu_12.Praktikum1;
public class mahasiswa06 {
    String nim;
    String nama;
    String kelas;
    double ipk;
 
    public mahasiswa06(String nim, String nama, String kelas, double ipk) {
        this.nim   = nim;
        this.nama  = nama;
        this.kelas = kelas;
        this.ipk   = ipk;
    }
 
    public void tampil() {
        System.out.println(
            "NIM   : " + nim   +
            "\nNama  : " + nama  +
            "\nKelas : " + kelas +
            "\nIPK   : " + ipk
        );
    }
}

