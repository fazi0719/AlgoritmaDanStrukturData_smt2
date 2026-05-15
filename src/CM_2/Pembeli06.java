package CM_2;

public class Pembeli06 {
    String namaPembeli;
    String noHp;
    int noAntrian;

    public Pembeli06(int noAntrian, String namaPembeli, String noHp) {
        this.noAntrian = noAntrian;
        this.namaPembeli = namaPembeli;
        this.noHp = noHp;
    }

    void tampil() {
        System.out.println("No Antrian : " + noAntrian);
        System.out.println("Nama       : " + namaPembeli);
        System.out.println("No HP      : " + noHp);
    }
}
