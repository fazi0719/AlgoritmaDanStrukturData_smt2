package minggu_11.Tugas;

public class QueueLinkedList06 {
    nodeQueue06 front;
    nodeQueue06 rear;
    int size;

    public boolean isEmpty() {
        return front == null;
    }

    // ENQUEUE (tambah belakang) - Gunakan tipe MahasiswaQueue06
    public void enqueue(MahasiswaQueue06 data) {
        nodeQueue06 newNode = new nodeQueue06(data, null);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println("Data " + data.nama + " masuk ke queue");
    }

    // DEQUEUE (hapus depan)
    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue kosong");
        } else {
            System.out.print("Data keluar: ");
            front.data.tampilInformasi(); // Perbaiki nama method
            System.out.println();
            front = front.next;
            if (front == null) rear = null;
            size--;
        }
    }

    // PEEK (lihat depan)
    public void peek() {
        if (!isEmpty()) {
            System.out.print("Data terdepan: ");
            front.data.tampilInformasi(); // Perbaiki nama method
            System.out.println();
        } else {
            System.out.println("Queue kosong");
        }
    }
    
    // PRINT (traverse)
    public void print() {
        if (!isEmpty()) {
            nodeQueue06 tmp = front;
            System.out.println("Isi Queue:");
            while (tmp != null) {
                tmp.data.tampilInformasi(); // Perbaiki nama method
                System.out.println();
                tmp = tmp.next;
            }
            System.out.println("Jumlah data: " + size);
        } else {
            System.out.println("Queue kosong");
        }
    }
}