package minggu_9;

public class StackSurat06 {
    surat06[] stack;
    int size;
    int top;
 
    public StackSurat06(int size) {
        this.size = size;
        stack = new surat06[size];
        top = -1;
    }
 
    public boolean isFull() {
        return top == size - 1;
    }
 
    public boolean isEmpty() {
        return top == -1;
    }
 
    public void push(surat06 surat) {
        if (!isFull()) {
            top++;
            stack[top] = surat;
            System.out.println("Surat berhasil ditambahkan.");
        } else {
            System.out.println("Stack penuh! Tidak bisa menerima surat lagi.");
        }
    }
 
    public surat06 pop() {
        if (!isEmpty()) {
            surat06 s = stack[top];
            top--;
            return s;
        } else {
            System.out.println("Stack kosong! Tidak ada surat untuk diproses.");
            return null;
        }
    }
 
    public surat06 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada surat.");
            return null;
        }
        }
 
    // Fitur Cari Surat berdasarkan Nama 
    public void cariSurat(String nama) {
        boolean ditemukan = false;
        for (int i = top; i >= 0; i--) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                System.out.println("Surat ditemukan pada tumpukan ke-" + (i + 1));
                System.out.println("ID: " + stack[i].idSurat + " | Nama: " + stack[i].namaMahasiswa +
                                   " | Jenis: " + stack[i].jenisIzin + " | Durasi: " + stack[i].durasi + " hari");
                ditemukan = true;
                break; 
            }
        }
        if (!ditemukan) {
            System.out.println("Surat atas nama " + nama + " tidak ditemukan.");
        }
    }
}


