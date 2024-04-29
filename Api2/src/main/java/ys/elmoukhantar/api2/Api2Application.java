package ys.elmoukhantar.api2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Api2Application {

    public static void main(String[] args) {
        SpringApplication.run(Api2Application.class, args);
    }

}
