package minggu_12.Praktikum1;

public class DoubleLinkedList06 {
    Node06 head;
    Node06 tail;

    //  Konstruktor  menginisialisasi linked list kosong
    public DoubleLinkedList06() {
        head = null;
        tail = null;
    }

    //  Menambahkan method utk Mengecek apakah linked list kosong
    public boolean isEmpty() {
        return head == null;
    }

    // Menambahkan node baru di awal linked list
    public void addFirst(mahasiswa06 data) {
        Node06 newNode = new Node06(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev    = newNode;
            head         = newNode;
        }
    }

    //  Menambahkan node baru di akhir linked list
    public void addLast(mahasiswa06 data) {
        Node06 newNode = new Node06(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next    = newNode;
            newNode.prev = tail;
            tail         = newNode;
        }
    }

    //  Menyisipkan node baru setelah node dengan NIM tertentu
    public void insertAfter(String keyNim, mahasiswa06 data) {
        Node06 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Data dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }

        Node06 newNode = new Node06(data);

        // Jika current adalah tail, node baru ditambahkan di akhir
        if (current == tail) {
            newNode.prev = current;
            current.next = newNode;
            tail         = newNode;
        } else {
            // Node baru disisipkan di tengah
            newNode.prev       = current;
            newNode.next       = current.next;
            current.next.prev  = newNode;
            current.next       = newNode;
        }
        System.out.println("Data berhasil disisipkan setelah NIM " + keyNim);
    }

    //  Mencetak isi linked list dari head ke tail
   // print
    public void print() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong"); // modifikasi nomor 5 pesan untuk menampilkan bahwa linked list kosong
            return;
        }

        Node06 current = head;
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
    }

    // modifikasi nomor 6 menampilkan data dari belakang ke depan atau dari tail ke head
public void printReverse() {
    if (isEmpty()) {
        System.out.println("Linked List masih kosong");
        return;
    }

    Node06 current = tail;

    while (current != null) {
        current.data.tampil();
        current = current.prev;
    }
}
    // percobaan 2 
     // hapus depan
    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("List kosong");
            return;
        }
        // modifikasi percobaan 2 nomor 2
        System.out.println("Data berhasil dihapus:");
        head.data.tampil();

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    // hapus belakang percobaan 2
    public void removeLast() {
        if (isEmpty()) {
            System.out.println("List kosong");
            return;
        }
        // modifikasi percobaan 2 nomor 2
        System.out.println("Data berhasil dihapus:");
        tail.data.tampil();

        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }
}