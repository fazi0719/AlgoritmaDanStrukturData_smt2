package minggu_9;

public class StackTugasMahasiswa06 {
    mahasiswa06[] stack;
    int size;
    int top;
 
    // Konstruktor berparameter
    public StackTugasMahasiswa06(int size) {
        this.size = size; // ukuran stack = 5
        stack = new mahasiswa06[size]; //array berkapasitas 5 untuk menyimpan objek mahasiswa
        top = -1;
    }
 
    // Cek apakah stack penuh / method isFull
    public boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }
 
    // Cek apakah stack kosong / method isEmpty
    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }
 
    // Tambah tugas mahasiswa ke stack / method push
    public void push(mahasiswa06 mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi.");
        }
    }
 
    // Keluarkan tugas paling atas (untuk dinilai) / method pop
    public mahasiswa06 pop() {
        if (!isEmpty()) {
            mahasiswa06 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
            return null;
        }
    }
 
    // Lihat tugas paling atas tanpa mengeluarkannya / method peek
    public mahasiswa06 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan");
            return null;
        }
    }

    // Tambahkan method ini untuk melihat tugas paling bawah (pertanyaan 4)
    public mahasiswa06 peekBottom() {
        if (!isEmpty()) {
        return stack[0]; // index 0 = mahasiswa pertama yang mengumpulkan
    } else {
        System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan");
        return null;
     }
    }
    // pertanyaan 5: method untuk menghitung jumlah tugas yang ada di stack
    public int hitungTugas() {
    return top + 1; // top=-1 saat kosong, jadi +1 untuk mendapat jumlah sebenarnya
}
 
   // method print untuk menampilkan semua tugas yang ada di stack (pertanyaaan 1)
    public void print() {
    for (int i = top; i >= 0; i--) {  // dari atas ke bawah
        System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
    }
    System.out.println("");
}
 // PERCOBAAN 2: method untuk mengkonversi bilangan desimal ke biner menggunakan stack
    public String konversiDesimalKeBiner(int nilai) {
        StackKonversi06 stack = new StackKonversi06();
        while (nilai > 0) {
            int sisa = nilai % 2;
            stack.push(sisa);
            nilai = nilai / 2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }
}
