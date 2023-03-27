package org.example.HWRefactor;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        LinkedList<Laptop> storageLaptops = new LinkedList<>(Arrays
                .asList(new Laptop("Laptop1", 16, 128, "windows", "pink"),
                        new Laptop("Laptop2", 32, 256, "ubuntu", "black"),
                        new Laptop("Laptop3", 8, 128, "windows", "black"),
                        new Laptop("Laptop4", 16, 256, "ubuntu", "silver"),
                        new Laptop("Laptop5", 32, 256, "Mac", "black")));
        LaptopFilter filter1 = new LaptopFilter(storageLaptops);

        Map<Integer, Integer> ourCriteria = filter1.getCriteria();

        filter1.filter(ourCriteria);


//        LinkedList<TabletPC> storageTablets = new LinkedList<>(Arrays
//                .asList(new TabletPC("Tablet1", 16, 128, "windows", "pink", 1.2),
//                        new TabletPC("Tablet2", 32, 256, "ubuntu", "black", 0.9),
//                        new TabletPC("Tablet3", 8, 128, "windows", "black", 2.3),
//                        new TabletPC("Tablet4", 16, 256, "ubuntu", "silver", 1.1),
//                        new TabletPC("Tablet5", 32, 256, "Mac", "black", 0.4)));
//
//        TabletPCFilter filter2 = new TabletPCFilter(storageTablets);
//
//        Map<Integer, Integer> ourCriteria2 = filter2.getCriteria();
//
//        filter2.filter(ourCriteria2);

    }

}
