package minggu_11.Praktikum1;

public class SLLMain06 {
    public static void main(String[] args) {
 
        SingleLinkedList06 sll = new SingleLinkedList06();
 
        // ── Data mahasiswa ──────────────────────────────────────────
        mahasiswa06 mhs1 = new mahasiswa06("24212200", "Alvaro",  "1A", 4.0);
        mahasiswa06 mhs2 = new mahasiswa06("22212202", "Cintia",  "3C", 3.5);
        mahasiswa06 mhs3 = new mahasiswa06("22212202", "Bimon",   "2B", 3.8);
        mahasiswa06 mhs4 = new mahasiswa06("21212203", "Dirga",   "4D", 3.6);

        sll.print(); // kosong → "Linked list kosong"
 
        sll.addFirst(mhs4);
        sll.print(); 
 
        sll.addLast(mhs1);
        sll.print();                        
 
        sll.insertAfter("Dirga", mhs3);       
        sll.insertAt(2, mhs2);               
        sll.print();
    }
}