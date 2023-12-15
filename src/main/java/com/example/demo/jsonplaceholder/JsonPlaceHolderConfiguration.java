package com.example.demo.jsonplaceholder;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JsonPlaceHolderConfiguration {

    @Bean("jsonplaceholderclient")
    CommandLineRunner commandLineRunner(JsonPlaceHolderClient jsonPlaceHolderClient)
    {
        return args -> {

            System.out.println(jsonPlaceHolderClient.getPosts().get(1));
            System.out.println("Pakistan");
        };
    }
}
