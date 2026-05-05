package minggu_11.Tugas;
import java.util.Scanner;

public class QueueMain06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueLinkedList06 q = new QueueLinkedList06();
        int pilih;

        do {
            System.out.println("\n--- MENU ANTRIAN UNIT MHS ---");
            System.out.println("1. Tambah Antrian (Daftar)"); // Syarat (c & e)
            System.out.println("2. Panggil Antrian (Dequeue)"); // Syarat (f)
            System.out.println("3. Lihat Depan & Belakang");   // Syarat (g)
            System.out.println("4. Cetak Semua Antrian");     // Syarat (h)
            System.out.println("5. Kosongkan Antrian");       // Syarat (d)
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("NIM  : "); String nim = sc.nextLine();
                    System.out.print("Nama : "); String nama = sc.nextLine();
                    System.out.print("Kelas: "); String kelas = sc.nextLine();
                    System.out.print("IPK  : "); double ipk = sc.nextDouble();
                    // Membuat objek dan mendaftarkannya (Syarat c)
                    q.enqueue(new MahasiswaQueue06(nim, nama, kelas, ipk, q.size + 1));
                    break;
                case 2:
                    q.dequeue();
                    break;
                case 3:
                    q.peek(); // Pastikan peek mencetak Front dan Rear (Syarat g)
                    break;
                case 4:
                    q.print(); // Menampilkan isi dan jumlah pengantre (Syarat h)
                    break;
                case 5:
                    q.front = q.rear = null; // Mengosongkan antrian (Syarat d)
                    q.size = 0;
                    System.out.println("Antrian dikosongkan.");
                    break;
            }
        } while (pilih != 0);
    }
}

