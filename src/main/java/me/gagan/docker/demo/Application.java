package me.gagan.docker.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import java.util.Arrays;

@SpringBootApplication
public class Application implements CommandLineRunner {

    private Environment environment;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Active profiles: " + Arrays.toString(environment.getActiveProfiles()));
    }

    @Autowired
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }
}
