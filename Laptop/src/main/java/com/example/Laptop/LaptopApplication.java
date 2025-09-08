package com.example.Laptop;

import com.example.Laptop.dao.daoimpl.LaptopDAOImpl;
import com.example.Laptop.entity.Laptop;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Scanner;

@SpringBootApplication
public class LaptopApplication {

    @Bean
    public CommandLineRunner commandLineRunner(LaptopDAOImpl theLaptop)
    {
        return runner->{
            Scanner sc = new Scanner(System.in);


//                 To save Laptop data

//                System.out.print("Enter the Brand: ");
//                String brand = sc.nextLine();
//
//                System.out.print("Enter the Model: ");
//                String model = sc.nextLine();
//
//                System.out.print("Enter the Processor: ");
//                String processor = sc.nextLine();

//                System.out.print("Enter Laptop Type: ");
//                String type = sc.nextLine();
//
//                System.out.print("Enter the IMIE number: ");
//                long imie = sc.nextLong();
//
//                System.out.print("Enter the Price: ");
//                double price = sc.nextDouble();
//                sc.nextLine();
//
//                System.out.print("Enter the RAM: ");
//                int ram = sc.nextInt();
//                sc.nextLine();
//
//                System.out.print("Enter the ROM: ");
//                int rom = sc.nextInt();
//                sc.nextLine();
//
//                theLaptop.addLaptop(new Laptop(brand,model,processor,type,imie,price,ram,rom));





//            Find by Id
//
//            System.out.print("Enter the Laptop Id: ");
//            Laptop l1 =  theLaptop.findById(sc.nextInt());
//            System.out.println(l1);

//            Remove by ID

//            System.out.println("Enter Laptop Id to Remove: ");
//            theLaptop.deleteById(sc.nextInt());

//            Find by Imie number

//            System.out.print("Enter imie number to Find laptop: ");
//            Laptop l1 = theLaptop.findByImie(sc.nextLong());
//            System.out.println(l1);

//            Delete by imie
//            System.out.println("Enter the imie to delete Laptop Data: ");
//            theLaptop.deleteByImie(sc.nextLong());

//            Brand Update by id

//            System.out.print("Enter the id to update laptop: ");
//            theLaptop.updateBrandById(sc.nextInt());

//              Model update by Id
//              System.out.print("Enter Id to Update Model: ");
//              theLaptop.updateModelById(sc.nextInt());

//                Price Update by id
//                System.out.print("Enter Id to Update Price: ");
//                theLaptop.updatePriceById(sc.nextInt());

                  while(true)
                  {
                      System.out.println("Enter 1 to Add Laptop.");
                      System.out.println("Enter 2 to Find Laptop By ID.");
                      System.out.println("Enter 3 to Find Laptop By IMIE.");
                      System.out.println("Enter 4 to Delete Laptop By ID.");
                      System.out.println("Enter 5 to Delete Laptop By IMIE.");
                      System.out.println("Enter 6 to Update Brand By ID.");
                      System.out.println("Enter 7 to Update Model By ID.");
                      System.out.println("Enter 8 to Update Price By ID.");
                      System.out.println("Enter 9 to Exit.");
                      System.out.print("Enter Above Option: ");
                      int opt = sc.nextInt();
                      if (opt==9)
                      {
                          break;
                      }
                      switch (opt)
                      {
                          case 1:
                          {
                              System.out.print("Enter the Brand: ");
                              String brand = sc.nextLine();

                              System.out.print("Enter the Model: ");
                              String model = sc.nextLine();

                              System.out.print("Enter the Processor: ");
                              String processor = sc.nextLine();

                              System.out.print("Enter Laptop Type: ");
                              String type = sc.nextLine();

                              System.out.print("Enter the IMIE number: ");
                              long imie = sc.nextLong();

                              System.out.print("Enter the Price: ");
                              double price = sc.nextDouble();
                              sc.nextLine();

                              System.out.print("Enter the RAM: ");
                              int ram = sc.nextInt();
                              sc.nextLine();

                              System.out.print("Enter the ROM: ");
                              int rom = sc.nextInt();
                              sc.nextLine();
                              theLaptop.addLaptop(new Laptop(brand,model,processor,type,imie,price,ram,rom));
                              break;
                          }
                          case 2:
                          {
                              System.out.print("Enter the Laptop Id: ");
                              Laptop l1 =  theLaptop.findById(sc.nextInt());
                              System.out.println(l1);
                              break;
                          }
                          case 3:
                          {
                              System.out.print("Enter imie number to Find laptop: ");
                              Laptop l1 = theLaptop.findByImie(sc.nextLong());
                              System.out.println(l1);
                              break;
                          }
                          case 4:
                          {
                              System.out.print("Enter Laptop Id to Remove: ");
                              theLaptop.deleteById(sc.nextInt());
                              break;
                          }
                          case 5:
                          {
                              System.out.print("Enter the imie to delete Laptop Data: ");
                              theLaptop.deleteByImie(sc.nextLong());
                              break;
                          }
                          case 6:
                          {
                              System.out.print("Enter the id to update laptop: ");
                              theLaptop.updateBrandById(sc.nextInt());
                              break;
                          }
                          case 7:
                          {
                              System.out.print("Enter Id to Update Model: ");
                              theLaptop.updateModelById(sc.nextInt());
                              break;
                          }
                          case 8:
                          {
                              System.out.print("Enter Id to Update Price: ");
                              theLaptop.updatePriceById(sc.nextInt());
                              break;
                          }
                      }

                  }

        };

    }

	public static void main(String[] args) {
		SpringApplication.run(LaptopApplication.class, args);
	}

}
