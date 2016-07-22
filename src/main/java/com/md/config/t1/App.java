package com.md.config.t1;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 *
 * @author michaelmykhaylov
 */

@ComponentScan
@EnableAutoConfiguration
public class App {

    public static void main(String args[]) throws Exception{
             SpringApplication.run(App.class, args);
    }
    
}
