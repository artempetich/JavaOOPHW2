package org.example.HWRefactor;
import java.util.LinkedList;
import java.util.Map;

public class LaptopFilter extends Filter{
    LinkedList<Laptop> computer = new LinkedList<>();

    public LaptopFilter(LinkedList<Laptop> computer) {
        this.computer = computer;
    }

    @Override
    public void filter(Map<Integer, Integer> criteria) {

        LinkedList<Laptop> offer = new LinkedList<>();
        LinkedList<Laptop> offer2 = new LinkedList<>();
        LinkedList<Laptop> offer3 = new LinkedList<>();
        LinkedList<Laptop> offer4 = new LinkedList<>();

        if (criteria.containsKey(1)) {
            for (Laptop comp : computer) {
                if (comp.getRam() >= criteria.get(1)) offer.add(comp);
            }
            computer = offer;
        }
        if (criteria.containsKey(2)) {
            for (Laptop comp : computer) {
                if (comp.getHdd() >= criteria.get(2)) offer2.add(comp);
            }
            computer = offer2;
        }
        if (criteria.containsKey(3)) {
            if (criteria.get(3) != 1 && criteria.get(3) != 2 && criteria.get(3) != 3) {
                System.out.println("Неправильный ввод параметра операционная система");
            } else {
                String choice1 = new String();
                if (criteria.get(3) == 1) choice1 = "windows";
                else if (criteria.get(3) == 2) choice1 = "ubuntu";
                else if (criteria.get(3) == 3) choice1 = "Mac";

                for (Laptop comp : computer) {
                    if (comp.getOs().equals(choice1)) offer3.add(comp);
                }
                computer = offer3;
            }
        }

        if (criteria.containsKey(4)) {
            if (criteria.get(4) != 1 && criteria.get(4) != 2 && criteria.get(4) != 3) {
                System.out.println("Неправильный ввод параметра цвет");
            } else {
                String choice2 = new String();
                if (criteria.get(4) == 1) choice2 = "black";
                else if (criteria.get(4) == 2) choice2 = "silver";
                else if (criteria.get(4) == 3) choice2 = "pink";

                for (Laptop comp : computer) {
                    if (comp.getColour().equals(choice2)) offer4.add(comp);
                }
                computer = offer4;
            }

        }


        if (computer.size() > 0) {
            for (Laptop el : computer) {
                System.out.println(el);
            }
        } else {
            System.out.println("К сожалению, в нашем магазине нет ноутбука, подходящего под ваш запрос :(");
        }

    }
}
