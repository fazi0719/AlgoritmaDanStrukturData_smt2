package minggu_9;

public class StackTugasMahasiswa06 {
    mahasiswa06[] stack;
    int size;
    int top;
 
    // Konstruktor berparameter
    public StackTugasMahasiswa06(int size) {
        this.size = size;
        stack = new mahasiswa06[size];
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
 
    // Tampilkan semua tugas dalam stack / method print
    public void print() {
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
        System.out.println("");
    }   
}

 

