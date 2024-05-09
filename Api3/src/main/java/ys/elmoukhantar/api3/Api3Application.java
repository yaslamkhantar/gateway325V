package ys.elmoukhantar.api3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Api3Application {

    public static void main(String[] args) {
        SpringApplication.run(Api3Application.class, args);
    }

}
