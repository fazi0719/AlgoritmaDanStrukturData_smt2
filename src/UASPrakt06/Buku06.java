package UASPrakt06;

public class Buku06 {
    // Atribut buku
    String kodeBuku;
    String judul;
    String penulis;
    int tahunTerbit;

    // konstruktor
    public Buku06(String kodeBuku, String judul, String penulis, int tahunTerbit) {
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
    }
    // menampilkan informasi buku
    public void tampilInformasi() {
        System.out.println("Kode Buku   : " + kodeBuku);
        System.out.println("Judul       : " + judul);
        System.out.println("Penulis     : " + penulis);
        System.out.println("Tahun Terbit: " + tahunTerbit);
        System.out.println();
    }
}

