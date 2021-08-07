package com.alisson.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ElectrEurekaApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElectrEurekaApiApplication.class, args);
    }

}
