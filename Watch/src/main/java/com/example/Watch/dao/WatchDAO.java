package com.example.Watch.dao;

import com.example.Watch.entity.Watch;

public interface WatchDAO {
    public void save(Watch w1);

    public  Watch findById(int id);

    public void deleteById(int id);

    public void updatePriceById(int id);

    public void updateTypeById(int id);

    public void updateGenTypeById(int id);
}
