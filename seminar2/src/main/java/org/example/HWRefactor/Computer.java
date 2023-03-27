package org.example.HWRefactor;
public abstract class Computer {
    protected Integer ID;
    protected String name;
    protected Integer ram;
    protected Integer hdd;
    protected String os;
    protected String colour;
    protected Integer count = 1;


    public Computer( String name, int ram, int hdd, String os, String colour) {
        this.ID = count;
        count++;
        this.name = name;
        this.ram = ram;
        this.hdd = hdd;
        this.os = os;
        this.colour = colour;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public Integer getHdd() {
        return hdd;
    }

    public void setHdd(Integer hdd) {
        this.hdd = hdd;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    @Override
    public String toString() {
        return String.format(" %s, %d, %d, %s, %s", name, ram, hdd, os, colour);
    }
}
