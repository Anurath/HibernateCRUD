package com.example.Watch;

import com.example.Watch.dao.WatchDAO;
import com.example.Watch.entity.Watch;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Scanner;

@SpringBootApplication
public class WatchApplication {

    @Bean
    CommandLineRunner commandLineRunner(WatchDAO theWatch)
    {
        return runner->{
            Scanner sc = new Scanner(System.in);





            while (true)
            {
                System.out.println("Enter 1 For Save Watch.");
                System.out.println("Enter 2 For Find Watch.");
                System.out.println("Enter 3 For Delete Watch.");
                System.out.println("Enter 4 For Update Price of Watch.");
                System.out.println("Enter 5 For Update Type(Analog / Digital) of Watch.");
                System.out.println("Enter 6 For Update GenType(Female / Male) of Watch.");
                System.out.println("Enter 7 For Exit.");
                System.out.print("Enter the Option: ");
                int opt = sc.nextInt();
                if(opt==7)
                {
                    break;
                }
                switch (opt)
                {
                    case 1:
                    {
                        System.out.println("Enter the Name Of Watch: ");
                        String name = sc.nextLine();
                        System.out.println("Enter the Brand Of Watch: ");
                        String brand = sc.nextLine();
                        System.out.println("Enter the Type(Analog / Digital) Of Watch: ");
                        String type = sc.nextLine();
                        System.out.println("Enter the (Water resist, Mud resist etc.) type Of Watch: ");
                        String buildType = sc.nextLine();
                        System.out.println("Enter the Price Of Watch: ");
                        double price = sc.nextDouble();
                        sc.nextLine();
                        System.out.println("Enter the Gender Type(Male / Female) Of Watch: ");
                        String genType = sc.nextLine();

                        theWatch.save(new Watch(name,brand,type,buildType,price,genType));
                        break;
                    }
                    case 2:
                    {

                        System.out.println("Enter Watch Id to Find Watch: ");
                        Watch w1 = theWatch.findById(sc.nextInt());
                        if(w1!=null)
                        {
                            System.out.println(w1);
                        }
                        else {
                            System.out.print("Watch Information Not Found!");
                        }
                        break;
                    }
                    case 3:
                    {
                        System.out.print("Enter Watch Id to Delete: ");
                        theWatch.deleteById(sc.nextInt());
                        break;
                    }
                    case 4:
                    {

                        System.out.print("Enter Watch Id to Update Price: ");
                        theWatch.updatePriceById(sc.nextInt());
                        break;
                    }
                    case 5:
                    {

                        System.out.print("Enter Watch Id to Update Type(Analog / Digital): ");
                        theWatch.updateTypeById(sc.nextInt());
                        break;
                    }
                    case 6:
                    {

                        System.out.print("Enter Watch Id to Update Type(Female / Male): ");
                        theWatch.updateGenTypeById(sc.nextInt());
                        break;
                    }
                }

            }
        };
    }

	public static void main(String[] args) {
		SpringApplication.run(WatchApplication.class, args);
	}

}
