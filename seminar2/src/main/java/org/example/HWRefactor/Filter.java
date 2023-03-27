package org.example.HWRefactor;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public abstract class Filter {
    LinkedList<Computer> computer = new LinkedList<>();

    public Map<Integer, Integer> getCriteria() {

        Map<Integer, Integer> criteria = new HashMap<>();
        while (true) {
            System.out.println("""
                    Введите цифру, соответствующую необходимому критерию:
                     Для завершения ввода параметров введите 0\s
                    1 - ОЗУ
                    2 - Объем ЖД
                    3 - Операционная система
                    4 - Цвет\s""");

            int choice = validEnter();
            switch (choice) {
                case (1):
                    System.out.println("8Гб - введите 8, 16 гб - введите 16, 32Гб - введите 32, 64Гб - введите 64");
                    int a = validEnter();
                    criteria.put(1, a);
                    // ramFilter(a, storageLaptops);
                    break;
                case (2):
                    System.out.println("128Гб - введите 128, 256 гб - введите 256");
                    int b = validEnter();
                    criteria.put(2, b);
                    // hddFilter(b, storageLaptops);
                    break;
                case (3):
                    System.out.println("windows - введите 1, ubuntu - введите 2, Mac - введите 3");
                    int c = validEnter();
                    criteria.put(3, c);
                    // osFilter(c, storageLaptops);
                    break;
                case (4):
                    System.out.println("black - введите 1,  silver - введите 2, pink - введите 3");
                    int d = validEnter();
                    criteria.put(4, d);
                    // colourFilter(d, storageLaptops);
                    break;
                case (0):
                    System.out.println("Ввод параметров подбора закончен");
                    return criteria;
            }
            System.out.println(criteria);
        }
    }

    public void filter(Map<Integer, Integer> criteria) {

        LinkedList<Computer> offer = new LinkedList<>();
        LinkedList<Computer> offer2 = new LinkedList<>();
        LinkedList<Computer> offer3 = new LinkedList<>();
        LinkedList<Computer> offer4 = new LinkedList<>();

        if (criteria.containsKey(1)) {
            for (Computer comp : computer) {
                if (comp.getRam() >= criteria.get(1)) offer.add(comp);
            }
            computer = offer;
        }
        if (criteria.containsKey(2)) {
            for (Computer comp : computer) {
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

                for (Computer comp : computer) {
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

                for (Computer comp : computer) {
                    if (comp.getColour().equals(choice2)) offer4.add(comp);
                }
                computer = offer4;
            }

        }



        if (computer.size() > 0) {
            for (Computer el : computer) {
                System.out.println(el);
            }
        } else {
            System.out.println("К сожалению, в нашем магазине нет ноутбука, подходящего под ваш запрос :(");
        }

    }


    public int validEnter() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            if (sc.hasNextInt()) {
                return Integer.parseInt(sc.nextLine());
            } else {
                System.out.println("Неверный ввод, попробуйте еще раз");
                sc.nextLine();
            }
        }
    }
}
