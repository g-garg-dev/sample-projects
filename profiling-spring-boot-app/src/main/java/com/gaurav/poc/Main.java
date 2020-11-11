package com.gaurav.poc;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.concurrent.LinkedBlockingQueue;

@SpringBootApplication
@ComponentScan("com.gaurav.poc")
public class Main {

    public static LinkedBlockingQueue<Integer> quu = new LinkedBlockingQueue<>();

    public static void main(String args[]) {
        ConfigurableApplicationContext run = new SpringApplicationBuilder(Main.class)
                .build().run(args);
    }
}
