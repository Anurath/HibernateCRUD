package com.example.Laptop.dao;

import com.example.Laptop.entity.Laptop;

public interface LaptopDAO {
    public  void addLaptop(Laptop l);

    public Laptop findById(int id);

    public Laptop findByImie(long imie);

    public void deleteById(int id);

    public  void deleteByImie(long imie);

    public void updateBrandById(int id);

    public void updateModelById(int id);

    public void updatePriceById(int id);
}
