package CM_2;
import java.util.Scanner;
public class MainRoyalDelish06 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //membuat object linked list
        DLLPembeli06 antrean = new DLLPembeli06();
        DLLPesanan06 daftarPesanan = new DLLPesanan06();

         antrean.tambahAntrian("Ainra", "08224500000");
        antrean.tambahAntrian("Danra", "08224511111");
        antrean.tambahAntrian("Sanri", "08224522222");

        int pilih;

        do {

            System.out.println();
            System.out.println("=================================");
            System.out.println(" SISTEM ANTREAN ROYAL DELISH ");
            System.out.println("=================================");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian & Input Pesanan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("0. Keluar");
            System.out.println("=================================");

            System.out.print("Pilih menu : ");
            pilih = sc.nextInt();
            sc.nextLine();

            // switch-case digunakan untuk memilih menu program
            switch (pilih) {

                case 1:

                    // tambah antrean pembeli
                    System.out.println();
                    System.out.println("===== TAMBAH ANTRIAN =====");

                    System.out.print("Nama Pembeli : ");
                    String nama = sc.nextLine();

                    System.out.print("No HP : ");
                    String hp = sc.nextLine();

               //Menambahkan pembeli ke antrean
                antrean.tambahAntrian(nama,hp);
                    break;

                case 2:

                    // menampilkan antrean pembeli
                    System.out.println();
                    antrean.print();

                    System.out.println( "Jumlah antrian : " + antrean.countQueue());

                    break;

                case 3:
                    // mengambil antrean paling depan
                    Pembeli06 dipanggil =antrean.removeFirst();

                    if (dipanggil != null) {

                    System.out.print("Kode Pesanan : ");
                    int kode = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Nama Pesanan : ");
                    String namaPesanan = sc.nextLine();

                    System.out.print("Harga        : ");
                    int harga = sc.nextInt();
                    sc.nextLine();

        
                    Pesanan06 psn = new Pesanan06(kode,namaPesanan,harga);

                    // menambahkan pesanan ke linked list daftarPesanan
                    daftarPesanan.addLast(psn);
                    System.out.println(dipanggil.namaPembeli + " telah memesan " + namaPesanan); 
                    }
                break;

                case 4:

                    // menampilkan laporan pesanan
                    System.out.println();
                    daftarPesanan.print();

                    System.out.println(
                            "Jumlah pesanan : " + daftarPesanan.countPesanan());

                    break;

                case 0:
                    // keluar dari program
                    System.out.println();
                    System.out.println("Program selesai");
                    break;

                default:

                    System.out.println("Menu tidak tersedia");
            }

        } while (pilih != 0);
    }
}

