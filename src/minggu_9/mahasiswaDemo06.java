package minggu_9;
import java.util.Scanner;

public class mahasiswaDemo06 {
    public static void main(String[] args) {
        StackTugasMahasiswa06 stack = new StackTugasMahasiswa06(5);
        Scanner sc = new Scanner(System.in);
        int pilih;
 
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.println("5. Lihat Tugas Terbawah");  // pertanyaan 4
            System.out.println("6. Hitung Jumlah Tugas"); // pertanyaan 5
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    mahasiswa06 mhs = new mahasiswa06(nama, nim, kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.nama);
                    break;
 
                case 2:
                    mahasiswa06 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Menilai tugas dari " + dinilai.nama);
                        System.out.print("Masukkan nilai (0-100): ");
                        int nilai = sc.nextInt();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Nilai Tugas %s adalah %d\n", dinilai.nama, nilai);
                        // Konversi nilai ke biner (Percobaan 2)
                        String biner = stack.konversiDesimalKeBiner(nilai);
                        System.out.println("Nilai Biner Tugas: " + biner);
                    }
                    break;
 
                case 3:
                    mahasiswa06 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Tugas terakhir dikumpulkan oleh " + lihat.nama);
                    }
                    break;
 
                case 4:
                    System.out.println("Daftar semua tugas");
                    System.out.println("Nama\tNIM\tKelas");
                    stack.print();
                    break;
                    
                // pertaanyaan 4: lihat tugas terbawah (pertama dikumpulkan)
                case 5:
                mahasiswa06 terbawah = stack.peekBottom();
                if (terbawah != null) {
                System.out.println("Mahasiswa pertama yang mengumpulkan: " + terbawah.nama);
                    }
                break;

                // pertanyaan 5: hitung jumlah tugas yang ada di stack
                case 6: 
                int jumlah = stack.hitungTugas();
                System.out.println("Jumlah tugas yang sudah dikumpulkan: " + jumlah);
                break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih >= 1 && pilih <= 6);
 
    }
}