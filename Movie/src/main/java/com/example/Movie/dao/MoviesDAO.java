package com.example.Movie.dao;

import com.example.Movie.entity.Movie;

public interface MoviesDAO {
    public void addMovie(Movie m1);

    public Movie findById(int id);

    public void deleteById(int id);

    public void updateNameById(int id);

    public void updateDirectorById(int id);

    public  void updateRevenueById(int id);
}
