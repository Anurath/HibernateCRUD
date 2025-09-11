package com.example.Watch.dao.daoImpl;

import com.example.Watch.dao.WatchDAO;
import com.example.Watch.entity.Watch;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Scanner;

@Repository
public class WatchDAOImpl implements WatchDAO {

    Scanner sc = new Scanner(System.in);

    private final EntityManager theManager;

    @Autowired
    public WatchDAOImpl(EntityManager theManager) {
        this.theManager = theManager;
    }


    @Override
    @Transactional
    public void save(Watch w1) {
        theManager.persist(w1);
        System.out.println("Watch Information Added Successfully");
    }

    @Override
    public Watch findById(int id) {
        return theManager.find(Watch.class,id);
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        Watch w1 = findById(id);
        if(w1!=null)
        {
            theManager.remove(w1);
            System.out.println(w1);
            System.out.println("Watch Information Deleted Successfully.");
        }
        else {
            System.out.println("Watch Info Not Found!");
        }
    }

    @Override
    @Transactional
    public void updatePriceById(int id) {
        Watch w1 = findById(id);
        if(w1!=null)
        {
            System.out.println(w1);
            System.out.print("Enter Price Of Watch: ");
            w1.setPrice(sc.nextDouble());
            System.out.println("Watch Information Updated Successfully.");
            System.out.println(w1);
        }
        else {
            System.out.println("Watch Info Not Found!");
        }
    }

    @Override
    @Transactional
    public void updateTypeById(int id) {
        Watch w1 = findById(id);
        if(w1!=null)
        {
            System.out.println(w1);
            System.out.print("Enter Type(Analog / Digital) Of Watch: ");
            w1.setType(sc.nextLine());
            System.out.println("Watch Information Updated Successfully.");
            System.out.println(w1);
        }
        else {
            System.out.println("Watch Info Not Found!");
        }
    }

    @Override
    @Transactional
    public void updateGenTypeById(int id) {
        Watch w1 = findById(id);
        if(w1!=null)
        {
            System.out.println(w1);
            System.out.print("Enter Type(Female / Male) Of Watch: ");
            w1.setGenType(sc.nextLine());
            System.out.println(w1);
            System.out.println("Watch Information Updated Successfully.");
        }
        else {
            System.out.println("Watch Info Not Found!");
        }
    }


}
