package minggu_12.Praktikum1;
import java.util.Scanner;
public class  DoubleLinkedListMain06 {
    public static mahasiswa06 inputMahasiswa06(Scanner sc) {
        System.out.print("Masukkan NIM   : ");
        String nim = sc.nextLine();
        System.out.print("Masukkan Nama  : ");
        String nama = sc.nextLine();
        System.out.print("Masukkan Kelas : ");
        String kelas = sc.nextLine();
        System.out.print("Masukkan IPK   : ");
        double ipk = sc.nextDouble();
        sc.nextLine(); // Membersihkan sisa enter
        return new mahasiswa06(nim, nama, kelas, ipk);
    }
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoubleLinkedList06 list = new DoubleLinkedList06();
        int pilihan;
 
        do {
            System.out.println("\n===== MENU DOUBLE LINKED LIST =====");
            System.out.println("1. Tambah data di awal");
            System.out.println("2. Tambah data di akhir");
            System.out.println("3. Sisipkan data di tengah (setelah NIM)");
            System.out.println("4. hapus data di awal");
            System.out.println("5. hapus data di akhir"); 
            System.out.println("6. Tampilkan data");
            System.out.println("7. Tampilkan data (Terbalik)"); // Modifikasi nomor 6
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilihan = sc.nextInt();
            sc.nextLine(); // Membersihkan buffer

            switch (pilihan) {
            case 1:
                list.addFirst(inputMahasiswa06(sc));
                break;
            case 2:
                list.addLast(inputMahasiswa06(sc));
                break;
            case 3:
                System.out.print("Masukkan NIM yang dicari : ");
                String keyNim = sc.nextLine();
                System.out.println("Masukkan data baru:");
                list.insertAfter(keyNim, inputMahasiswa06(sc));
                break;
            case 4:
                // MENU 4: Hapus di awal
                list.removeFirst(); 
                break;
            case 5:
                // MENU 5: Hapus di akhir
                list.removeLast();
                break;
            case 6:
                // MENU 6: Tampilkan data 
                list.print(); 
                break;
            case 7: // Modifikasi nomor 6 MENU 7: Tampilkan data terbalik 
                list.printReverse();
                break;
             case 0:
                System.out.println("Program selesai.");
                break;
             default:
                System.out.println("Menu tidak valid.");
    }
 
        } while (pilihan != 0);
    sc.close();
       }
    }

