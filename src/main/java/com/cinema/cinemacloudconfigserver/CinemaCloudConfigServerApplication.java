package com.cinema.cinemacloudconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CinemaCloudConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CinemaCloudConfigServerApplication.class, args);
    }

}
