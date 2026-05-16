package CM_2;

public class DLLPesanan06 {

    NodePesanan06 head;
    NodePesanan06 tail;

   
    public DLLPesanan06() {
        head = null;
        tail = null;
    }

    boolean isEmpty() {
        return head == null;
    }

    
    public void addLast(Pesanan06 data) {

        NodePesanan06 newNode =
                new NodePesanan06(null, data, null);

      
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;

            newNode.prev = tail;

            tail = newNode;
        }

        System.out.println(
                "Pesanan berhasil ditambahkan");
    }

  
     //Bubble Sort:  Membandingkan nama pesanan satu per satu.
    //Jika urutan alfabet salah maka data ditukar.
    // Proses diulang sampai semua data terurut.

    public void bubbleSort() {

        if (head == null || head.next == null) {
            return;
        }

        boolean tukar;

        do {

            tukar = false;

            NodePesanan06 current = head;

            while (current.next != null) {

                /*
                Membandingkan nama pesanan
                */
                if (current.data.namaPesanan
                        .compareToIgnoreCase(
                                current.next.data.namaPesanan) > 0) {

                    /*
                    Menukar data pesanan
                    */
                    Pesanan06 sementara =
                            current.data;

                    current.data =
                            current.next.data;

                    current.next.data =
                            sementara;

                    tukar = true;
                }

                current = current.next;
            }

        } while (tukar);
    }

    // Method print digunakan untuk
    // menampilkan laporan pesanan
   
    public void print() {

        //  Sorting terlebih dahulu
  
        bubbleSort();

   
        if (isEmpty()) {

            System.out.println(
                    "Belum ada pesanan");

        } else {

            System.out.println(
                    "==========================================");

            System.out.println(
                    "LAPORAN PESANAN (URUT NAMA PESANAN)");

            System.out.println(
                    "==========================================");

            System.out.printf(
                    "%-15s %-20s %-10s\n",
                    "Kode Pesanan",
                    "Nama Pesanan",
                    "Harga");
            // variabel untuk menghitung total pendapatan
            int totalPendapatan = 0;

            NodePesanan06 temp = head;

          
            while (temp != null) {

                System.out.printf("%-15d %-20s %-10d\n",temp.data.kodePesanan,temp.data.namaPesanan,temp.data.harga);

               // menambahkan harga pesanan ke total pendapatan
                totalPendapatan += temp.data.harga;
                temp = temp.next;
            }

            System.out.println(
                    "==========================================");

            System.out.println(
                    "Total Pendapatan : Rp "
                    + totalPendapatan);
        }
    }

    /*
    Menghitung jumlah pesanan
    */
    public int countPesanan() {

        int jumlah = 0;

        NodePesanan06 temp = head;

        while (temp != null) {

            jumlah++;

            temp = temp.next;
        }

        return jumlah;
    }
}