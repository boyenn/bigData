package be.boyenvaesen;


import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
@EnableScheduling
public class MainContext{
   
    
    

    public static void main(String[] args) throws Exception {
        SpringApplication.run(MainContext.class, args);
    }
}