package com.example.Laptop.entity;

import jakarta.persistence.*;

@Entity
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String brand;
    private String model;
    private String processor;
    private String type;
    private long imie;
    private double price;
    private  int ram;
    private  int rom;

    //No Argument Constructors
    public Laptop() {
    }

    public Laptop(String brand, String model, String processor, String type, long imie, double price, int ram, int rom) {
        this.brand = brand;
        this.model = model;
        this.processor = processor;
        this.type = type;
        this.imie = imie;
        this.price = price;
        this.ram = ram;
        this.rom = rom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getImie() {
        return imie;
    }

    public void setImie(long imie) {
        this.imie = imie;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getRom() {
        return rom;
    }

    public void setRom(int rom) {
        this.rom = rom;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", processor='" + processor + '\'' +
                ", type='" + type + '\'' +
                ", imie=" + imie +
                ", price=" + price +
                ", ram=" + ram +
                ", rom=" + rom +
                '}';
    }
}
