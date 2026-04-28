package Tugas_minggu_10;

import java.util.Scanner;

public class AntrianKRSMain06 {
    public static void tampilkanMenu() {
        System.out.println("\n========================================");
        System.out.println("    SISTEM ANTRIAN PERSETUJUAN KRS DPA    ");
        System.out.println("==========================================");
        System.out.println("  1. Tambah Mahasiswa ke Antrian ");
        System.out.println("  2. Panggil Antrian ");
        System.out.println("  3. Tampilkan Semua Antrian ");
        System.out.println("  4. Tampilkan 2 Antrian Terdepan ");
        System.out.println("  5. Lihat Antrian Paling Akhir ");
        System.out.println("  6. Cek Antrian Kosong ");
        System.out.println("  7. Cek Antrian Penuh ");
        System.out.println("  8. Kosongkan Antrian ");
        System.out.println("  9. Cetak Jumlah Antrian ");
        System.out.println(" 10. Cetak Jumlah yang Sudah KRS ");
        System.out.println(" 11. Cetak Jumlah yang Belum KRS ");
        System.out.println("  0. Keluar ");
        System.out.print("Pilih menu: ");
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        // Maks antrian = 15, maks ditangani DPA = 25
        AntrianKRS06 antrian = new AntrianKRS06(15, 25);
        int pilihan;
 
        System.out.println("Selamat datang di Sistem Antrian KRS DPA");
        System.out.println("Kapasitas antrian: 15 | Kuota DPA: 25 mahasiswa");
 
        do {
            tampilkanMenu();
            pilihan = sc.nextInt();
            sc.nextLine();
 
            switch (pilihan) {
                case 1:
                    System.out.println("--- Input Data Mahasiswa ---");
                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();
                    MahasiswaKRS06 mhs = new MahasiswaKRS06(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;
 
                case 2:
                    antrian.panggilAntrian();
                    break;
 
                case 3:
                    antrian.tampilkanSemua();
                    break;
 
                case 4:
                    antrian.tampilkan2Terdepan();
                    break;
 
                case 5:
                    antrian.lihatAkhir();
                    break;
 
                case 6:
                    if (antrian.isEmpty()) {
                        System.out.println("Status: Antrian KOSONG.");
                    } else {
                        System.out.println("Status: Antrian TIDAK kosong. Jumlah: " + antrian.size);
                    }
                    break;
 
                case 7:
                    if (antrian.isFull()) {
                        System.out.println("Status: Antrian PENUH (" + antrian.max + "/" + antrian.max + ").");
                    } else {
                        System.out.println("Status: Antrian BELUM penuh. (" + antrian.size + "/" + antrian.max + ")");
                    }
                    break;
 
                case 8:
                    antrian.kosongkanAntrian();
                    break;
 
                case 9:
                    antrian.cetakJumlahAntrian();
                    break;
 
                case 10:
                    antrian.cetakSudahKRS();
                    break;
 
                case 11:
                    antrian.cetakBelumKRS();
                    break;
 
                case 0:
                    System.out.println("Terima kasih. Program selesai.");
                    break;
 
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih 0-11.");
            }
        } while (pilihan != 0);
 
        sc.close();
    }
}

