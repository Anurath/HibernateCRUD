package com.example.Movie.dao.daoimpl;

import com.example.Movie.dao.MoviesDAO;
import com.example.Movie.entity.Movie;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Scanner;

@Repository
public class MoviesDAOImpl implements MoviesDAO {
    Scanner sc = new Scanner(System.in);
    private final EntityManager theManager;

    @Autowired
    public MoviesDAOImpl(EntityManager theManager) {
        this.theManager = theManager;
    }

    @Override
    @Transactional
    public void addMovie(Movie m1) {
        theManager.persist(m1);
        System.out.println("Movie Added Successfully.");
    }

    @Override
    public Movie findById(int id) {
        return theManager.find(Movie.class,id);
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        Movie m1 = findById(id);
        if(m1!=null)
        {
            theManager.remove(m1);
            System.out.println("Movie Removed Successfully.");
        }
        else{
            System.out.println("Movie Not Fount!");
        }
    }

    @Override
    @Transactional
    public void updateNameById(int id) {
        Movie m1 = findById(id);
        if(m1!=null)
        {
            System.out.println(m1);
            System.out.print("Enter New Name: ");
            m1.setName(sc.nextLine());
            System.out.println("Movie Name Updated Successfully!");
            System.out.println(m1);
        }
        else {
            System.out.println("Movie Not Found!");
        }
    }
}
