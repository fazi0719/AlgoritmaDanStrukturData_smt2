package minggu_11.Praktikum1;

public class mahasiswa06 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    // Constructor default
    public mahasiswa06() {}

    // Constructor dengan parameter
    public mahasiswa06(String nm, String name, String kls, double ip) {
        this.nim   = nm;
        this.nama  = name;
        this.kelas = kls;
        this.ipk   = ip;
    }

    public void tampilInformasi() {
        System.out.println(nama + "\t" + nim + "\t" + kelas + "\t" + ipk);
    }
}

