package minggu_9;

import java.util.Scanner;
public class SuratDemo06 {
   
   
       public static void main(String[] args) {
        StackSurat06 stack = new StackSurat06(5);
        Scanner sc = new Scanner(System.in);
      
        int pilih;
        do {
            System.out.println("\n=== MENU SURAT IZIN PRODI ===");
            System.out.println("1. Terima Surat Izin "); 
            System.out.println("2. Proses Surat Izin "); 
            System.out.println("3. Lihat Surat Izin Terakhir "); 
            System.out.println("4. Cari Surat Berdasarkan Nama"); 
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: "); String id = sc.nextLine();
                    System.out.print("Nama Mahasiswa: "); String nama = sc.nextLine();
                    System.out.print("Kelas: "); String kls = sc.nextLine();
                    System.out.print("Jenis Izin (S/I): "); char jns = sc.next().charAt(0);
                    System.out.print("Durasi (hari): "); int dur = sc.nextInt();
                    surat06 newSurat = new surat06(id, nama, kls, jns, dur);
                    stack.push(newSurat);
                    break;
                case 2:
                    surat06 diproses = stack.pop();
                    if (diproses != null) {
                        System.out.println("Memproses surat dari: " + diproses.namaMahasiswa);
                    }
                    break;
                case 3:
                    surat06 teratas = stack.peek();
                    if (teratas != null) {
                        System.out.println("Surat teratas milik: " + teratas.namaMahasiswa);
                    } else {
                        System.out.println("Tumpukan kosong.");
                    }
                    break;
                case 4:
                    System.out.print("Masukkan nama mahasiswa yang dicari: ");
                    String cariNama = sc.nextLine();
                    stack.cariSurat(cariNama);
                    break;
            }
        } while (pilih != 5);
    }
}

