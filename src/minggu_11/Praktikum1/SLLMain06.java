package minggu_11.Praktikum1;
import java.util.Scanner;
public class SLLMain06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList06 sll = new SingleLinkedList06();
        
        // MODIFIKASI SOAL 3
        System.out.println("=== input data mahasiswa ===");
        // contoh input data mahasiswa dari keyboard
        System.out.print("Masukkan NIM    : ");
        String nim = sc.nextLine();
        System.out.print("Masukkan Nama   : ");
        String nama = sc.nextLine();
        System.out.print("Masukkan Kelas  : ");
        String kelas = sc.nextLine();
        System.out.print("Masukkan IPK    : ");
        double ipk = sc.nextDouble();
        sc.nextLine(); // Membersihkan buffer
        mahasiswa06 mhsInput = new mahasiswa06(nim, nama, kelas, ipk);
        sll.addFirst(mhsInput); 

        // ── Data mahasiswa ──────────────────────────────────────────
        mahasiswa06 mhs1 = new mahasiswa06("24212200", "Alvaro",  "1A", 4.0);
        mahasiswa06 mhs2 = new mahasiswa06("22212202", "Cintia",  "3C", 3.5);
        mahasiswa06 mhs3 = new mahasiswa06("22212202", "Bimon",   "2B", 3.8);
        mahasiswa06 mhs4 = new mahasiswa06("21212203", "Dirga",   "4D", 3.6);

        sll.print(); // Akan mencetak "Linked list kosong"

        sll.addFirst(mhs4); 
        sll.addLast(mhs1);      
        sll.insertAfter("Dirga", mhs2); 
        sll.insertAt(2, mhs3);          
        sll.print(); 
 
        System.out.print("data index 1 : ");
        sll.getData(1);
        System.out.println("data mahasiswa an Bimon berada pada index : " + sll.indexOf("bimon"));
        System.out.println();
 
        sll.removeFirst();
        sll.removeLast();
        sll.print();               
        sll.removeAt(0);
        sll.print();               
    }
}
    