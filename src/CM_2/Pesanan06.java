package CM_2;

public class Pesanan06 {
    int kodePesanan;
    String namaPesanan;
    int harga;

    public Pesanan06(int kodePesanan, String namaPesanan, int harga) {
        this.kodePesanan = kodePesanan;
        this.namaPesanan = namaPesanan;
        this.harga = harga;
    }

    void tampil() {
        System.out.println(kodePesanan + " | " + namaPesanan + " | " + harga);
    }
}
