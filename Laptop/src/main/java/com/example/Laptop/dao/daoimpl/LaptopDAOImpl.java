package com.example.Laptop.dao.daoimpl;

import com.example.Laptop.dao.LaptopDAO;
import com.example.Laptop.entity.Laptop;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Scanner;

@Repository
public class LaptopDAOImpl implements LaptopDAO {
    Scanner sc = new Scanner(System.in);
    private final EntityManager theManager;

    @Autowired
    public LaptopDAOImpl(EntityManager theManager) {
        this.theManager = theManager;
    }

    @Override
    @Transactional
    public void addLaptop(Laptop l) {
        theManager.persist(l);
    }

    @Override
    public Laptop findById(int id) {
        return theManager.find(Laptop.class,id);
    }

    @Override
    public Laptop findByImie(long imie) {
        try{
            Query query = theManager.createQuery("select l from Laptop l where imie=:theImie");
            query.setParameter("theImie",imie);
            return  (Laptop) query.getSingleResult();
        }catch (NoResultException noe)
        {
            return null;
        }
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        Laptop l1 = findById(id);
        if(l1!=null)
        {
            theManager.remove(l1);
            System.out.println("Laptop data removed successfully.");
        }
        else{
            System.out.println("Laptop not found!");
        }
    }

    @Override
    @Transactional
    public void deleteByImie(long imie) {
        Laptop l1 = findByImie(imie);
        if(l1!=null)
        {
            theManager.remove(l1);
        }
        else{
            System.out.println("Laptop Not Found!");
        }
    }

    @Override
    @Transactional
    public void updateBrandById(int id) {
        Laptop l1 = findById(id);
        if(l1!=null)
        {
            System.out.print("Enter Brand Name: ");
            l1.setBrand(sc.nextLine());
            System.out.println(l1);
        }
        else{
            System.out.println("Laptop Not Found!");
        }
    }

    @Override
    @Transactional
    public void updateModelById(int id) {
        Laptop l1 = findById(id);
        if(l1!=null)
        {
            System.out.println(l1);
            System.out.print("Enter Model Mame: ");
            l1.setModel(sc.nextLine());
            System.out.println(l1);
        }
        else{
            System.out.println("Laptop Not Found!");
        }
    }

    @Override
    @Transactional
    public void updatePriceById(int id) {
        Laptop l1 = findById(id);

        if(l1!=null)
        {
            System.out.println(l1);
            System.out.print("Update Price: ");
            l1.setPrice(sc.nextDouble());
            System.out.println(l1);
            System.out.println("Price Updated Successfully.");
        }
        else{
            System.out.println("Laptop Not Found!");
        }
    }

    @Override
    @Transactional
    public void updateLaptopById(int id) {
        Laptop l1 = findById(id);

        if(l1!=null)
        {
            while(true)
            {
                System.out.println("Enter 1 to Update Brand: ");
                System.out.println("Enter 2 to Update IMIE: ");
                System.out.println("Enter 3 to Update Model: ");
                System.out.println("Enter 4 to Update Price: ");
                System.out.println("Enter 5 to Update Processor: ");
                System.out.println("Enter 6 to Update RAM: ");
                System.out.println("Enter 7 to Update ROM: ");
                System.out.println("Enter 8 to Update Type: ");
                System.out.println("Enter 9 to Make Final Change: ");
                int opt = sc.nextInt();
                sc.nextInt();
                if(opt==9)
                {
                    break;
                }
                switch (opt)
                {
                    case 1:
                    {
                        System.out.print("Enter Brand Name: ");
                        l1.setBrand(sc.nextLine());
                        break;
                    }
                    case 2:
                    {
                        System.out.print("Enter IMIE: ");
                        l1.setImie(sc.nextLong());
                        break;
                    }
                    case 3:
                    {
                        System.out.print("Enter Model Name: ");
                        l1.setModel(sc.nextLine());
                        break;
                    }
                    case 4:
                    {
                        System.out.print("Enter Price: ");
                        l1.setPrice(sc.nextDouble());
                        break;
                    }
                    case 5:
                    {
                        System.out.print("Enter Processor: ");
                        l1.setProcessor(sc.nextLine());
                        break;
                    }
                    case 6:
                    {
                        System.out.print("Enter RAM: ");
                        l1.setRam(sc.nextInt());
                        break;
                    }
                    case 7:
                    {
                        System.out.print("Enter ROM: ");
                        l1.setRom(sc.nextInt());
                        break;
                    }
                    case 8:
                    {
                        System.out.print("Enter Type: ");
                        l1.setBrand(sc.nextLine());
                        break;
                    }
                }
            }
            System.out.println("Changes Saved");
        }
        else {
            System.out.println("Laptop Not Found!");
        }
    }


    public void addLaptop(String brand, String model, String processor, String type, long imie, double price, int ram, int rom) {
    }
}
