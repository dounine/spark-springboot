package org.adi.spring.spark;

import org.adi.spring.spark.examples.WordCount;
import org.apache.spark.deploy.SparkSubmit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.validation.BootstrapConfiguration;
import java.io.Serializable;

@SpringBootApplication
public class Bootstrap implements CommandLineRunner{

    @Autowired
    private WordCount wordCount;

    @Override
    public void run(String... args) throws Exception {
        wordCount.count();
    }

    public static void main(String[] args) {
        SpringApplication.run(Bootstrap.class, args);
    }

}
