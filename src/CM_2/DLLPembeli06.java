package CM_2;

public class DLLPembeli06 {
     NodePembeli06 head;
    NodePembeli06 tail;

    // /Konstruktor Kondisi awal linked list kosong
    public DLLPembeli06() {
        head = null;
        tail = null;
    }

    // Method isEmpty digunakan untuk mengecek apakah linked list kosong
    boolean isEmpty() {
        return head == null;
    }


   // Method addLast digunakan untuk menambahkan pembeli di belakang antrean
    public void addLast(Pembeli06 data) {
        // membuat node baru
        NodePembeli06 newNode =
                new NodePembeli06(null, data, null);

        // Jika linked list masih kosong, maka head dan tail menunjuk ke node yang sama
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            // next tail lama menunjuk ke node baru
            tail.next = newNode;
            // prev node baru menunjuk tail lama
            newNode.prev = tail;
            // tail berpindah ke node baru
            tail = newNode;
        }

        System.out.println("Pembeli masuk ke antrean");
    }

    // Method print digunakan untuk menampilkan seluruh antrean 
    public void print() {

        // cek apakah linked list kosong
        if (isEmpty()) {
            System.out.println("Antrean masih kosong");
        } else {

            System.out.println("===== DAFTAR ANTREAN =====");

            // temp digunakan untuk traversal dari head menuju tail
            NodePembeli06 temp = head;

            // traversal selama temp tidak null
            while (temp != null) {

                System.out.println("---------------------");

                temp.data.tampil();
                temp = temp.next;
            }

            System.out.println("---------------------");
        }
    }

    // Method removeFirst digunakan untuk mengambil antrean paling depan
    public Pembeli06 removeFirst() {

        // cek apakah linked list kosong
        if (isEmpty()) {
            System.out.println("Antrean kosong");
            return null;
        }

        // menyimpan data yang akan dihapus
        Pembeli06 dataHapus = head.data;

        if (head == tail) {

            head = null;
            tail = null;

        } else {

            // head berpindah ke node berikutnya
            head = head.next;

            // prev head harus null karena sekarang menjadi node pertama
            head.prev = null;
        }

        System.out.println("Antrean berhasil dipanggil");

        // mengembalikan data pembeli yang dipanggil
        return dataHapus;
    }

    // Method countQueue digunakan untuk menghitung jumlah antrean
    public int countQueue() {

        int jumlah = 0;

        NodePembeli06 temp = head;

        while (temp != null) {
            jumlah++;
            temp = temp.next;
        }

        return jumlah;
    }
       }
        
    

