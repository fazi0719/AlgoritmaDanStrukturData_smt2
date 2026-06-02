package minggu_14;

import java.util.ArrayList;
import java.util.Collections;

public class DemoArrayList06 {
    
    public static void main(String[] args) {
 
        // Langkah 2:
        ArrayList<Customer06> customers = new ArrayList<>(2);
 
        Customer06 customer1 = new Customer06(1, "Zakia");
        Customer06 customer2 = new Customer06(5, "Budi");
 
        customers.add(customer1);
        customers.add(customer2);
        customers.add(new Customer06(4, "Cica"));
        customers.add(2, new Customer06(100, "Rosa"));

        System.out.println(customers.indexOf(customer2));

        Customer06 customer = customers.get(1);
        System.out.println(customer.name);
        customer.name = "Budi Utomo";
 
        for (Customer06 cust : customers) {
            System.out.println(cust.toString());
        }

        ArrayList<Customer06> newCustomers = new ArrayList<>();
        newCustomers.add(new Customer06(201, "Della"));
        newCustomers.add(new Customer06(202, "Victor"));
        newCustomers.add(new Customer06(203, "Sarah"));
 
        customers.addAll(newCustomers);
 
        for (Customer06 cust : customers) {
            System.out.println(cust.toString());
        }

        System.out.println(customers);

        // Langkah 13.6: Sorting
        ArrayList<String> daftarSiswa = new ArrayList<>();
        daftarSiswa.add("Zainab");
        daftarSiswa.add("Andi");
        daftarSiswa.add("Rara");
        Collections.sort(daftarSiswa);
        System.out.println(daftarSiswa);

        customers.sort((c1, c2) -> c1.name.compareTo(c2.name));
        System.out.println(customers);
}
}