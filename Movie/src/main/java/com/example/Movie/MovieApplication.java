package com.example.Movie;

import com.example.Movie.dao.daoimpl.MoviesDAOImpl;
import com.example.Movie.entity.Movie;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Scanner;

@SpringBootApplication
public class MovieApplication {

    @Bean
    public CommandLineRunner commandLineRunner(MoviesDAOImpl theMovie)
    {
        return runner->{
            Scanner sc = new Scanner(System.in);
//            for(int i =0;i<4;i++)
//            {
//                System.out.print("Enter movie Name: ");
//                String name = sc.nextLine();
//                System.out.print("Enter movie Director Name: ");
//                String director = sc.nextLine();
//                System.out.print("Enter movie Time Duration: ");
//                String time = sc.nextLine();
//                System.out.print("Enter movie Revinue: ");
//                String revinue = sc.nextLine();
//
//                theMovie.addMovie(new Movie(name,director,time,revinue));
//            }



//            System.out.println("Enter the id To find Movie: ");
//            int id = sc.nextInt();
//            Movie m1 = theMovie.findById(id);
//            if(m1!=null)
//            {
//                System.out.println(m1);
//            }
//            else {
//                System.out.println("Movie not found!");
//            }

//            System.out.println("Enter the id To Delete The Movie: ");
//            theMovie.deleteById(sc.nextInt());

            System.out.print("Enter Movie Id To Update Movie Name: ");
            theMovie.updateNameById(sc.nextInt());

        };
    }
	public static void main(String[] args) {
		SpringApplication.run(MovieApplication.class, args);
	}

}
