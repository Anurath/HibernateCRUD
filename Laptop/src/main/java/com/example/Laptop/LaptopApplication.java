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
//
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
//                System.out.println(l1);

//            Remove by ID

//            System.out.println("Enter Laptop Id to Remove: ");
//            theLaptop.deleteById(sc.nextInt());

//            Find by Imie number

//            System.out.print("Enter imie number to remove laptop: ");
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

                  System.out.print("Enter Id to Change Laptop Information: ");
                  theLaptop.updateLaptopById(sc.nextInt());

        };

    }

	public static void main(String[] args) {
		SpringApplication.run(LaptopApplication.class, args);
	}

}
