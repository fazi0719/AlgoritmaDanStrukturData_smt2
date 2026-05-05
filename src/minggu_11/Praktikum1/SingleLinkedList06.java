package minggu_11.Praktikum1;

public class SingleLinkedList06 {
    nodeMahasiswa06 head;
    nodeMahasiswa06 tail;

    //  method isEmpty
    boolean isEmpty() {
        return (head == null);
    }

    //  method print (traverse)
    public void print() {
        if (!isEmpty()) {
            nodeMahasiswa06 tmp = head;
            System.out.println("Isi Linked List:\t");
            while (tmp != null) {
                tmp.data.tampilInformasi();
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked list kosong");
        }
    }


    //  method addFirst 
    public void addFirst(mahasiswa06 input) {
        nodeMahasiswa06 ndInput = new nodeMahasiswa06(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    
    //  method addLast 
    public void addLast(mahasiswa06 input) {
        nodeMahasiswa06 ndInput = new nodeMahasiswa06(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    
    //  method insertAfter (insertAfter adalah menyisipkan node setelah node dengan nama tertentu)
    public void insertAfter(String key, mahasiswa06 input) {
        nodeMahasiswa06 ndInput = new nodeMahasiswa06(input, null);
        nodeMahasiswa06 temp = head;
        do {
            if (temp.data.nama.equalsIgnoreCase(key)) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }

    
    //  method insertAt (adalah menyisipkan node pada indeks tertentu, indeks dimulai dari 0)
    public void insertAt(int index, mahasiswa06 input) {
        if (index < 0) {
            System.out.println("indeks salah");
        } else if (index == 0) {
            addFirst(input);
        } else {
            nodeMahasiswa06 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = new nodeMahasiswa06(input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
        }
        // Praktikum 2 - Single Linked List
         //  getData – akses data pada indeks tertentu
    
    public void getData(int index) {
        nodeMahasiswa06 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        tmp.data.tampilInformasi();
    }
 
     
    //  indexOf – cari indeks berdasarkan nama
    //  method indexOf (adalah mencari indeks node berdasarkan nama, jika tidak ditemukan maka mengembalikan nilai -1)
    public int indexOf(String key) {
        nodeMahasiswa06 tmp = head;
        int index = 0;
        while (tmp != null && !tmp.data.nama.equalsIgnoreCase(key)) {
            tmp = tmp.next;
            index++;
        }
        if (tmp == null) {
            return -1;
        } else {
            return index;
        }
    }
     
    //  removeFirst – hapus node pertama 
    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List masih Kosong, tidak dapat dihapus!");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }
 
    //  removeLast – hapus node terakhir
    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List masih Kosong, tidak dapat dihapus!");
        } else if (head == tail) {
            head = tail = null;
        } else {
            nodeMahasiswa06 temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }
 
    //  remove – hapus node berdasarkan nama (key)
    public void remove(String key) {
        if (isEmpty()) {
            System.out.println("Linked List masih Kosong, tidak dapat dihapus!");
        } else {
            nodeMahasiswa06 temp = head;
            while (temp != null) {
                if ((temp.data.nama.equalsIgnoreCase(key)) && (temp == head)) {
                    this.removeFirst();
                    break;
                } else if (temp.data.nama.equalsIgnoreCase(key)) {
                    temp.next = temp.next.next;
                    if (temp.next == null) {
                        tail = temp;
                    }
                    break;
                }
                temp = temp.next;
            }
        }
    }
 

    //  removeAt – hapus node pada indeks tertentu
    public void removeAt(int index) {
        if (index == 0) {
            removeFirst();
        } else {
            nodeMahasiswa06 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (temp.next == null) {
                tail = temp;
            }
        }
    }
}

    

