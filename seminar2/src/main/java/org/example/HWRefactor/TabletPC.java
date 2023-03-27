package org.example.HWRefactor;
public class TabletPC extends Computer{
    private double weight;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public TabletPC(String name, int ram, int hdd, String os, String colour, double weight) {
        super(name, ram, hdd, os, colour);
        this.weight = weight;
    }
    @Override
    public String toString() {

        return String.format(" %s, %d, %d, %s, %s, %f", name, ram, hdd, os, colour, weight);


    }
}